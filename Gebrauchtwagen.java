public class Gebrauchtwagen {
	
	public static void main(String[] args){
		
		Auto Auto1 = new Auto(8999.99, 2001, "Opel Astra", 104000, "metallic-blau");
		System.out.println("Auto1 aufgerufen:");
		System.out.println("Preis: "+Auto1.getPreis());
		System.out.println("Baujahr: "+Auto1.getBaujahr());
		System.out.println("Modell: "+Auto1.getModell());
		System.out.println("Kilometerstand: "+Auto1.getKilometerstand());
		System.out.println("Farbe: "+Auto1.getFarbe());
		
		Auto1.setPreis(8799.99);
		System.out.println("Der neue Preis betraegt: "+Auto1.getPreis());
	}
}