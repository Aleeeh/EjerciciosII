import java.util.Scanner;

//EJERCICIO12 -HACER UNA SUMA DE TODOS LOS NOS. COMPRENDIDOS ENTRE 1 Y EL INPUT-//
public class Ejercicio12 {
	public static void main(String[] args) {
		suma();
	}
	
	public static void suma() {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un numero positivo:"); 
		int num = input.nextInt(); 
		int aux = 0; 
		
		for(int i = 1; i<num ; i++) {
			aux = aux + i; 
			
		}
		System.out.println(aux);
		input.close();
	}
}
