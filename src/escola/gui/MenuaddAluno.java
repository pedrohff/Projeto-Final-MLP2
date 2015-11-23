package escola.gui;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import escola.model.Aluno;
import escola.model.Curso;

public class MenuaddAluno extends JFrame{
	JLabel id;
	JLabel nome;
	JLabel rg;
	JLabel idade;
	JTextField textNome;
	JTextField textRg;
	JTextField textIdade;
	
	Menu menu;
	
	public MenuaddAluno(Menu menu){
		super("MenuaddAluno");
		this.menu = menu;
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
		rg = new JLabel("RG: ");
		textRg = new JTextField("0000000");
		idade = new JLabel("Idade: ");
		textIdade = new JTextField("0");
		
		cadastro.add(nome);
		cadastro.add(textNome);
		cadastro.add(rg);
		cadastro.add(textRg);
		cadastro.add(idade);
		cadastro.add(textIdade);
		
		
		main.add(cadastro, BorderLayout.CENTER);
		
		//fechar
		JPanel bottom = new JPanel();
		JButton cadastrar = new JButton("Cadastrar");
		JButton cancelar = new JButton("Cancelar");
		bottom.add(cadastrar);
		bottom.add(cancelar);
		
		cadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.cadastrar(new Aluno(textNome.getText(), Integer.parseInt(textRg.getText()) , Integer.parseInt(textIdade.getText()), menu.alunos.size(), true));
			}
		});
		
		cancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		
		main.add(bottom, BorderLayout.SOUTH);
		//conteudo da janela
		setContentPane(main);
	}
	
	/*public static void main (String[] args){
		MenuaddAluno m = new MenuaddAluno();
		m.setVisible(true);
	}*/
}
