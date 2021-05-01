package aula2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;

public class JFrameFlowLayout extends JFrame {

	FlowLayout layout;

	public JFrameFlowLayout() {
		//Passa o título do frame através do construtor da classe mãe
		super("Teste FlowLayout");
		initialize();
	}

	private void initialize() {
		//Define a operação de encerramento padrão do frame
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//Cria uma instancia de FlowLayout
		layout = new FlowLayout();
		//Define o layout do frame
		getContentPane().setLayout(layout);
		//Loop que adiciona botões no frame
		for (int i = 0; i < 5; i++) {
			add(new JButton("Botão- " + i));
		}
		
		//----------Definindo o alinhamento do FlowLayout-------------------
		//layout.setAlignment(FlowLayout.CENTER);
		layout.setAlignment(FlowLayout.LEFT);
		//layout.setAlignment(FlowLayout.RIGHT);
		//layout.setAlignment(FlowLayout.LEADING);
		//layout.setAlignment(FlowLayout.TRAILING);
		
		//---------Definindo o tamanho de um container----------------------
		setPreferredSize(new Dimension(400,200));
		
		//--------Definindo o espaçamento entre componentes-----------------
		layout.setHgap(10);
		layout.setVgap(10);
		
		pack();
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JFrameFlowLayout().setVisible(true);
			}
		});
	}
}
