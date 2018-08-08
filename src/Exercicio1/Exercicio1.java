package Exercicio1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercicio1 implements ActionListener {
	JLabel jlab;
	JMenuItem jmiYellow;
	JMenuItem jmiPurple;
	JMenuItem jmiOrange;

	public Exercicio1() {
		JFrame jfrm = new JFrame("Exemplo de Menu Dinâmico");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(220, 200);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jlab = new JLabel();
		JMenuBar jmb = new JMenuBar();
		// Cria o menu File.
		JMenu jmFile = new JMenu("File");
		JMenuItem jmiOpen = new JMenuItem("Open");
		JMenuItem jmiClose = new JMenuItem("Close");
		JMenuItem jmiSave = new JMenuItem("Save");
		JMenuItem jmiExit = new JMenuItem("Exit");
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
		// Usa caixas de seleção para as cores. Isso permite
		// que o usuário selecione mais de uma cor. Observe
		// que inicialmente Red está selecionado.
		JCheckBoxMenuItem jmiRed = new JCheckBoxMenuItem("Red", false);
		JCheckBoxMenuItem jmiGreen = new JCheckBoxMenuItem("Green", false);
		JCheckBoxMenuItem jmiBlue = new JCheckBoxMenuItem("Blue", false);
		jmColors.add(jmiRed);
		jmColors.add(jmiGreen);
		jmColors.add(jmiBlue);
		jmOptions.add(jmColors);
		// Cria o submenu Priority
		JMenu jmPriority = new JMenu("Priority");
		// Usa botões de rádio para a definição de prioridade. Isso
		// permite que o menu exiba que prioridade está sendo usada,
		// mas também assegura que uma e somente uma prioridade
		// possa ser selecionada em um determinado momento. Observe
		// que inicialmente o botão de rádio High está pressionado.
		JRadioButtonMenuItem jmiHigh = new JRadioButtonMenuItem("High", true);
		JRadioButtonMenuItem jmiLow = new JRadioButtonMenuItem("Low", true);
		jmPriority.add(jmiHigh);
		jmPriority.add(jmiLow);
		jmOptions.add(jmPriority);
		// Cria o grupo de botões para os itens de menu de botão de rádio.
		ButtonGroup bg = new ButtonGroup();
		bg.add(jmiHigh);
		bg.add(jmiLow);
		// Cria o item de menu Reset.
		JMenuItem jmiReset = new JMenuItem("Reset");
		jmOptions.addSeparator();
		jmOptions.add(jmiReset);
		// para finalizar, adiciona o menu Options inteiro à barra de menus
		jmb.add(jmOptions);
		// Adiciona ouvintes de ação para os itens de menu.
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
		jfrm.add(jlab);
		jfrm.setJMenuBar(jmb);
		jfrm.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		// Se usuário selecionar Exit, encerra o programa.
		if (comStr.equals("Exit"))
			System.exit(0);
		// Caso contrário, exibe a opção selecionada.
		jlab.setText(comStr + " Selecionada");
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Exercicio1();
			}
		});
	}
}

