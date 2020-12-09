import java.util.Scanner;
public class E02{
		public static void main (String[] args) {
			Scanner teclado=new Scanner(System.in);
			float n1;
		
			System.out.println("Introduzca grados Celsius");
			n1=teclado.nextFloat();
			System.out.println("Entrada"+n1);
			System.out.println("Salida"+((n1*1.8)+32));
		}
}