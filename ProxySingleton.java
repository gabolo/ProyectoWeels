package com.example.echo;

public class ProxySingleton {
	private static ProxySingleton unicaInstancia = null;
	
	  
	 public ProxySingleton()
	    {
	       
	    }

	public static ProxySingleton reemplazarConstructora() {

	if (unicaInstancia == null)

	unicaInstancia = new ProxySingleton();

	return unicaInstancia;

	}
	
    Folder f=new Folder();
    
  
   public void perform(){
      
       f.perform();
       System.out.println(f.toString());
   }
}
