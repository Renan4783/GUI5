package Exercicio2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercicio2 implements ActionListener {
	private JLabel jlab;

	public Exercicio2() {
		JFrame jfrm = new JFrame("Exemplo Menu");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(220, 200);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Cria um r�tulo que exibir� a sele��o feita no menu.
		jlab = new JLabel();
		// Cria a barra de menus.
		JMenuBar jmb = new JMenuBar();
		// Cria o menu File.
		JMenu jmFile = new JMenu("File");
		// Menu File tem F como seu mnem�nico
		jmFile.setMnemonic(KeyEvent.VK_F);
		// Menu Open tem a combina��o dos caracteres ALT-O como acelerador
		JMenuItem jmiOpen = new JMenuItem("Open", KeyEvent.VK_O);
		jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.ALT_DOWN_MASK));
		JMenuItem jmiClose = new JMenuItem("Close", KeyEvent.VK_C);
		jmiClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.ALT_DOWN_MASK));
		JMenuItem jmiSave = new JMenuItem("Save", KeyEvent.VK_S);
		jmiSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.ALT_DOWN_MASK));
		JMenuItem jmiExit = new JMenuItem("Exit", KeyEvent.VK_E);
		jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.ALT_DOWN_MASK));
		jmFile.add(jmiOpen);
		jmFile.add(jmiClose);
		jmFile.add(jmiSave);
		jmFile.addSeparator();
		jmFile.add(jmiExit);
		jmb.add(jmFile);
		// Cria o menu Options.
		JMenu jmOptions = new JMenu("Options");
		// Cria o submenu Colors.
		JMenu jmColors = new JMenu("Colors");
		JMenuItem jmiRed = new JMenuItem("Red");
		JMenuItem jmiGreen = new JMenuItem("Green");
		JMenuItem jmiBlue = new JMenuItem("Blue");
		jmColors.add(jmiRed);
		jmColors.add(jmiGreen);
		jmColors.add(jmiBlue);
		jmOptions.add(jmColors);
		// Cria o submenu Priority.
		JMenu jmPriority = new JMenu("PrioriTy");
		JMenuItem jmiHigh = new JMenuItem("High");
		JMenuItem jmiLow = new JMenuItem("Low");
		jmPriority.add(jmiHigh);
		jmPriority.add(jmiLow);
		jmOptions.add(jmPriority);
		// Cria o menu Reset.
		JMenuItem jmiReset = new JMenuItem("Reset");
		jmOptions.addSeparator();
		jmOptions.add(jmiReset);
		// Para finalizar, adicione o menu Op��es inteiro a barra de menus
		jmb.add(jmOptions);
		// Cria o menu Help.
		JMenu jmHelp = new JMenu("Help");
		JMenuItem jmiAbout = new JMenuItem("About");
		jmHelp.add(jmiAbout);
		jmb.add(jmHelp);
		// Adiciona ouvintes de a��o para os itens de menu.
		jmiOpen.addActionListener(this);
		jmiClose.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiExit.addActionListener(this);
		jmiRed.addActionListener(this);
		jmiGreen.addActionListener(this);
		jmiBlue.addActionListener(this);
		jmiHigh.addActionListener(this);
		jmiLow.addActionListener(this);
		jmiReset.addActionListener(this);
		jmiAbout.addActionListener(this);
		jfrm.add(jlab);
		// Adiciona a barra de menus ao frame.
		jfrm.setJMenuBar(jmb);
		// Exibe o frame.
		jfrm.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		// Obt�m o comando de a��o da sele��o feita no menu.
		String comStr = ae.getActionCommand();
		// Se o usu�rio selecionar Exit, encerra o programa.
		if (comStr.equals("Exit"))
			System.exit(0);
		// Caso contr�rio, exibe a op��o selecionada.
		jlab.setText(comStr + " Selecionado");
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Exercicio2();
			}
		});
	}
}
