package net.idk.visual;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.idk.clases.Clave;

public class MiVentana extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private TextField tf_entrada;
	private TextField tf_salida;
	
	public void forma() 
	{ 
		GridLayout g = new GridLayout(1,1);
		Label lb_entrada=new Label("ENTRADA");
		tf_entrada = new TextField("");
		Label lb_salida=new Label("SALIDA");
		tf_salida = new TextField("");
		tf_salida.setEditable(false);
		Button bt_accion = new Button("OFUSCAR");		
		setLayout(g);
		bt_accion.addActionListener(this);
		add(lb_entrada);		
		add(tf_entrada);
		add(lb_salida);
		add(tf_salida);
		add(bt_accion);
		
		pack();
		setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String entrada = tf_entrada.getText();
		Clave clave=new Clave(entrada);
		String salida = clave.getClave();
		tf_salida.setText(salida);		
	}

}
