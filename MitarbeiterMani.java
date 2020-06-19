import java.io.*;
public class MitarbeiterMani{

	public static void main(String[] args)throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	
	
	
		Mitarbeiter Mitarbeiter1 = new Mitarbeiter("Mustermann", "Max", 3500.67);
		
		System.out.println("Name: "+Mitarbeiter1.getName());
		System.out.println("Vorname: "+Mitarbeiter1.getVorname());
		System.out.println("Gehalt: "+Mitarbeiter1.getGehalt());
		System.out.println();
		
		System.out.println("Neues Gehalt festlegen? JA=1 Nein=0");
		
		String eingabe = br.readLine();
		int wert1 = Integer.parseInt(eingabe);
	
		if(wert1==1){
			System.out.println("Neues Gehalt...:");
			String eingabe2 = br.readLine();
			double wert2 = Double.parseDouble(eingabe2);
			Mitarbeiter1.setGehalt(wert2);
		

			System.out.println();
			System.out.println();
			System.out.println("Name: "+Mitarbeiter1.getName());
			System.out.println("Vorname: "+Mitarbeiter1.getVorname());
			System.out.println("Gehalt: "+Mitarbeiter1.getGehalt());
			
		}
		else if(wert1==0){
			System.out.println();
			System.out.println();
			System.out.println("Name: "+Mitarbeiter1.getName());
			System.out.println("Vorname: "+Mitarbeiter1.getVorname());
			System.out.println("Gehalt: "+Mitarbeiter1.getGehalt());
		}
		else {
			System.exit(0);
		}
	}

}
	
	