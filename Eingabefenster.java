import javax.swing.JOptionPane;

public class Fenster {
	public static void main(String... args){
		String eingabe = JOptionPane.showInputDialog("Bitte Text eingeben :");
		System.out.println(eingabe);
	}
}