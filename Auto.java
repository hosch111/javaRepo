/** Diese Klasse erstellt ein Auto mit verschiedenen Eigenschaften. */
import java.io.*;

public class Auto {
	
	private double preis;
	private int baujahr;
	private String modell;
	private int kilometerstand;
	private String farbe;
	
/** Der Konstruktor kriegt Werte für verschiedene Eigenschaften überwiesen. */ 

public Auto	(double wert1, String wert2, int wert3, int wert4, String wert5){
	this.preis = wert1;
	this.modell = wert2;
	this.baujahr = wert3;
	this.kilometerstand = wert4;
	this.farbe = wert5;
}
/** Gibt den Preis zurück. */
public double getPreis (){
	return preis;
}
/** Gibt das Baujahr zurück. */
public int getBaujahr (){
	return baujahr;
}
/** Gibt das Modell zurück. */
public String getModell (){
	return modell;
}
/** Gibt den Kilometerstand zurückk. */
public int getKilometerstand (){
	return kilometerstand;
}
/** Gibt die Farbe zurück. */
public String getFarbe (){
	return farbe;
}
/** Ändert den Preis. */
public void setPreis (double wert){
	this.preis = wert;
}



}
	
	
	
	
	


