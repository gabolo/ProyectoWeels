/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.echo;

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
        if(user.getUsuario().equals("daniel") && user.getContrasena().equals("esgay")){
      
       f.perform();
       System.out.println(f.toString());
        }
      
    }
}
