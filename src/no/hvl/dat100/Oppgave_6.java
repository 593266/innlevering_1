package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave_6 {
	 public static void main(String [] args) {  
		  int i,fakultet=1;  
		  int heltall = Integer.parseInt(showInputDialog("Tast inn poengsum: "));
		  for(i=1;i<=heltall;i++){    
		      fakultet=fakultet*i;    
		  }    
		  showMessageDialog(null, "fakultetet til " + heltall + " er: " + fakultet);
		 }  
		}