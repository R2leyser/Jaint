/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaint.formas;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author r2leyser
 */
public abstract class Forma {
	protected int x1;	
	protected int y1;	
	protected int x2;	
	protected int y2;	

	protected Color contorno; 
	protected Color preenchimento;
	
	public Forma() {
		this.contorno = Color.BLACK;
		this.preenchimento = Color.WHITE;
	}
	
	public void renderizar(Graphics g){
		g = g.create();

		this.desenhar(g);

		g.dispose();
	}

	public abstract void desenhar(Graphics g);

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void setContorno(Color contorno) {
		this.contorno = contorno;
	}

	public void setPreenchimento(Color preenchimento) {
		this.preenchimento = preenchimento;
	}
}
