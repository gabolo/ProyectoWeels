package com.example.dakaryu.wheelsprueba;

import android.content.Intent;
import android.os.AsyncTask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private Button login;
    private EditText correo;
    private EditText contrasena;
    private float sesion;
    private View x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.iniciar);
        login.setOnClickListener(new buttonClick());


    }

    public void login(View v) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
        finish();
    }


    class buttonClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            x = v;
            InvocarServicioIniciarSesion is =  new InvocarServicioIniciarSesion();
            is.execute();
        }
    }
    private class InvocarServicioIniciarSesion extends AsyncTask<Void,Integer,Void>{
        private int progreso;
        @Override
        protected void onPreExecute() {
            progreso = 0;
        }

        @Override
        protected void onPostExecute(Void result) {
            System.out.println("Session:  "+sesion);

            if(sesion != 0){
                login(x);
            }else {

                Toast toast = Toast.makeText(getApplicationContext(), result +"ajaja" , Toast.LENGTH_SHORT);
                toast.show();
            }
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            iniciarSesion();
            return null;
        }
    }
    private void iniciarSesion() {

        correo = findViewById(R.id.usuario);
        contrasena = findViewById(R.id.contrasena);
        String cor = correo.getText().toString().trim();
        String pass = contrasena.getText().toString().trim();
        String response = "";
        try {

            URL url =  new URL("https://wheels-software.appspot.com/_ah/api/proxy/v1/ingresarAplicacion/"+cor+"/"+pass);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setReadTimeout(5000);
            con.setConnectTimeout(5000);
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestMethod("POST");
            con.setDoInput(true);
            con.setDoOutput(true);

            JSONObject postDataParams = new JSONObject();
            postDataParams.put("user", cor);
            postDataParams.put("password", pass);
            OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
            // BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));
            writer.write(postDataParams.toString());
            // writer.flush();
            writer.close();
            //os.close();
            int responseCode = con.getResponseCode();
            System.out.println("Codigo respuesta " + responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK)

            {
                String line;
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                while ((line = br.readLine()) != null) {
                    response += line;
                }
                JSONObject respu = new JSONObject(response);
                sesion = Float.parseFloat(respu.getString("sesion"));

            } else{
                response = "";
            }
            System.out.println(response);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}