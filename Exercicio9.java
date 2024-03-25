import java.util.Scanner;

public class Exercicio9 {

    public static void executar() {
        public static void contarNumerosIntervalo(Scanner scanner) {
            int contador = 0;
            for (int i = 0; i < 80; i++) {
                System.out.println("Digite um número:");
                int numero = scanner.nextInt();
                if (numero >= 10 && numero <= 150) {
                    contador++;
                }
            }
            System.out.println("Total de números no intervalo [10, 150]: " + contador);
        }
    