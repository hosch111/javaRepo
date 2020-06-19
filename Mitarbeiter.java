public class Mitarbeiter {

	private String name;
	private String vorname;
	private double gehalt;

	public Mitarbeiter (String wert1, String wert2, double wert3){
	
		this.name = wert1;
		this.vorname = wert2;
		this.gehalt = wert3;
	}
	public String getName (){
		return name;
	}
	public String getVorname (){
		return vorname;
	}
	public double getGehalt (){
		return gehalt;
	}
	public void setGehalt (double wert){
		this.gehalt = wert;
	}
}