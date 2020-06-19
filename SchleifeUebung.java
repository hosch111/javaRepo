import java.io.*;
public class SchleifeUebung {
	
	public static void main(String[] args)throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int a[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Wert "+(i+1)+" eingeben: ");
			String eingabe = br.readLine();
			int wert = Integer.parseInt(eingabe);
			a[i] = wert;
		}
		System.out.println("Die doppelten Werte des Arrays sind:");
		for (int element : a){
			System.out.println(element*2);
			
		}
	}
}