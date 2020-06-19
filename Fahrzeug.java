public class Fahrzeug {
	private double preis;
	private String modell;
	private int baujahr;
	private int kilometerstand;
	
	/** Konstruktor benoetigt folgende Werte: Preis, Modell, Baujahr und Kilometerstand. */
	public Fahrzeug (double wert1, String wert2, int wert3, int wert4){
		this.preis = wert1;
		this.modell = wert2;
		this.baujahr = wert3;
		this.kilometerstand = wert4;
	}
	/** Gibt Werte zurück. */
	public double getPreis (){
		return preis;
	}
	public String getModell (){
		return modell;
	}
	public int getBaujahr (){
		return baujahr;
	}
	public int getKilometerstand (){
		return kilometerstand;
	}
	/** Ändert Wert. */
	public void setPreis (double wert){
		this.preis = wert;
	}
}



	
