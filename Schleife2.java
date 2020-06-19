import java.io.*;
public class Schleife2 {
	
	public static void main(String[] args)throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int guthaben = 200;
		boolean guthabenReicht = true;
		
		while (guthabenReicht){
			
			System.out.println("Bitte geben Sie den Kaufbetrag ein: ");
			String eingabe = br.readLine();
			int betrag = Integer.parseInt(eingabe);
			
			if (guthaben-betrag >= 0){
				System.out.println("Der Betrag wurde von Ihrem Guthaben abgezogen");
				
				guthaben -= betrag;
				
				System.out.println("Ihr neues Guthaben betraegt "+guthaben+"Euro.");
			}
			else {
				System.out.println("Leider reicht Ihr Guthaben nicht aus");
				guthabenReicht = false;
			}
		}
	}
}