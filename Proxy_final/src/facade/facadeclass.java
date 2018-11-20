package facade;


import proxy_final.ProxySingleton;
import proxy_final.Usuario;

public class facadeclass {
	
	static  Usuario user =new Usuario("daniel","esgay");
	
	public void singleton() {
		ProxySingleton ps;
		ps = ProxySingleton.reemplazarConstructora();
		 if(user.getUsuario().equals("daniel") && user.getContraseña().equals("esgay")){
			 ps.perform();
		      
			    
	        }
		
		
	}
    
     
}
