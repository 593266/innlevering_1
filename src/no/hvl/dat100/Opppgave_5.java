package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Opppgave_5 {

	public static void main(String [] args) {
		

	int Error = 100;
	int A = 90;
	int B = 80;
	int C = 60;
	int D = 50;
	int E = 40;
	int F = 0;
	int Errornegativ = 0;
	
	for (int i=0;i<=9;i++) {
		Double poengsum = Double.parseDouble(showInputDialog("Tast inn poengsum: "));

	if (poengsum >= A && poengsum <= Error) {
	showMessageDialog(null, "Du fikk karakter A");

	}
	else if (poengsum < A && poengsum >=B) {
		showMessageDialog(null, "Du fikk karakter B");

	}
	else if (poengsum < B && poengsum >=C) {
		showMessageDialog(null, "Du fikk karakter C");

	}
	else if (poengsum < C && poengsum >=D) {
		showMessageDialog(null, "Du fikk karakter D");

	}
	else if (poengsum < D && poengsum >=E) {
	showMessageDialog(null, "Du fikk karakter E");

	}
	else if (poengsum < E && poengsum >=F) {
		showMessageDialog(null, "Du fikk karakter F");
	}
	else if (poengsum < Errornegativ || poengsum > Error) {
		showMessageDialog(null, "Error. Ugyldig poengsum");
		i--;
		}
	}
	}
}
