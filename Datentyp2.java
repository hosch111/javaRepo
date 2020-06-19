public class Datentyp2 {

		public static void main (String[] args){
				
				byte b;
				short s;
				int i;
				long l;
				float f;
				double d;
				
				d = 3.1337;
				f = (float)d;
				l = (long)f;
				i = (int)l;
				s = (short)i;
				b = (byte)s;
				
				System.out.println("Der Wert der Variablen b ist "+b+".");
				
		}
}