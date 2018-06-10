import java.util.Scanner;

//EJERCICIO 02 -DEVOLVER EL RESTO DE LA DIVISION DE 2 ENTEROS-//

public class Ejercicio2 {
	public static void main(String [] args) {
		resto();
	}
	
	public static void resto() {
		Scanner input = new Scanner(System.in);
		//1er valor//
		System.out.println("Introduce un valor entero");
		int Value1 = input.nextInt(); //1er valor introducido
		//2o valor//
		System.out.println("Introduce otro valor entero:");
		int Value2 = input.nextInt(); //2o valor introducido
		//Resultado//
		System.out.println("El resto de la division del primero entre el segundo es:" + Value1%Value2);
		input.close();
	}
}

//DONE & FUNCIONAL//

	
