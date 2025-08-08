/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaint.formas;

import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author r2leyser
 */
public class Poligono extends Forma {
	private int qtdPontos;
	
	public Poligono(int n){
		super();
		this.qtdPontos = n;
	}
	
	@Override
	public void desenhar(Graphics g){
		if (qtdPontos < 3){ return; }
		Polygon poligono = new Polygon(); 

		double dA = 2*Math.PI/qtdPontos;
		double dX = x2 - x1;
		double dY = y2 - y1;
		for (int i = 0; i < qtdPontos; i++) {
			poligono.addPoint(
				(int) (dX * Math.cos(dA * i) - dY * Math.sin(dA * i)) + x1, 
				(int) (dY * Math.cos(dA * i) + dX * Math.sin(dA * i)) + y1
			);
		}

		g.setColor(preenchimento);
		g.fillPolygon(poligono);
		g.setColor(contorno);
		g.drawPolygon(poligono);

	} 

	public void setQtdPontos(int qtdPontos) {
		this.qtdPontos = qtdPontos;
	}
	
}
