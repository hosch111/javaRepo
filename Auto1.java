public class Auto1 extends Fahrzeug {
	
	private String farbe;
	
		public Auto1(double wert1, String wert2, int wert3, int wert4, String wert5){
			
			super(wert1,wert2,wert3,wert4);
			
			this.farbe = wert5;
			
		}
		public String getFarbe(){
			return farbe;
		}
}