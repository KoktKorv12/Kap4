import javax.swing.*;
import java.util.Scanner;
 
 public class uppgift3 {
	public static void main (String[] args) {
		double score;
		
		score = Double.parseDouble(JOptionPane.showInputDialog(null,"Hur många poäng fick du på provet"));
		
		if (score > 50) {
            JOptionPane.showMessageDialog(null, score + " Är ett ogiltigt antal poäng"); 
        } else if (score >= 45){
            JOptionPane.showMessageDialog(null, "Betyg: A");
            } else if (score >= 40){
            JOptionPane.showMessageDialog(null, "Betyg: B");
            } else if (score >= 35){
            JOptionPane.showMessageDialog(null, "Betyg: C");
            } else if (score >= 30){
            JOptionPane.showMessageDialog(null, "Betyg: D");
            } else if (score <= 25){
            JOptionPane.showMessageDialog(null, "Betyg: E");
            } else if (score < 25){
            JOptionPane.showMessageDialog(null, "Betyg: F");
        }
    }
}