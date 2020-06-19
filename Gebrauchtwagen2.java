import java.io.*;
import javax.swing.JOptionPane;

public class Gebrauchtwagen2 {
	
	public static void main (String[] args){
		
		int zaehler = 0;
		String linie;
		
		try{
			
			FileInputStream fis = new FileInputStream("Autos.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			linie = br.readLine();
			while(linie != null){	
				if ("".equals(linie)){
					zaehler ++;
				}
				linie = br.readLine();
			}
			br.close();
		}
		catch (IOException ioAusnahme){
			
			System.out.print("Datei konnte nicht geoeffnet werden");
		}
		Auto[] sortiment = new Auto[zaehler];
		
		try{
			FileInputStream fis2 = new FileInputStream("Autos.txt");
			InputStreamReader isr2 = new InputStreamReader(fis2);
			BufferedReader br2 = new BufferedReader(isr2);
			
			for (int i=0; i<zaehler; i++){
				linie = br2.readLine();
				linie = br2.readLine();
				double preis = Double.parseDouble(linie);
				linie = br2.readLine();
				String modell = linie;
				linie = br2.readLine();
				int baujahr = Integer.parseInt(linie);
				linie = br2.readLine();
				int kilometerstand = Integer.parseInt(linie);
				linie = br2.readLine();
				String farbe = linie;
				sortiment[i] = new Auto(preis,modell,baujahr,kilometerstand,farbe);
			}
			br2.close();
		}
		catch(IOException ioAusnahme){
			System.out.print("Datei konnte nicht geoeffnet werden");
		}
		for (Auto element2 : sortiment){
			System.out.println("Preis: "+element2.getPreis());
			System.out.println("Modell: "+element2.getModell());
			System.out.println("Baujahr: "+element2.getBaujahr());
			System.out.println("Kilometerstand: "+element2.getKilometerstand());
			System.out.println("Farbe: "+element2.getFarbe()+"\n");
		}
		
	int x = JOptionPane.showConfirmDialog(null, "Moechten Sie ein Auto loeschen?");
		if (x == 0){
		String eingabe = JOptionPane.showInputDialog("Geben Sie das Modell ein, \n"+"das Sie loeschen moechten:");
		Auto.loeschen (sortiment, eingabe);
		}
	}
	
	
/**Löscht ein Auto**/
	
	
	public static void loeschen (Auto[] sortiment, String mod_loeschen){
		try {
			File datei = new File("Autos.txt");
			boolean neu = true;
			boolean geloescht = false;
			if (datei.exists()){
				BufferedWriter bw = new BufferedWriter(new FileWriter("Autos.txt",false));
				for (Auto element : sortiment){
					if (!(mod_loeschen.equals (element.getModell()))){
						if (!neu){
							bw.write("\n");
						}
						else {
							neu = false;
						}
					bw.write ("\n"+element.getPreis());
					bw.write ("\n"+element.getModell());
					bw.write ("\n"+element.getBaujahr());
					bw.write ("\n"+element.getKilometerstand());
					bw.write ("\n"+element.getFarbe());
					}
					else { 
						geloescht = true;
					}
				}
				bw.close();
			}
			else {
				System.out.print("Datei nicht vorhanden");
			}
			if (geloescht){
				System.out.print("Das Auto wurde geloescht");
			}
			else {
				System.out.print("Das Modell konnte nicht gefunden werden");
			}
		}
		catch(IOException ioAusnahme){
			System.out.print("Fehler beim Oeffnen der Datei");
		}
	
	}
	
} 

	

			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				