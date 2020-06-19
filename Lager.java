public class Lager {
	
		public static void main(String[] args){
			
				int bestand = 10;
				
				if(bestand > 0){
						System.out.println("Der Artikel wird ausgelieftert");
						bestand --;
				}
				if(bestand == 10){
						System.out.println("Der angeforderte Artikel ist nicht verfügbar");
				}
				
		}
}