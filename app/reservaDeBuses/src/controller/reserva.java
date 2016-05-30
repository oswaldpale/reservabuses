/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.ReservaDao;


public class reserva {
    
    
       private ReservaDao reserva = new ReservaDao();
    public boolean AgregarReserva(String idcedula, String fecha,String idtiquete, String idpersona, String idbus, String idusuario) {
       return reserva.agregarReserva(idcedula, fecha, idtiquete, idpersona, idbus, idusuario);
    }
    public boolean modificarReserva(String idcedula, String fecha,String idtiquete, String idpersona, String idbus, String idusuario, String idviajedestino, String idviajeorigen, String estado, String idreserva){
       return reserva.modificarReserva(idcedula,fecha, idtiquete, idpersona, idbus, idusuario, idviajedestino, idviajeorigen, estado, idreserva);
    }
    public ArrayList consultarReserva(String idCedula, String idtiquete){
       return reserva.consultarReserva(idCedula, idtiquete);
    }


}
