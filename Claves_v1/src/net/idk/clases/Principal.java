package net.idk.clases;

import net.idk.visual.MiVentana;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MiVentana pagina=new MiVentana();
		pagina.forma();	
		pagina.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent we){
				System.exit(0);
			}
		});
	}	
}
