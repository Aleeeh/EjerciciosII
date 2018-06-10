import java.util.Scanner; 

//EJERCICO 05 -DIFERENCIAR ENTRE PAR E IMPAR-//

public class Ejercicio5 {
	public static void main(String[] args) {
		parImpar();
	}
	
	public static void parImpar() {
		System.out.println("Dame un no. entero:");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		
		if(i % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		input.close();
	}
}

//DONE & FUNCIONAL//