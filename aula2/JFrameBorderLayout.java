package aula2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class JFrameBorderLayout extends JFrame {
	
	BorderLayout layout;
	
	public JFrameBorderLayout() {
		//Nomeia o frame através do construtor da classe mãe
		super("Teste BorderLayout");
		initialize();
	}

	private void initialize() {
		//Define a operação de encerramento padrão do frame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//Aplica o BorderLayout
		layout = new BorderLayout();
		getContentPane().setLayout(layout);
		
		//Define o tamanho do frame
		setPreferredSize(new Dimension(600, 600));
		
		//Define o espaçamento entre os componentes
		layout.setHgap(5);
		layout.setVgap(5);
		
		//Adiciona os componentes na área especifica do Layout
		JButton norte = new JButton("NORTE");
		norte.setOpaque(true);
		norte.setBackground(Color.black);
		norte.setForeground(Color.white);
		add(norte, BorderLayout.NORTH);
		add(new JButton("SUL"), BorderLayout.SOUTH);
		add(new JButton("LESTE"), BorderLayout.EAST);
		add(new JButton("OESTE"), BorderLayout.WEST);
		JLabel lb1 = new JLabel("Um texto no centro");
		lb1.setForeground(Color.blue);
		add(lb1, BorderLayout.CENTER);
		
		pack();
	}
	
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new JFrameBorderLayout().setVisible(true);
			}
		});
	}
}
