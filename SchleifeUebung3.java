import java.io.*;

public class SchleifeUebung3 {
	
	public static void main(String[] args)throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int a;
		boolean wieder=true;
		
		do {
			System.out.println("");
			System.out.print("Geben Sie eine Zahl ein, dessen Quadrat Sie berechnen wollen: ");
			String eingabe = br.readLine();
			int wert = Integer.parseInt(eingabe);
			System.out.println("Ihre Quadratzahl ist: "+(wert*wert)+"");
			System.out.println("Wollen Sie fortfahren? JA = 1, Nein = 0");
			
			String eingabe2 = br.readLine();
			int abfrage = Integer.parseInt(eingabe2); 
			if(abfrage==1){
				wieder=true;
			}
			else if(abfrage==0){
				wieder=false;
			}
			else{
				System.out.println("Ihre Eingabe war ungueltig");
				System.exit(0);
			}
			
		} 
		while (wieder==true);
	}
}