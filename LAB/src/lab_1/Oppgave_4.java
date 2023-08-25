package lab_1;

/*
 * _
 * Vis vindu hvor bruker inputter antall sekunder
 * regn ut antall timer
 * 	sekunder // 3600 -> antall timer
 * 	sett sekunder til resten (modulo)
 * regn ut antall minutter
 * 	sekunder // 60 -> antall minutter
 * 	sett sekunder til resten (modulo)
 * resten sekunder
 * Vis vindu med timer, inutter og sekunder
 */

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Oppgave_4 {
	public static void main(String[] args) {
		  
	    String sekunderInput = showInputDialog("Gi et antall sekunder:");
	    int sekunder = parseInt(sekunderInput);
	    
	    int timer = sekunder / 3600;
	    sekunder %= 3600;
	    
	    int minutter = sekunder / 60;
	    sekunder %= 60;

	    showMessageDialog(null,
	    		sekunderInput + " sekunder tilsvarer:\n"+
	    		timer + " timer, " + minutter + " minutter, " + sekunder + " sekunder"
		);
	}
}