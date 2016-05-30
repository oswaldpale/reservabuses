/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.TiqueteDao;

/**
 *
 * @author JULIO
 */
public class tiquete {
       private TiqueteDao tiquete = new TiqueteDao();
    public boolean AgregarTiquete(String idtiquete,String cantidad_asiento, String precio) {
       return tiquete.agregarTiquete(idtiquete, cantidad_asiento, precio);
    }
    public boolean modificarTiqete(String idtiquete,String cantidad_asiento, String precio){
       return tiquete.modificarTiquete(idtiquete, cantidad_asiento, precio);
    }
    public ArrayList consultarTiquete(String idCedula, String idtiquete){
       return tiquete.consultarTiquete(idCedula, idtiquete);
    }


}
