public class Gebrauchtauto1 { 

	public static void main(String[] args){
		
		Fahrzeug AutoNeu = new Auto1(2000.50, "Opel Corsa", 2005, 25000, "blau");
		System.out.println("Gebrauchtwagen aufgerufen...");
		System.out.println("Preis: "+AutoNeu.getPreis());
		System.out.println("Modell: "+AutoNeu.getModell());
		System.out.println("Baujahr: "+AutoNeu.getBaujahr());
		System.out.println("Kilometerstand: "+AutoNeu.getKilometerstand());
		System.out.println("Farbe: "+AutoNeu.getFarbe());
	}
}