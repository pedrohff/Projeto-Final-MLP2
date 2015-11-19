package escola.gui;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuCurso extends JFrame{
	JLabel idTitulo;
	JLabel nomeprof;
	JLabel rg;
	JLabel idade;
	JLabel nomeCurso;
	JLabel idCurso;
	JTextField textNp;
	JTextField textRg;
	JTextField textIdade;
	JTextField textNcurso;
	JTextField textId;
	
	public MenuCurso(){
		super("MenuCurso");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		montar();
	}
	
	void montar(){
		JPanel main = new JPanel();
		
		//titulo
		JPanel titulo = new JPanel();
		 idTitulo = new JLabel("Alterar info Curso");
		 titulo.add(idTitulo);
		 
		 main.add(titulo);
		 
		 //menu
		 JPanel info = new JPanel();
		 
		 nomeprof = new JLabel("Nome do Professor: ");
		 rg = new JLabel("RG: ");
		 idade = new JLabel("Idade: ");
		 nomeCurso = new JLabel("Nome do Curso: ");
		 idCurso = new JLabel("ID do Curso: ");
		 
		 textNp = new JTextField("Nome + Sobrenome");
		 textRg = new JTextField("0000000");
		 textIdade = new JTextField("--");
		 textNcurso = new JTextField("Nome");
		 textId = new JTextField("--");
		 
		 info.add(nomeprof);
		 info.add(textNp);
		 info.add(rg);
		 info.add(textRg);
		 info.add(idade);
		 info.add(textIdade);
		 info.add(nomeCurso);
		 info.add(textNcurso);
		 info.add(idCurso);
		 info.add(textId);
		 
		 main.add(info, BorderLayout.CENTER);
		 
		 setContentPane(main);
	}
	
}
