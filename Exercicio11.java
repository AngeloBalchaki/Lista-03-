import java.util.Scanner;

public class Exercicio11 {

    public static void executar() {
        public static void informarGenero(Scanner scanner) {
            int totalHomens = 0;
            int totalMulheres = 0;
            for (int i = 0; i < 56; i++) {
                System.out.println("Digite o nome da pessoa:");
                String nome = scanner.next();
                System.out.println("Digite o sexo da pessoa (M para homem, F para mulher):");
                char sexo = scanner.next().charAt(0);
                if (sexo == 'M') {
                    totalHomens++;
                    System.out.println(nome + " é homem");
                } else {
                    totalMulheres++;
                    System.out.println(nome + " é mulher");
                }
            }
            System.out.println("Total de homens: " + totalHomens);
            System.out.println("Total de mulheres: " + totalMulheres);
        }
    