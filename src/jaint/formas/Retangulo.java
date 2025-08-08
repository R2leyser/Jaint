/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaint.formas;

import java.awt.Graphics;

/**
 *
 * @author r2leyser
 */
public class Retangulo extends Forma {
	public void desenhar(Graphics g){
		int x1d = x1 < x2 ? x1 : x2;
		int y1d = y1 < y2 ? y1 : y2;

		int x2d = x2 < x1 ? x1 : x2;
		int y2d = y2 < y1 ? y1 : y2;
	
		g.setColor(preenchimento);
		g.fillRect(x1d, y1d, x2d-x1d, y2d-y1d);
		g.setColor(contorno);
		g.drawRect(x1d, y1d, x2d-x1d, y2d-y1d);
	}
}
