/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.CiudadDao;


public class Ciudad {
    private CiudadDao particular = new CiudadDao();
     public ArrayList consultarCiudad(){
       return particular.consultarCiudad();
    }
}
