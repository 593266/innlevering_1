package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave_4 {

	public static void main(String [] args) {
	
		int prosent = 100;
		double trinn_0 = 0.0/prosent;
		double trinn_1 = 0.93/prosent;
		double trinn_2 = 2.41/prosent;
		double trinn_3 = 11.52/prosent;
		double trinn_4 = 14.52/prosent;
		
		double trinn0 = 164100;
		double trinn1 = 230950;
		double trinn2 = 580650;
		double trinn3 = 934050;
		
		double lønn1 = Double.parseDouble(showInputDialog("Tast inn din brutto lønn:"));
		
		double trinnskatt = 0;
		
		if (lønn1 <= trinn0) {
			trinnskatt = (lønn1 * trinn_0);
		
		}
		else if (lønn1 >= trinn0 && lønn1 <= trinn1) {
			trinnskatt = (lønn1 * trinn_1);
		
		}
		else if (lønn1 >= trinn1 && lønn1 <= trinn2) {
			trinnskatt = (lønn1 * trinn_2);
		
		}
		else if (lønn1 >= trinn2 && lønn1 <= trinn3) {
			trinnskatt = (lønn1 * trinn_3);
		
		}
		else if (lønn1 >= trinn3) {
			trinnskatt = (lønn1 * trinn_4);
		}
		showMessageDialog(null, "Du må betale " + trinnskatt + " kroner i skatt");
		
		}
	}