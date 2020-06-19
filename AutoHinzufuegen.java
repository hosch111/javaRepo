import java.io.*;
import javax.swing.JOptionPane;

	public class AutoHinzufuegen {
		
		public static void main (String[] args){
			try{
				File datei = new File("Autos.txt");
				boolean neu = false;
				String eingabe;
				
				if(!datei.exists()){
					datei.createNewFile();
					neu = true;
				}
				
				BufferedWriter bw = new	BufferedWriter(new FileWriter("Autos.txt", true));
					
				if(!neu){
					bw.write("\n");
				}
				eingabe = JOptionPane.showInputDialog("Preis:");
				bw.write("\n"+eingabe);
				eingabe = JOptionPane.showInputDialog("Modell:");
				bw.write("\n"+eingabe);
				eingabe = JOptionPane.showInputDialog("Baujahr:");
				bw.write("\n"+eingabe);
				eingabe = JOptionPane.showInputDialog("Kilometerstand:");
				bw.write("\n"+eingabe);
				eingabe = JOptionPane.showInputDialog("Farbe:");
				bw.write("\n"+eingabe);
				bw.close();
			}
			catch(IOException ioAusnahme){
				System.out.print("Fehler beim Oeffnen der Datei");
			}
		}
}
	