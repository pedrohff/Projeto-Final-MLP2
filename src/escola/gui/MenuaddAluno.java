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

public class MenuaddAluno extends JFrame{
	JLabel id;
	JLabel nome;
	JLabel email;
	JLabel idade;
	JTextField textNome;
	JTextField textEmail;
	JTextField textIdade;
	
	public MenuaddAluno(){
		super("MenuaddAluno");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		montar();
	}
	
	void montar(){
		JPanel main = new JPanel(new BorderLayout());
		
		//nome do menu
		JPanel topo = new JPanel();
		id = new JLabel("Matricular Aluno");
		topo.add(id);
		
		main.add(topo, BorderLayout.NORTH);
		
		//cadastro
		JPanel cadastro = new JPanel();
		nome = new JLabel("Nome: ");
		textNome = new JTextField("Nome completo do Aluno");
		email = new JLabel("Email: ");
		textEmail = new JTextField("a@b.com.br");
		idade = new JLabel("Idade: ");
		textIdade = new JTextField("0");
		
		cadastro.add(nome);
		cadastro.add(textNome);
		cadastro.add(email);
		cadastro.add(textEmail);
		cadastro.add(idade);
		cadastro.add(textIdade);
		
		main.add(cadastro, BorderLayout.CENTER);
		
		//conteudo da janela
		setContentPane(main);
	}
	
	/*public static void main (String[] args){
		MenuaddAluno m = new MenuaddAluno();
		m.setVisible(true);
	}*/
}
