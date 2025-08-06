/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaint;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author r2leyser
 */
public class PainelDesenho extends JPanel {

	private Linha linhaTemp;
	private List<Linha> linhas;

	private Retangulo retTemp;
	private List<Retangulo> retangulos;
	
	public void setLinhaTemp(Linha linhaTemp) {
		this.linhaTemp = linhaTemp;
	}

	public void addLinha( Linha linha ){
		linhas.add(linha); 
	}

	public void addRetangulo( Retangulo retangulo ){
		retangulos.add(retangulo); 
	}
	
	public PainelDesenho() {
		linhas = new ArrayList<>();
	}


	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
		if ( linhaTemp != null) {
			linhaTemp.desenhar(g); 
		}
		for (Linha linha : linhas) {
			linha.desenhar(g);
		}
		

		if ( retTemp != null) {
			retTemp.desenhar(g); 
		}
		for (Linha retangulo : linhas) {
			retangulo.desenhar(g);
		}
	}
	
}
