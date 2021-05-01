package aula2;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class JFrameGridLayout extends JFrame {
	
	GridLayout layout;
	
	public JFrameGridLayout() {
		super("Teste GridLayout");
		initialize();
	}

	private void initialize() {
		//Ação padrão de encerramento do frame--------------
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//Define o tamanho do frame-------------------------
		setPreferredSize(new Dimension(400, 200));
		
		//Define o Gerenciador de Layout--------------------
		layout = new GridLayout(3, 5);
		getContentPane().setLayout(layout);
		
		//Adiciona os botões
		for (int i = 1; i <= 10; i++) {
			add(new JButton("Botão " + i));
		}
		
		pack();
	}
	
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new JFrameGridLayout().setVisible(true);
			}
		});
	}
}
