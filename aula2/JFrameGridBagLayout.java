package aula2;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.List;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JFrameGridBagLayout extends JFrame {
	
	GridBagLayout layout;
	private final int noLinhas = 3;
	
	public JFrameGridBagLayout() {
		super("Teste GridBagLayout");
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setPreferredSize(new Dimension(400, 200));
		
		layout = new GridBagLayout();
		getContentPane().setLayout(layout);
		
		List lEsq = new List(noLinhas, true);
		lEsq.add("Um");
		lEsq.add("dois");
		lEsq.add("tres");
		lEsq.add("quatro");
		lEsq.add("cinco");
		lEsq.add("seis");
		lEsq.add("sete");
		
		Button add = new Button(">>");
		Button clear = new Button("clear");
		Button close = new Button("close");
		
		TextArea tDir = new TextArea("", noLinhas, 10, TextArea.SCROLLBARS_NONE);
		
		GridBagConstraints restricoes = new GridBagConstraints();
		//Define a coluna em que o componente será alocado
		restricoes.gridx = 0;
		//Define a linha em que o componente será alocado
		restricoes.gridy = 0;
		//Define o número de colunas que o componente usará
		restricoes.gridwidth = 1;
		//Define o número de linhas que o componente usará
		restricoes.gridheight = 3;
		//Utilizado para preencher o área cujo tamanho é maior que o componente
		restricoes.fill = GridBagConstraints.VERTICAL;
		
		//Adiciona o componente conforme parametrizado na instancia de GridBagConstraints
		add(lEsq, restricoes);
		
		restricoes.gridx = 2;
		add(tDir, restricoes);
		
		//Cria uma instãncia de Insets que será utilizada como margem
		Insets margens = new Insets(4, 3, 4, 3);
		restricoes.gridx = 1;
		restricoes.gridy = 0;
		restricoes.gridwidth = 1;
		restricoes.gridheight = 1;
		restricoes.fill = GridBagConstraints.BOTH;
		//Define o espaçamento interno do componente
		restricoes.ipadx = 4;
		restricoes.ipady = 4;
		//Define o espaçamento externo do componente
		restricoes.insets = margens;
		add(add, restricoes);
		
		restricoes.gridy = 1;
		add(clear, restricoes);

		restricoes.gridy = 2;
		add(close, restricoes);
		
		pack();
	}
	
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new JFrameGridBagLayout().setVisible(true);
			}
		});
	}
}
