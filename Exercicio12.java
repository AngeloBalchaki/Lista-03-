import java.util.Scanner;

public class Exercicio12 {

    public static void executar() {
        int totalCarrosAte2000 = 0;
        int totalCarros = 0;
        while (true) {
            System.out.println("Digite o ano do carro (ou digite -1 para encerrar):");
            int anoCarro = scanner.nextInt();
            if (anoCarro == -1) {
                break;
            }
            totalCarros++;
            if (anoCarro <= 2000) {
                totalCarrosAte2000++;
                System.out.println("Desconto para carro até 2000: 12%");
            } else {
                System.out.println("Desconto para carro acima de 2000: 7%");
            }
        }
        System.out.println("Total de carros até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalCarros);
    }
