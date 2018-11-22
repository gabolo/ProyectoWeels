/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_final;

/**
 *
 * @author ASUS PC
 */
public class Folder implements Ifolder {
   int aleatorio=0;
    @Override
    public void perform() {
    aleatorio= (int) (Math.random()*100+1);
    }

    public int getAleatorio() {
        return aleatorio;
    }

    @Override
    public String toString() {
        return "Folder{" + "aleatorio=" + aleatorio + '}';
    }

      
}
