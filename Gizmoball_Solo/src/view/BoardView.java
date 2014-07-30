package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import model.Ball;
import model.GizmoTypes;
import model.IGizmo;
import model.Model;
import model.gizmos.AbsorberGizmo;
import model.gizmos.CircleGizmo;
import model.gizmos.Gizmos;
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

	public BoardView(int w, int h, Model m) {
		// Observe changes in Model
		m.addObserver(this);
		width = w;
		height = h;
		gm = m;
		this.setBorder(BorderFactory.createLineBorder(Color.black));
	} // end of board

	// Fix on-screen size
	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g2d.transform(AffineTransform
				.getScaleInstance(getXScale(), getYScale()));
		g2d.setFont(g2d.getFont().deriveFont(
				AffineTransform.getScaleInstance(1.0 / getXScale(),
						2.0 / getYScale())));

		// Draw all the vertical lines
		for (VerticalLine vl : gm.getLines()) {
			g2d.fillRect(vl.getX(), vl.getY(), vl.getWidth(), 1);
		}

		// Draw horizontal Line
		for (HorizontalLine hl : gm.gethLines()) {
			g2d.fillRect(hl.getX(), hl.getY(), 1, hl.getHeight());
		} // end of horizontal lines

		// draw ball
		Ball b = gm.getBall();
		if (b != null) {
			g2d.setColor(b.getColour());
			int x = (int) (b.getExactX() - b.getRadius());
			int y = (int) (b.getExactY() - b.getRadius());
			int width = (int) (2 * b.getRadius());
			g2d.fillOval(x, y, width, width);
		}// end of draw ball

		// draw circle
		CircleGizmo c = gm.getCircle();
		if (c != null) {
			g2d.setColor(c.getColour());
			int width = (int) (2 * c.getRadius());
			int x = (int) (c.getExactX() - c.getRadius());
			int y = (int) (c.getExactY() - c.getRadius());
			g2d.fillOval(x, y, width, width);
		} // end of draw circle

		AbsorberGizmo a = gm.getAbsorber();
		if(a !=null){
			g2d.setColor(a.getColour());
			int dimensions = (int) ( a.getHeight() * a.getWidth());
			int x = (int) (a.getExactX() - a.getWidth());
			int y = (int) (a.getExactY() - a.getHeight());
			g2d.fillRect(x, y, dimensions, dimensions);
		} // end of iff
		
		
		
		
	} // end of paint

	private double getXScale() {
		return (double) this.getWidth() / getWidth();
	}

	private double getYScale() {
		return (double) this.getHeight() / getHeight();
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		repaint();
	}

} // end of class
