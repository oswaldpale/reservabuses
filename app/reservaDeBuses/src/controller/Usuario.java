/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.UsuarioDao;

/**
 *
 * @author ing christian
 */
public class Usuario {
     private UsuarioDao particular = new UsuarioDao();
    
     public ArrayList consultarPersona(String idCedula){
       return particular.consultarUsuario(idCedula);
    }

}
