public class Zuweisung {

	public static void main(String[] args){
		
		int i;
		int m = 10;
		
		i = 4;
		System.out.print("Nach der ersten Zuweisung betraegt der Wert der Variablen ");
		System.out.println(i);
		i = m;
		System.out.print("Nach der zweiten Zuweisung betraegt der Wert der Variablen ");
		System.out.println(i);
		i = m*m;
		System.out.print("Nach der dritten Zuweisung betraegt der Wert der Variablen ");
		System.out.println(i);
		i++;
		System.out.println("Nach der dritten Zuweisung betraegt der Wert der Variablen "+i);
		i--;
		System.out.println("Nach der vierten Zuweisung betraegt der Wert der Variablen " 
		+i);
		
	}
}