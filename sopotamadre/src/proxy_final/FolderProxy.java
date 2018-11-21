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
public class FolderProxy {
    Usuario user ;
    
    Folder f=new Folder();
    public FolderProxy(Usuario user)
    {
        this.user=user;
    }
    public void perform(){
        if(user.getUsuario().equals("daniel") && user.getContraseña().equals("esgay")){
      
       f.perform();
       System.out.println(f.toString());
        }
      
    }
}
