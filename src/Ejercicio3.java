import java.util.Scanner;

//EJERCICIO 03 -REORDENAR LOS INTPUTS-//

public class Ejercicio3 {
	public static void main (String[] args) {
		puzzle();
	}
	
	public static void puzzle() {
		Scanner input = new Scanner(System.in); //iniciamos scanner
		int num;
		//1er valor// 
        System.out.print("Introduce un valor entero: ");
        num = input.nextInt();
        System.out.print("El valor posterior es: ");        
        System.out.println(num - 1);        
        System.out.println("El valor introducido es: ");        
        System.out.println(num);
        System.out.print("El valor anterior es: ");
        num = num + 2;
        num = num - 1;
        System.out.println(num);
        
        input.close();
	}
}

//DONE & FUNCIONAL//
