/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaint;

import jaint.formas.Forma;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author r2leyser
 */
public class PainelDesenho extends JPanel {

	private Forma formaTemp;
	private List<Forma> formas;

	public void setFormaTemp(Forma formaTemp) {
		this.formaTemp = formaTemp;
	}

	public void addForma( Forma forma ){
		formas.add(forma); 
	}
	
	public PainelDesenho() {
		formas = new ArrayList<>();
	}


	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody

		if ( formaTemp != null) {
			formaTemp.desenhar(g); 
		}
		for (Forma forma : formas) {
			forma.desenhar(g);
		}
		
	}
}
