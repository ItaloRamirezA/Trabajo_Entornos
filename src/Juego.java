import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        boolean acertado = false;

        System.out.println("Bienvenido al juego 'adivina el número'.");

        while (!acertado) {
            System.out.print("Ingresa un número entre 1 y 100: ");
            int numero = scanner.nextInt();
            intentos++;

            if (numero < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (numero > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                acertado = true;
            }
        }
        //Comentario de ejemplo para hacer commit
        System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
    }
}
