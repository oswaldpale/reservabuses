package controller;

import java.util.ArrayList;
import model.ViajeDao;


public class Viaje {

  
   private ViajeDao particular = new ViajeDao();
    public boolean AgregarViaje(String idviaje, String fecha, String idreserva, String ciudadorigen, String ciudaddestino, String precio) {
       return particular.agregarViaje(idviaje,  fecha,  idreserva,  ciudadorigen,  ciudaddestino,  precio);
    }
 
    public ArrayList consultarViaje(String idviaje, String fecha, String idreserva, String ciudadorigen, String ciudaddestino, String precio){
       return particular.consultarViaje(idviaje,  fecha,  idreserva,  ciudadorigen,  ciudaddestino,  precio);
    }
}