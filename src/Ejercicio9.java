import java.util.Scanner; 

//EJERCICIO 09 -INDICAR SI EL INPUT ES MAYOR, MENOR O IGUAL A 0-// 

public class Ejercicio9 {
	public static void main(String[] args) {
		mayorMenor();
	}
	
	public static void mayorMenor() {
		Scanner input = new Scanner(System.in);
		System.out.println("Dame un entero");
		int i = input.nextInt(); 
		
		if(i > 0) {
			System.out.println(i + " es mayor que cero");
		}else {
			if(i < 0) {
				System.out.println(i + " es menor que cero");
			}else {
				System.out.println(i + " es igual a cero");
			}
		}
		input.close();
	}
}

//DONE Y FUNCIONAL// 