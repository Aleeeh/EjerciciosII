import java.util.Scanner;

//EJERCICIO14 -MOSTRAR TODOS LOS NOS. DIVISORES ENTRE 1 Y EL INPPUT-//

public class Ejercicio14 {
	public static void main(String[] args) {
		divisores();
	}
	
	public static void divisores() {
		System.out.println("Introduce un numero posivito");
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
		input.close();
	}
}

//DONE & FUNCIONAL//
