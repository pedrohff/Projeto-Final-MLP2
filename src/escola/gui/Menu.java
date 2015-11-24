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

import java.io.*;

public class Menu extends JFrame{
	JLabel label1;
	JLabel label2;
	JTextField field1;
	JTextField field2;
	
	public ArrayList<Aluno> alunos = new ArrayList<>();
	public ArrayList<Curso> cursos = new ArrayList<>();
	
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
		String nomedaescola = "UNIPE";
		label1 = new JLabel(nomedaescola);
		panel2.add(label1);
		
		//adiciona o painel2 dentro do painel1, no norte (no topo)
		panel1.add(panel2, BorderLayout.NORTH);
		
		
		JPanel p2 = new JPanel();
		JButton cadastrarAluno = new JButton("Cadastrar Aluno");
		JButton criarCurso = new JButton("Criar Curso");
		JButton matricularAlunos = new JButton("Matricular Alunos");
		JButton infoCurso = new JButton("Info Curso");
		JButton trancar = new JButton("Trancar curso");
		
		final Menu thisMenu = this;
		
		//abrir menu adicionar aluno
		cadastrarAluno.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MenuaddAluno mAddaluno = new MenuaddAluno(thisMenu);
				
				mAddaluno.setVisible(true);
				
			}
		});
		
		//abrir menu adicionar curso
		criarCurso.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MenuaddCurso mAddcurso = new MenuaddCurso(thisMenu);
				
				mAddcurso.setVisible(true);
			}
		});
		
		
		p2.add(cadastrarAluno);
		p2.add(criarCurso);
		p2.add(matricularAlunos);
		p2.add(infoCurso);
		p2.add(trancar);
		
		panel1.add(p2, BorderLayout.CENTER);
		
		JPanel p3 = new JPanel();
		JButton close = new JButton("Fechar");
		p3.add(close);
		
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		panel1.add(p3, BorderLayout.SOUTH);

		//diz que o painel principal eh o conteudo da janela
		setContentPane(panel1);
		//fim
	}
	
	
	
	public void addAluno (Aluno aluno) throws Exception{
		FileOutputStream fout= new FileOutputStream ("alunos.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(aluno);
		fout.close();
	}

	public void cadastrarAluno(Aluno aluno) throws Exception{
		alunos.add(aluno);
		addAluno(aluno);
	} 
	
	public void salvarCurso(Curso curso) throws Exception{
		FileOutputStream fout= new FileOutputStream ("cursos.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(curso);
		fout.close();
	}
	
	public void criarCurso(Curso curso) throws Exception{
		cursos.add(curso);
		salvarCurso(curso);
	}
	
	public void matricular(int idCurso, int matriculaAluno, File file){
		
	}
	
	
	
	
	public Aluno buscarAluno(int matricula){
		for(Aluno aluno : alunos){
			if(aluno.getMatricula() == matricula){
				return aluno;
			}
		}
		return null;
	}
	
	public Curso buscarCurso(int id){
		for(Curso curso : cursos){
			if(curso.getId() == id){
				return curso;
			}
		}
		return null;
	}

}
