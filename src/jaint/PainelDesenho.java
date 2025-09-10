/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaint;

import jaint.formas.Forma;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author r2leyser
 */
public class PainelDesenho extends JPanel implements KeysListener {

	private Forma formaTemp;
	private Stack<Forma> formas;
	private Stack<Forma> redoFormas;

	public void setFormaTemp(Forma formaTemp) {
		this.formaTemp = formaTemp;
	}

	public void addForma( Forma forma ){
		formas.push(forma); 
	}
	
    public void undo() {
        if (!formas.isEmpty()) {
            refazerFormas.push(formas.pop());
        }
    }

    public void redo() {
        if (!refazerFormas.isEmpty()) {
            formas.push(refazerFormas.pop());
        }
    }

	public PainelDesenho() {
		formas = new Stack<>();
        redoFormas = new Stack<>();

        setBackground(Color.WHITE);
        this.addKeyListener( new KeysHandler(this) );
        setFocusable(true);
	}

    @Override
    public void keyPressed(int keyCode) {
        if ( keyCode == KeysHandler.CTRL_Z ) {
            undo();
            repaint();
        } else if ( keyCode == KeysHandler.CTRL_Y ) {
            redo();
            repaint();
        }
    }


	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody

		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, getWidth(), getHeight());

		for (Forma forma : formas.iterator() ) {
			forma.renderizar(g);
		}
		
		if ( formaTemp != null) {
			formaTemp.renderizar(g); 
		}
		
	}
}
