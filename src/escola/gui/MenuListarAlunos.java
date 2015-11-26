package escola.gui;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import escola.model.Aluno;


public class MenuListarAlunos extends JFrame{
	public MenuListarAlunos(){
		super("MenuListarAlunos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		montar();
	}
	
	File arquivo = new File("matriculas.txt");	

	void montar() throws Exception{
		
		ObjectInputStream in= new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream("alunos.txt")));
			
	
		
		
		
		
		
		
		
	}
}
