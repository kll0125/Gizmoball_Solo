package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.io.IOException;

import javax.swing.Timer;

import model.Model;
import Controller.Parser;


public class RunListener extends MouseAdapter implements KeyListener, ActionListener {

	private Timer timer;
	private Model model;
	private Parser parser;
	
	public RunListener(Model m) throws IOException {
		model = m;
		timer = new Timer(50, this);
		parser = new Parser(null);
	}
	
	@Override
	public void actionPerformed(final ActionEvent e) {
		// TODO Auto-generated method stub
		 if (e.getSource() == timer){
			 model.moveBall();
		 } else 
			  switch (e.getActionCommand()){
			  case "Fire" :
				  timer.start();
				  break;
			  case "Stop":
				  timer.stop();
				  break;
			  case "Load":
				  // do the load stuff here
				  try {
					parser.readFile("gizmoball.txt");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				  break;
			  case "Quit":
				  System.exit(0);
				  break;
			  }// end of switch 
		
	} // end of method

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		if(e.getKeyCode()==KeyEvent.VK_C){;
			System.out.println("TRIGGER PRESSED!!!");
		}
	} ///

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int keynum = e.getKeyCode();
		
		if((keynum >= 65) && (keynum <=91)){
			
		}
		
	} 

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

} //end of class
