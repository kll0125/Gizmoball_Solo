package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import javax.swing.Timer;

import model.Model;


public class RunListener extends MouseAdapter implements KeyListener, ActionListener {

	private Timer timer;
	private Model model;
	
	public RunListener(Model m) {
		model = m;
		timer = new Timer(50, this);
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
		
	} ///

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
	
} //end of class
