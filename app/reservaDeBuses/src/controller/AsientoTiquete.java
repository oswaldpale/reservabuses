package controller;


import javax.swing.JOptionPane;

public class AsientoTiquete {
    int idAsiento = 1;
    boolean estado[] = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
                        true, true, true, true, true, true, true, true, true, true, true, true, true, true};
    
    public boolean Consultar(int idAsiento) {
        return estado[idAsiento];
    }

    public void Asignar(int idAsiento) {
        estado[idAsiento]= false;
        JOptionPane.showMessageDialog(null, "Asiento asignado con exito");
    }
}
