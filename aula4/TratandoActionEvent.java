package aula4;

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class TratandoActionEvent extends JFrame {
	private JLabel lbValor;
	private JTextField tfValor;
	private JButton btIncrementa, btZera;

	public TratandoActionEvent() {
		super("Tratando Action Event");
		iniciar();
	}

	private void iniciar() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(300, 200));

		GridBagLayout layout = new GridBagLayout();
		getContentPane().setLayout(layout);

		GridBagConstraints restricoes = new GridBagConstraints();

		// JLabel valor
		lbValor = new JLabel("Valor:");
		lbValor.setAlignmentX(RIGHT_ALIGNMENT);
		restricoes.gridx = 0;
		restricoes.gridy = 0;
		restricoes.gridheight = 1;
		restricoes.gridheight = 2;
		restricoes.fill = GridBagConstraints.HORIZONTAL;
		add(lbValor, restricoes);

		// Cria a margem dos botões
		Insets margens = new Insets(4, 4, 4, 4);

		// JTextField valor
		tfValor = new JTextField(5);
		tfValor.setHorizontalAlignment(JTextField.RIGHT);
		restricoes.gridx = 1;
		restricoes.insets = margens;
		add(tfValor, restricoes);

		// Botão Incrementa
		btIncrementa = new JButton("Incrementa");
		restricoes.gridx = 2;
		restricoes.gridheight = 1;
		add(btIncrementa, restricoes);

		// Botão Zera
		btZera = new JButton("Zera");
		restricoes.gridy = 1;
		add(btZera, restricoes);
		
		definirEventos();

		pack();
	}
	
	public void incrementa() {
		try {
			Integer valorAtual = Integer.parseInt(tfValor.getText());
			Integer valorIncrementado =  valorAtual + 1;
			tfValor.setText(valorIncrementado.toString());
		} catch (NumberFormatException ex) {
			zera();
		}
	}

	private void zera() {
		tfValor.setText("0");
	}
	
	private void definirEventos() {
		//ActionEvent-----------------------------
		btIncrementa.addActionListener((ActionEvent e) -> {
			incrementa();
		});
		
		btZera.addActionListener((ActionEvent e) -> {
			zera();
		});
		
		//WindowEvent---------------------------------
		this.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "O programa foi iniciado");
			}

			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "O programa está sendo encerrado");
			}

			@Override
			public void windowIconified(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "O programa fo minimizado");
			}

			@Override
			public void windowActivated(WindowEvent e) {
				//JOptionPane.showMessageDialog(null, "O mouse está sobre a janela");
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				//JOptionPane.showMessageDialog(null, "Ei, Volte aqui!");
			}

			@Override
			public void windowClosed(WindowEvent e) {
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "O programa foi restaurado");
			}
		});
		
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new TratandoActionEvent().setVisible(true);
			}
		});
	}

}
