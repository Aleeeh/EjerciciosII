import java.util.Scanner;

//EJERCICIO 01 -MULTIPLICAR EL INPUT POR 3-//

public class Ejercicio1 { // **Recuerda que hay que cambiar el nombre de la clase por exercise si quieres que funcione en el c.v.**
    public static void main(String[] args) {
        triple();
    }
    //Metodo a desarrollar//
    public static void triple() {
        System.out.println("Introduce un no. entero:");

        Scanner input = new Scanner(System.in); //iniciamos el escaner
        int i = input.nextInt(); //copiamos el input en "i"

        System.out.println("El resultado final es:" + i*3);

        input.close(); //cerramos la entrada del input
    }
}

//DONE & FUNCIONANDO//