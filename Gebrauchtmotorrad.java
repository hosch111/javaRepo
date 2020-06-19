public class Gebrauchtmotorrad {
	
	public static void main(String[] args){
		
		Fahrzeug Motorrad1 = new Motorrad(2400.79, "Yamaha", 2019, 24899, 900);
		System.out.println("Motorrad1 aufgerufen...");
		System.out.println("Preis: "+Motorrad1.getPreis());
		System.out.println("Modell: "+Motorrad1.getModell());
		System.out.println("Baujahr: "+Motorrad1.getBaujahr());
		System.out.println("Kilometerstand: "+Motorrad1.getKilometerstand());
		/*System.out.println("Hubraum: "+Motorrad1.getHubraum());*/
		
		Motorrad1.setPreis(1900.00);
		System.out.println("Der neue Preis betraegt: "+Motorrad1.getPreis());
	}
	
}