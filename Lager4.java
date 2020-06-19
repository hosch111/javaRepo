public class Lager4 {

	public static void main (String[] args){
		
			int bestand = 5;
			if (bestand == 0){
					System.out.println("Der angeforderte Artikel ist nicht verfuegbar");
			}
			else if (bestand < 10){
					System.out.println("Nur noch wenige Artikel verfuegbar");
					System.out.println("Bitte nachbestellen");
			}
			else {
					System.out.println("Der Artikel wird geliefert");
			}
	}
}