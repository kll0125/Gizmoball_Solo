package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;





import javax.swing.JPanel;

import Controller.RunListener;
import model.Model;

public class RunGui {

	
	private Model model ;
	private JFrame frame;
	private ActionListener listener;
	private BoardView board;
	
	public RunGui(Model m) throws IOException{
		model = m;
		listener = new RunListener(m);
	}
	
	public void createAndShowGUI(){
		
		frame = new JFrame("Gizmoball Solo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		board = new BoardView(500, 500, model);
		
		Container cp = frame.getContentPane();

		Font gf = new Font("Arial", Font.BOLD, 12);
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(4, 1));
		
		JButton button1 = new JButton("Fire");
		button1.setFont(gf);
		button1.addActionListener(listener);
		button1.setMaximumSize(new Dimension(100, 100));
		buttons.add(button1);
		
		JButton button2 = new JButton("Stop");
		button2.setFont(gf);
		button2.addActionListener(listener);
		button2.setMaximumSize(new Dimension(100, 100));
		buttons.add(button2);
		
		JButton button4 = new JButton("Load");
		button4.setFont(gf);
		button4.addActionListener(listener);
		button4.setMaximumSize(new Dimension(100, 100));
		buttons.add(button4);
		
		JButton button3 = new JButton("Quit");
		button3.setFont(gf);
		button3.addActionListener(listener);
		button3.setMaximumSize(new Dimension(100, 100));
		buttons.add(button3);
		
		
		cp.add(buttons, BorderLayout.LINE_START);
		cp.add(board, BorderLayout.CENTER);

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}// end of method
	
} // end of RunGui
