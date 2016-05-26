package controller;


public class Persona {
    private String idCedula;
    private String nombre;
    private String apellido;
    private String email;
    private String targeta;
    private String telefono;

    public void AgregarPersona(String idCedula, String nombre, String apellido, String telefono, String email, String targeta) {
        this.idCedula = idCedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;        
        this.email = email;
        this.targeta = targeta;
        
    }

    
    

}
