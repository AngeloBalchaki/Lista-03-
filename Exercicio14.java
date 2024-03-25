import java.util.Scanner;

public class Exercicio14 {

    public static void executar() {
        public static void verificarLucroPrejuizoEmpate(Scanner scanner) {
            double somaPrecoCusto = 0;
            double somaPrecoVenda = 0;
            for (int i = 0; i < 40; i++) {
                System.out.println("Digite o preço de custo do produto:");
                double precoCusto = scanner.nextDouble();
                System.out.println("Digite o preço de venda do produto:");
                double precoVenda = scanner.nextDouble();
                somaPrecoCusto += precoCusto;
                somaPrecoVenda += precoVenda;
                if (precoVenda > precoCusto) {
                    System.out.println
    