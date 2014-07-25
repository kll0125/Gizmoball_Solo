package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import model.Ball;
import model.IGizmo;
import model.Model;
import model.gizmos.AbsorberGizmo;
import model.gizmos.HorizontalLine;
import model.gizmos.VerticalLine;

public class BoardView extends JPanel implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected int width;
	protected int height;
	protected Model gm;

	// list of gizmo's
	private List<IGizmo> Gizmos;

	public BoardView(int w, int h, Model m) {

		Gizmos = new ArrayList<IGizmo>();

		// Observe changes in Model
		m.addObserver(this);
		width = w;
		height = h;
		gm = m;
		this.setBorder(BorderFactory.createLineBorder(Color.black));
	} // end of board

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	// Fix onscreen size
	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}

	public List<IGizmo> getGizmos() {
		return Gizmos;
	}

	public IGizmo getGizmoPos(int xPos, int yPos) {
		for (IGizmo gizmo : Gizmos) {
			if (xPos >= gizmo.getXpos()
					&& xPos < gizmo.getXpos() + gizmo.getWidth()
					&& yPos >= gizmo.getYpos()
					&& yPos < gizmo.getYpos() + gizmo.getHeight()) {
				return gizmo;
			}
		}

		return null;
	} // end of IGizmo

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		// Draw all the vertical lines
		for (VerticalLine vl : gm.getLines()) {
			g2.fillRect(vl.getX(), vl.getY(), vl.getWidth(), 1);
		}

		// Draw horizontal Line
		for (HorizontalLine hl : gm.gethLines()) {
			g2.fillRect(hl.getX(), hl.getY(), 1, hl.getHeight());
		} // end of horizontal lines

		Ball b = gm.getBall();
		if (b != null) {
			g2.setColor(b.getColour());
			int x = (int) (b.getExactX() - b.getRadius());
			int y = (int) (b.getExactY() - b.getRadius());
			int width = (int) (2 * b.getRadius());
			g2.fillOval(x, y, width, width);
		}

/*		// draw Absorber Gizmo with width, height , x and y
		// not too sure about this, drawing shapes are bigger than 1 cell atm
		Rectangle2D.Double rect = new Rectangle2D.Double(getX(), getY(),
				getWidth(), getHeight());
		g2.setColor(Color.RED);
		g2.fill(rect);
		g2.draw(rect);

		// draw Circle Gizmo
		//again not too sure about this
		Ellipse2D.Double circle = new Ellipse2D.Double(getX(), getY(),
				getWidth(), getHeight());
		g2.setColor(Color.BLUE);
		g2.fill(circle);
		g2.draw(circle);
		
		//draw Square Gizmo
		Rectangle2D.Double Sqrect = new Rectangle2D.Double(getX(), getY(),
				getWidth(), getHeight());
		g2.setColor(Color.GREEN);
		g2.fill(Sqrect);
		g2.draw(Sqrect);*/
		
		

	} // end of paintComponent

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		repaint();
	}

} // end of class
