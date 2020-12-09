import java.util.Scanner;
public class E01{
		public static void main (String[] args) {
			Scanner teclado=new Scanner(System.in);
			int n1, n2;
			System.out.println("Introduzca primer numero entero");
			n1=teclado.nextInt();
			System.out.println("Introduzca segundo numero entero");
			n2=teclado.nextInt();
			System.out.println("cociente"+n1/n2);
			System.out.println("resto"+n1%n2);
		}
}