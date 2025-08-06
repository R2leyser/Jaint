/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaint;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author r2leyser
 */
public class JanelaTeste extends JFrame {
	private JButton botao;

	public JanelaTeste () {
		setTitle("minha janela teste");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600); 
		setLocationRelativeTo(null);

		botao = new JButton("click me!");
		botao.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("oi!");
				
			}
			
		});

		setLayout( new FlowLayout() );
		add(botao);
			
	}

	public static void main(String[] args) {
		JanelaTeste janela = new JanelaTeste();
		janela.setVisible(true); 
	}
} 