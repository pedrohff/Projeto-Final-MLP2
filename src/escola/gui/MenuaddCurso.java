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

import escola.model.Curso;

public class MenuaddCurso extends JFrame{
	JLabel idTitulo;
	JLabel nomeCurso;
	JLabel idCurso;
	JLabel periodoCurso;
	JTextField textNcurso;
	JTextField textId;
	JTextField textPeriodo;
	
	Menu menu;
	public MenuaddCurso(Menu menu){
		super("MenuCurso");
		this.menu=menu;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		montar();
	}
	
	void montar(){
		JPanel main = new JPanel(new BorderLayout());
		
		//titulo
		JPanel titulo = new JPanel();
		 idTitulo = new JLabel("Criar curso");
		 titulo.add(idTitulo);
		 
		 main.add(titulo, BorderLayout.NORTH);
		 
		 //menu
		 JPanel info = new JPanel();
		 
		 //parte do meio
		 nomeCurso = new JLabel("Nome do Curso: ");
		 idCurso = new JLabel("ID do Curso: ");
		 periodoCurso = new JLabel("Periodo do Curso: ");
		 textNcurso = new JTextField("Nome");
		 textId = new JTextField("--");
		 textPeriodo = new JTextField("001");

		 
		 //adicionar no menu
		 info.add(nomeCurso);
		 info.add(textNcurso);
		 info.add(idCurso);
		 info.add(textId);
		 info.add(periodoCurso);
		 info.add(textPeriodo);
		 
		 main.add(info, BorderLayout.CENTER);
		 
		 //botoes (parte de baixo)
		 JPanel bottom = new JPanel();
		 JButton criar = new JButton("Criar Curso");
		 JButton voltar = new JButton("Voltar");
		 
		 criar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					menu.criarCurso(new Curso(Integer.parseInt(textId.getText()), textNcurso.getText(), Integer.parseInt(textPeriodo.getText()) ));
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
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		 
		 
		 bottom.add(criar);
		 bottom.add(voltar);
		 
		 main.add(bottom, BorderLayout.SOUTH);
		 
		 setContentPane(main);
	}
	
}
