public class IfUebung {

		public static void main (String[] args){
			
					int bestellmenge = 50;
					int bestand = 40;
					boolean zahlung = false;
					
					if ((bestand < bestellmenge) && zahlung){
						System.out.println("Artikelmenge nicht verfuegbar");
						System.out.println("Artikel muss bestellt werden");
					}
					else if ((bestand < bestellmenge) && !zahlung){
						System.out.println("Artikelmenge nicht verfuegbar");
						System.out.println("Artikel muss bestellt werden");
						System.out.println("Warte auf Zahlungseingang...");
					}
					else if ((bestand >= bestellmenge) && zahlung){
						System.out.println("Artikel wird geliefert");
					}
					else if ((bestand >= bestellmenge) && !zahlung){
						System.out.println("Artikel verfuegbar");
						System.out.println("Warte auf Zahlungseingang...");
					}
		}
}