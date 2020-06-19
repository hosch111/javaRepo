import javax.swing.JOptionPane;

public class Arrayfeld {
	
	public static void main (String[] args){
		
			int a[] = {3,5,2,1};
			
		try {
			String eingabe = JOptionPane.showInputDialog("Welches Arrayfeld soll angezeigt werden?");
			int wert = Integer.parseInt(eingabe);
			JOptionPane.showMessageDialog(null, "Inhalt: "+a[wert]);
		}
		catch (ArrayIndexOutOfBoundsException ausnahme){
			JOptionPane.showMessageDialog(null,"Bitte das naechste Mal einen Wert zwischen 0 und 3 eingeben.", "Fehler",2);
			System.out.println(ausnahme);
		}
	}
}