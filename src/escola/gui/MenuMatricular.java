package escola.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import escola.model.Curso;
import escola.model.Matricula;
import escola.model.Aluno;

public class MenuMatricular extends JFrame{
	
	Menu menu;
	public MenuMatricular (Menu menu){
		super("Matricular");
		this.menu=menu;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		montar();
	}
	
	void montar(){
		JPanel main = new JPanel(new BorderLayout());
		
		//titulo
		JLabel titulo = new JLabel("Matricular Aluno");		
		JPanel top = new JPanel();
		top.add(titulo);
		
		main.add(top, BorderLayout.NORTH);
		
		//meio
		
		JPanel meio = new JPanel();
		
		JLabel idCurso = new JLabel("ID do curso: ");
		JLabel matriculaAluno = new JLabel("Matricula do Aluno");
		JTextField textId = new JTextField(" 00");
		JTextField textMatricula = new JTextField(" 0000");
		
		meio.add(idCurso);
		meio.add(textId);
		meio.add(matriculaAluno);
		meio.add(textMatricula);
		
		main.add(meio, BorderLayout.CENTER);
		
		//botoes
		JPanel bottom = new JPanel();
		
		JButton matricular = new JButton("Matricular");
		JButton voltar = new JButton("Voltar");
		
		
		File file = null;
		matricular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					menu.matricular(new Matricula (Integer.parseInt(textId.getText()), Integer.parseInt(textMatricula.getText())));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				
			}
		});
		
		bottom.add(matricular);
		bottom.add(voltar);
		
		main.add(bottom, BorderLayout.SOUTH);
		
		
		
		
		
		setContentPane(main);
	}
}
