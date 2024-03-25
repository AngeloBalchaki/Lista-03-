import java.util.Scanner;

public class Exercicio13 {

    public static void executar() {
        public static void verificarAptidaoMilitar(Scanner scanner) {
            int totalAptos = 0;
            int totalPessoas = 0;
            while (true) {
                System.out.println("Digite o nome da pessoa (ou digite 'FIM' para encerrar):");
                String nome = scanner.next();
                if (nome.equalsIgnoreCase("FIM")) {
                    break;
                }
                System.out.println("Digite o sexo da pessoa (M para homem, F para mulher):");
                char sexo = scanner.next().charAt(0);
                System.out.println("Digite a idade da pessoa:");
                int idade = scanner.nextInt();
                System.out.println("A pessoa está apta para o serviço militar? (S para sim, N para não):");
                char apto = scanner.next().charAt(0);
                if (apto == 'S') {
                    totalAptos++;
                }
                totalPessoas++;
            }
            System.out.println("Total de pessoas aptas para o serviço militar: " + totalAptos);
            System.out.println("Total de pessoas: " + totalPessoas);
        }
    