public class Lager2 {
	
		public static void main(String[] args){
			
			int bestand = 10;
			boolean werktag = false;
			
			if((bestand > 0) && werktag){
				System.out.println("Der Artikel wird ausgelieftert");
			}
			
			if((bestand > 0) && !werktag){
				System.out.println("Der Artikel wird am naechsten Werktag ausgelieftert");
			}
			
			if(bestand == 0){
				System.out.println("Der Artikel ist nicht vorraetig");
			}
		}
}