/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorMain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author JULIO
 */
public class Mensaje  extends JFrame implements ActionListener{
       JLabel mostrar;
       JButton salir;
    public Mensaje(String dato){
          setSize(1000,800);
	  setTitle("Patron Decorator Julio Cesar");
	  setLocationRelativeTo(null);
	  setLayout(null);
          mostrar=new JLabel();
          mostrar.setBounds(100, 50,700,700);
          salir= new JButton("salir");
          salir.setBounds(200,780, 90, 30); 
          mostrar.setText(dato);
          add(salir);
          add(mostrar);
          salir.addActionListener(this);
          setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==salir) {
            System.exit(0);
        }
    }

   
        
}
