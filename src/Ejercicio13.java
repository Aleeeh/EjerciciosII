import java.util.Scanner;

//EJERCICIO13 -MOSTRAR TODOS LOS NOS. PARES COMPRENDIDOS ENTRE 1 Y EL INPUT//

public class Ejercicio13 {
	public static void mian(String[] args) {
		pares();
	}
	
	public static void pares() {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("Introduce un no. positivo:");
		
		for(int i = 2; i<=num ; i++) {	
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	input.close();			
	}
	
	
}