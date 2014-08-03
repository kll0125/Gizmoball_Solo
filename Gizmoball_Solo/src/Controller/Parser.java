package Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.StringTokenizer;

import model.Model;
import model.gizmos.AbsorberGizmo;
import model.gizmos.CircleGizmo;
import model.gizmos.SquareGizmo;

public class Parser extends Observable {

	private BufferedReader fileInput;

	public Parser(String filename) throws IOException {

		fileInput = new BufferedReader(new FileReader("gizmoball.txt"));
	}

	public void readFile(String filename) throws IOException {

		ArrayList<String> gizmoballArray = new ArrayList<String>();

		Model model = new Model();

		String s = fileInput.readLine();
		StringTokenizer st = new StringTokenizer(s);

		while (s != null) {

			gizmoballArray.clear();
			while (st.hasMoreTokens() == true) {
				gizmoballArray.add(st.nextToken());
			}

			switch (gizmoballArray.get(0)) {
			case "AbsorberGizmo":

				model.getABGiz(new AbsorberGizmo(Integer.parseInt(gizmoballArray.get(2)), Integer.parseInt(gizmoballArray.get(3)), Integer.parseInt(gizmoballArray.get(4)), Integer.parseInt(gizmoballArray.get(5))));

				break;

			case "SquareGizmo":

				model.getSQGiz(new SquareGizmo(Integer.parseInt(gizmoballArray.get(0)), 0, Integer.parseInt(gizmoballArray.get(2)),Integer.parseInt(gizmoballArray.get(3))));

				break;

			case "CircleGizmo":
				model.getCGiz(new CircleGizmo(Integer.parseInt(gizmoballArray
						.get(2)), Integer.parseInt(gizmoballArray.get(3))));

				break;

			}// end of switch statement

		} // end of while

	} // end of class

} // end of class
