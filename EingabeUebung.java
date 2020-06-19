import java.io.*;

public class EingabeUebung {
	
		public static void main (String[] args)throws IOException{
				
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				
				
				System.out.println("5 + 5 = ?");
				String eingabe = br.readLine();
				int ergebnis = Integer.parseInt(eingabe);
				
				if (ergebnis == 5+5){
						System.out.println("Das Ergebnis ist korrekt");
				}
				else {
						System.out.println("Das Ergebnis ist nicht korrekt");
				}
		}
}