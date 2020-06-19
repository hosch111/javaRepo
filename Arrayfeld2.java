import javax.swing.JOptionPane;

class Ausnahme1 extends Exception{}
class Ausnahme2 extends Exception{}

public class Arrayfeld2 {
	
	public static void main (String[] args){
		
		int a[] = {3,5,2,1};
		
		try {
			
			String eingabe = JOptionPane.showInputDialog("Welches Array-Feld soll angezeigt werden?");
			int wert = Integer.parseInt(eingabe);
			if (wert > 3){
				throw new Ausnahme1 ();
			}
			if (wert < 0){
				throw new Ausnahme2 ();
			}
		    JOptionPane.showMessageDialog(null,"Inthalt: "+a[wert]);
		}
		catch (Ausnahme1 ausnahme){
			
			JOptionPane.showMessageDialog(null,"Bitte eine kleinere Zahl eingeben","Fehler",2);
		}
		catch (Ausnahme2 ausnahme){
			
			JOptionPane.showMessageDialog(null,"Bitte eine positive Zahl eingeben","Fehler",2);
		}
	}
}