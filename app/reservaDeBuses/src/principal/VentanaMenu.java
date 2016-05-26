package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import componentes.Combo;
import componentes.Refrigerio_papas;
import componentes.Refrigerio_jugos;
import decoradores.Gaseosa;
import decoradores.Chocolatina;
import decoradores.Galletas;



public class VentanaMenu extends JFrame implements ActionListener{
	
	JLabel titulo,adicionales;
	JComboBox combos;
	String arregloCombos[] = { "Seleccione","Refrigerio-Papas", 
			"Refrigerio-Jugos" };
	JTextArea area;
	private JScrollPane scroll;
	JTextArea area2;
	private JScrollPane scroll2;
	JButton aceptar,cancelar;
	JCheckBox chocolatina,gaseosa,galletas;
	static String dato1="respuesta no dato ";
	public VentanaMenu(String dato)
	{
	  
	  dato1=dato;
	  chocolatina= new JCheckBox();
	  chocolatina.setText("chocolatina");
	  chocolatina.setBounds(280, 30, 70, 25);
	  chocolatina.setEnabled(false);
		
	  gaseosa= new JCheckBox();
	  gaseosa.setText("gaseosa");
	  gaseosa.setBounds(190, 50, 70, 25);
	  gaseosa.setEnabled(false);
	  
	  galletas= new JCheckBox();
	  galletas.setText("galletas");
	  galletas.setBounds(280, 50, 70, 25);
	  galletas.setEnabled(false);
	  
	  aceptar=new JButton();
	  aceptar.setText("Enviar Pedido");
	  aceptar.setBounds(70, 320, 150, 25);
	  
	  cancelar=new JButton();
	  cancelar.setText("Salir");
	  cancelar.setBounds(230, 320, 90, 25);
		
	  titulo= new JLabel();
	  titulo.setText("MENU REFRIGERIOS");
	  titulo.setBounds(20, 10, 150, 25);
	  
	  adicionales= new JLabel();
	  adicionales.setText("Seleccione los Adicionales");
	  adicionales.setBounds(195, 10, 180, 25);
	  
	  combos= new JComboBox();
	  combos.setBounds(20, 40, 150, 25);
	  combos.setModel(new javax.swing.DefaultComboBoxModel(arregloCombos));
	  combos.addActionListener(this);
	  
	  scroll = new JScrollPane();
	  area = new JTextArea();
		area.setEditable(false);
		area.setFont(new java.awt.Font("Verdana", 0, 12));
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setBorder(javax.swing.BorderFactory.createBevelBorder(
				javax.swing.border.BevelBorder.LOWERED, null, null, null,
				new java.awt.Color(0, 0, 0)));
		scroll.setViewportView(area);
		scroll.setBounds(20, 90, 340, 60);
		
		scroll2 = new JScrollPane();
		  area2 = new JTextArea();
			area2.setEditable(false);
			area2.setFont(new java.awt.Font("Verdana", 0, 12));
			area2.setLineWrap(true);
			area2.setWrapStyleWord(true);
			area2.setBorder(javax.swing.BorderFactory.createBevelBorder(
					javax.swing.border.BevelBorder.LOWERED, null, null, null,
					new java.awt.Color(0, 0, 0)));
			scroll2.setViewportView(area2);
			scroll2.setBounds(20, 152, 340, 160);
	 
			
	  combos.addActionListener(this);
	  aceptar.addActionListener(this);
	  cancelar.addActionListener(this);
	  
	  galletas.addActionListener(this);
	  gaseosa.addActionListener(this);
	  chocolatina.addActionListener(this);

	  add(galletas);		
	  add(gaseosa);
	  add(chocolatina);		
	 
	  add(cancelar);
	  add(aceptar);
	  add(scroll);
	  add(scroll2);
	  add(adicionales);
	  add(titulo);
	  add(combos);
	  
	  setSize(400,390);
	  setTitle("Patron Decorator Julio Cesar");
	  setLocationRelativeTo(null);
	  setLayout(null);

	}



	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==aceptar)
		{
			if (combos.getSelectedIndex()==1) 
			{
				Combo comboBasico=new Refrigerio_papas();
				area.setText(comboBasico.getDescripcion());
				enviarPedido(comboBasico);
			}
			else if (combos.getSelectedIndex()==2) 
			{
				Combo comboFamiliar=new Refrigerio_jugos();
				area.setText(comboFamiliar.getDescripcion());
				enviarPedido(comboFamiliar);
			}
			
			else{
				JOptionPane.showMessageDialog(null, "No ha realizado " +
						"ningun pedido","Advertencia!!!",JOptionPane.WARNING_MESSAGE);
			}
		}
		if (e.getSource()==cancelar)
		{
                    String mostrar=""+dato1+"\n\n\n"+area2.getText().toString();
                    Mensaje x= new Mensaje(mostrar);                  
                    this.dispose();
	           
		}
		if (e.getSource()==combos)
		{
			verificaSeleccion();
			
		}
	}

	
	private void enviarPedido(Combo combo)
	{
			if (galletas.isSelected())
			{
				combo=new Galletas(combo);
			}
			if (gaseosa.isSelected())
			{
				combo=new Gaseosa(combo);
			}
			if (chocolatina.isSelected())
			{
				combo=new Chocolatina(combo);
			}
			
		area2.setText("Su Pedido: \n"+combo.getDescripcion()+"\n\n" +	"Valor:\n $"+combo.valor());	
	}

	/**
	 * Valida la seleccion realizada y envia la correspondiente
	 * descripcion al area de texto
	 */
	private void verificaSeleccion() {
		if (combos.getSelectedIndex()!=0)
		{
			habilitar(true);
			if (combos.getSelectedIndex()==1) 
			{
				area.setText("Paquete de papas Margarita x 30g, mas sobre de salsa tartara x 2g (Refrigerio grtis)");
				area2.setText("");
			}
			
			else if (combos.getSelectedIndex()==2) 
			{
				area.setText("Jugo Hit x 200ml " +"sabor aleatorio mas pitillo (Refrigerio grtis) ");
				area2.setText("");
			}
			
		}
		else{
			area.setText("");
			area2.setText("");
			habilitar(false);
		}
			
	}



	private void habilitar(boolean b) 
	{
		
		galletas.setEnabled(b);
		gaseosa.setEnabled(b);
		chocolatina.setEnabled(b);
		
		galletas.setSelected(false);
		gaseosa.setSelected(false);
		chocolatina.setSelected(false);
	}


}
