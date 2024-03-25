import java.util.Scanner;

public class Exercicio6 {

    public static void executar() {
        System.out.println("Digite o preço de custo do produto:");
        double precoCusto = scanner.nextDouble();
        System.out.println("Digite o percentual de acréscimo (%):");
        double percentualAcrescimo = scanner.nextDouble();
        double precoVenda = precoCusto * (1 + percentualAcrescimo / 100);
        System.out.println("Preço de venda: " + precoVenda);

        scanner.close();
    }
}