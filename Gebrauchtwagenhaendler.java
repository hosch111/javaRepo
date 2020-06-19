import javax.swing.JOptionPane;




public class Gebrauchtwagenhaendler {
	
	public static void main(String[] args){
		
		
		Auto Auto1 = new Auto(8999.99, 2001, "Opel Astra", 104000, "metallic-blau");
		System.out.println("Auto1 aufgerufen:");
		System.out.println("Preis: "+Auto1.getPreis());
		System.out.println("Baujahr: "+Auto1.getBaujahr());
		System.out.println("Modell: "+Auto1.getModell());
		System.out.println("Kilometerstand: "+Auto1.getKilometerstand());
		System.out.println("Farbe: "+Auto1.getFarbe());
		
		
		int a = JOptionPane.showConfirmDialog(null, "Moechten Sie den Preis aendern?","Preisaenderung", JOptionPane.YES_NO_OPTION);

		//JOptionPane.showConfirmDialog(null,"Moechten Sie den Preis aendern?");
		
		if(a==0){
			String eingabe = JOptionPane.showInputDialog("Bitte neuen Preis eingeben: ");
			double pN = Double.parseDouble(eingabe);
			Auto1.setPreis(pN);
			System.out.println("Der neue Preis betraegt: "+Auto1.getPreis());
		}
		else{
			System.out.println("Der Preis wurde nicht geaendert");
		}
	}		
	
}
	
	