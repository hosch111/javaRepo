import java.io.*;

public class EingabeUebung2 {
	
	public static void main (String[] args)throws IOException{
		
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("");
			System.out.println("Wer ist ein guter Kumpel?");
			System.out.println("");
			String eingabe = br.readLine();
			
			String myString = "Hagen";
			String myString2 = "Frieda";
			String myString3 = "Ella";
			String myString4 = "Laurine";	
			String myString5 = "Masha";
			
			boolean a = myString.equals(eingabe);
			boolean b = myString2.equals(eingabe);
			boolean c = myString3.equals(eingabe);
			boolean d = myString4.equals(eingabe);
			boolean e = myString5.equals(eingabe);
			
			if(a) {
				System.out.println("");
				System.out.print("Korrekt"); 
				System.out.println("");			
			}
			else if(b) {
				System.out.println("");
				System.out.print("Korrekt");
				System.out.println("");
			}
			else if(c) {
				System.out.println("");
				System.out.print("Korrekt");
				System.out.println("");
			}
			else if(d) {
				System.out.println("");
				System.out.print("Korrekt"); 
				System.out.println("");
			}
			else if(e) {
				System.out.println("");
				System.out.print("Korrekt");
				System.out.println("");				
			}
			else {
				System.out.println("");
				System.out.println("Nicht korrekt");
				System.out.println("");
			}
			
	}
}