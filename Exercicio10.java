import java.util.Scanner;

public class Exercicio10 {

    public static void executar() {
        public static void verificarMaiorIdade(Scanner scanner) {
            while (true) {
                System.out.println("Digite a idade da pessoa (ou digite -1 para encerrar):");
                int idade = scanner.nextInt();
                if (idade == -1) {
                    break;
                }
                if (idade >= 18) {
                    System.out.println("Maior de idade");
                } else {
                    System.out.println("Menor de idade");
                }
            }
        }