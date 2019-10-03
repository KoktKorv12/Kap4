import javax.swing.*;
import java.util.Scanner;
 
 public class uppgift1 {
	public static void main (String[] args) {
		double kostnad;
		kostnad = Double.parseDouble(JOptionPane.showInputDialog(null,"hur mycket kostar ditt abonnemang"));
		if (kostnad >= 1000) {
			
		kostnad = (kostnad*0.9);
		JOptionPane.showMessageDialog(null,"10% rabatt! Du behöver nu bara betala " + kostnad);
		
		
		} else {
		kostnad=(kostnad*1);
		JOptionPane.showMessageDialog(null,"Du får ingen rabatt");
		}	
	}
}