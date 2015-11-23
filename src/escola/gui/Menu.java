package escola.gui;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import escola.model.Aluno;
import escola.model.Curso;

public class Menu extends JFrame{
	JLabel label1;
	JLabel label2;
	JTextField field1;
	JTextField field2;
	
	public ArrayList<Aluno> alunos = new ArrayList<>();
	
	public Menu(){
		super("Menu");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		montar();
	}
	
	void montar(){
		
		//painel que vai conter os elementos
		//BorderLayout para organizar os componentes em East,West,North,South,Center
		JPanel panel1 = new JPanel(new BorderLayout());
		
		//parte de cima da janela
		JPanel panel2 = new JPanel();
		
		
		//nomedaescola / topo
		String nomedaescola = "UNIPEe";
		label1 = new JLabel(nomedaescola);
		panel2.add(label1);
		
		//adiciona o painel2 dentro do painel1, no norte (no topo)
		panel1.add(panel2, BorderLayout.NORTH);
		
		
		JPanel p2 = new JPanel();
		JButton addAluno = new JButton("Matricular Aluno");
		JButton addProf = new JButton("Cadastrar professor");
		JButton listarAlunos = new JButton("Listar Alunos");
		JButton listarProf = new JButton("Listar Professores");
		JButton trancar = new JButton("Trancar curso");
		
		final Menu thisMenu = this;
		
		addAluno.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MenuaddAluno mAddaluno = new MenuaddAluno(thisMenu);
				
				mAddaluno.setVisible(true);
				
			}
		});
		
		
		p2.add(addAluno);
		p2.add(addProf);
		p2.add(listarAlunos);
		p2.add(listarProf);
		p2.add(trancar);
		
		panel1.add(p2, BorderLayout.CENTER);
		
		JPanel p3 = new JPanel();
		JButton close = new JButton("Fechar");
		p3.add(close);
		
		panel1.add(p3, BorderLayout.SOUTH);

		//diz que o painel principal eh o conteudo da janela
		setContentPane(panel1);
		//fim
	}

	public static void main(String[] args) {	
		//cria a janela
		Menu principal = new Menu();
		//mostra a janela
		principal.setVisible(true);
	}

	public void cadastrar(Aluno aluno) {
		
	} 

}
