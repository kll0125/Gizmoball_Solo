package main;

import javax.swing.UIManager;

import view.RunGui;
import model.Model;
import model.gizmos.HorizontalLine;
import model.gizmos.VerticalLine;

/**
 * @author Nadey Ali
 */
public class Main {
	
	public static void main(String[] args){
		
		try {
			// Use the platform look and feel
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Look and Feel error in Main");
		}
		
		Model model = new Model();
		
		model.setBallSpeed(200, 200);
		
		

				// Vertical line at 
				model.addLine(new VerticalLine(1, 25, 500));
				model.addLine(new VerticalLine(1, 50, 500));
				model.addLine(new VerticalLine(1, 75, 500));
				model.addLine(new VerticalLine(1, 100, 500));
				model.addLine(new VerticalLine(1, 125, 500));
				model.addLine(new VerticalLine(1, 150, 500));
				model.addLine(new VerticalLine(1, 175, 500));
				model.addLine(new VerticalLine(1, 200, 500));
				model.addLine(new VerticalLine(1, 225, 500));
				model.addLine(new VerticalLine(1, 250, 500));
				model.addLine(new VerticalLine(1, 275, 500));
				model.addLine(new VerticalLine(1, 300, 500));
				model.addLine(new VerticalLine(1, 325, 500));
				model.addLine(new VerticalLine(1, 350, 500));
				model.addLine(new VerticalLine(1, 375, 500));
				model.addLine(new VerticalLine(1, 400, 500));
				model.addLine(new VerticalLine(1, 425, 500));
				model.addLine(new VerticalLine(1, 450, 500));
				model.addLine(new VerticalLine(1, 475, 500));
				model.addLine(new VerticalLine(1, 500, 500));
				
				//Draw horizontal Line 
				model.addHLine(new HorizontalLine(25, 1, 500));
				model.addHLine(new HorizontalLine(50, 1, 500));
				model.addHLine(new HorizontalLine(75, 1, 500));
				model.addHLine(new HorizontalLine(100, 1, 500));
				model.addHLine(new HorizontalLine(125, 1, 500));
				model.addHLine(new HorizontalLine(150, 1, 500));
				model.addHLine(new HorizontalLine(175, 1, 500));
				model.addHLine(new HorizontalLine(200, 1, 500));
				model.addHLine(new HorizontalLine(225, 1, 500));
				model.addHLine(new HorizontalLine(250, 1, 500));
				model.addHLine(new HorizontalLine(275, 1, 500));
				model.addHLine(new HorizontalLine(300, 1, 500));
				model.addHLine(new HorizontalLine(325, 1, 500));
				model.addHLine(new HorizontalLine(350, 1, 500));
				model.addHLine(new HorizontalLine(375, 1, 500));
				model.addHLine(new HorizontalLine(400, 1, 500));
				model.addHLine(new HorizontalLine(425, 1, 500));
				model.addHLine(new HorizontalLine(450, 1, 500));
				model.addHLine(new HorizontalLine(475, 1, 500));
				model.addHLine(new HorizontalLine(500, 1, 500));
			
				RunGui gui = new RunGui(model);
				gui.createAndShowGUI();
		
	} // end of main
}// end of Main class 
