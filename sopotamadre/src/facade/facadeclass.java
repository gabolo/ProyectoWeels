package facade;
import proxy_final.FolderProxy;
import proxy_final.Usuario;

public class facadeclass {
	static  Usuario user =new Usuario("daniel","esgay");
	        Reserva resv= new Reserva();
	      
	public void proxy() {
		 FolderProxy folderproxy = new FolderProxy(user);
		 folderproxy.perform();
		
	}
    
	public void singleton() {
		ProxySingleton ps;
		ps = ProxySingleton.reemplazarConstructora();
		 if(user.getUsuario().equals("daniel") && user.getContraseña().equals("esgay")){
			 ps.perform();
		      
		 }
		 }
	public void crearresv(Reserva e) {
	e=resv;	
	resv.adicionar(e);
	}

	}
