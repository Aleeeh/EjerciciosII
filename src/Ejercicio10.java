import java.util.Scanner;

//EJERCICIO 10 -RESTO ENTRE MAYOR Y MENOR DE 2 INPUT-//
public class Ejercicio10 {
	public static void main(String[] args) {
		resto();
	}
	public static void resto() {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un valor entero");
		int i1 = input.nextInt();
		System.out.println("Introduce otro valor entero");
		int i2 = input.nextInt(); 
		
		if(i1 > i2) {
			System.out.println("el resultado es: " + i1 % i2);
		}else {
			System.out.println("el resultado es: " + i2 % i1);
		}
		input.close();
	}
}

//DONE Y FUNCIONAL// 