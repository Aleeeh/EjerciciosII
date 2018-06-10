import java.util.Scanner;

//EJERCICIO 06 -COMPARAR 2 N'UMEROS Y DECIR CUAL ES MAYOR-//

public class Ejercicio6 {
	public static void main(String[] args) {
		mayor(); 
	}
	
	public static void mayor() {
		Scanner input = new Scanner(System.in);
		System.out.println("Dame un no. entero"); 
		int i1 = input.nextInt(); 
		System.out.println("Dame otro no."); 
		int i2 = input.nextInt();
		
		if( i1 > i2) {
			System.out.println("El primero no. es mayor:" + i1);
		}if( i1 == i2) {
			System.out.println("Ambos son iguales:" + i1 + " y " + i2); 
		}else {
			System.out.println("El segundo no. es mayor:" + i2);
		}
		
		input.close();
	}
}

//DONE & FUNCIONAAL//