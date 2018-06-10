import java.util.Scanner;

//EJERCICIO 04 -PASAR KM A MILLAS-//

public class Ejercicio4 {
	public static void main(String[] args) {
		kiloMilla();
	}
	
	public static void kiloMilla() {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce los km (no. real):");
		double d = input.nextDouble();
		System.out.println("Resultado en millas es:" + d*0.621371192);
		
		input.close();
	}
}

//DONE & FUNCIONAL!!// 