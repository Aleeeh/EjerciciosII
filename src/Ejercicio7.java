import java.util.Scanner;

//EJERCICIO 07 -COMPROBAR SI UN AÑO ES BISIESTO-// 

public class Ejercicio7 {
	public static void main(String[] args) {
		bisiesto(); 
 }
	public static void bisiesto() {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un año"); 
		int year = input.nextInt(); 
		
		if( year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " es bisiesto");
		}else {
			if(year % 400 == 0) {
				System.out.println(year + " es bisiesto");
			}else {
				System.out.println(year + " no es bisiesto");
			}
		}
		input.close();
	}
}


//DONE & FUNCIONAL//

//**EL EJERCICIO 8 ES EXÁCTAMENTE IGUAL