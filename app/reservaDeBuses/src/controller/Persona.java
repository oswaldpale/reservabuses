package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.PersonaDao;


public class Persona {
    
    private PersonaDao particular = new PersonaDao();
    public boolean AgregarPersona(String idCedula, String nombre, String apellido, String telefono, String email) {
       return particular.agregarPersona(idCedula, nombre, apellido, telefono, email);
    }
    public boolean modificarPersona(String idCedula, String nombre, String apellido, String telefono, String email, String tarjeta){
       return particular.modificarPersona(idCedula, nombre, apellido, telefono, email, tarjeta);
    }
    public ArrayList consultarPersona(String idCedula){
       return particular.consultarPersona(idCedula);
    }


    
    

}
