import javax.swing.JOptionPane;
//import java.lang.Double;

public class JOptionPaneUebung2 {
	
	public static void main(String[] args){
		
		String eingabe = JOptionPane.showInputDialog("Bitte Zahl (1 , 2 oder 3) eingeben: \n1: Berechnung der Quadratwurzel\n2: nat. Logarithmus\n3: Sinus-Wert");
		int wert = Integer.parseInt(eingabe);
		System.out.println(wert);
		
		if(wert<1){
			System.out.println("Fehlerhafte Eingabe");
		}
		else if(wert>3){
			System.out.println("Fehlerhafte Eingabe");
		}
		else if(wert==1){
			String eingabe1 = JOptionPane.showInputDialog("Zahl zur Berechnung der Quadratwurzel eingeben:");
			double wert1 = Double.parseDouble(eingabe1);
			double a = Math.sqrt(wert1);
			System.out.println("Ergebnis: "+a);
			//System.out.println("Ergebnis: "+Math.sqrt(wert1));
		}
		else if(wert==2){
			String eingabe2 = JOptionPane.showInputDialog("Zahl zur Berechnung des nat. Logarithmus:");
			double wert2 = Double.parseDouble(eingabe2);
			double b = Math.log(wert2);
			System.out.println("Ergebnis: "+b);
		}
		else if(wert==3){
			String eingabe3 = JOptionPane.showInputDialog("Zahl zur Berechnung des Sinus-Wertes:");
			double wert3 = Double.parseDouble(eingabe3);
			double c = Math.sin(wert3);
			System.out.println("Ergebnis: "+c);
		}
			
			
			
		
		
	}
	
	
}