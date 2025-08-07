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
public class Linha extends Forma {

	@Override
	public void desenhar(Graphics g){
		g.drawLine(x1, y1, x2, y2);
	} 
}
