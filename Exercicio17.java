import java.util.Scanner;

public class Exercicio17 {

    public static void executar() {
        public static void calcularNovoSalario(String nomeFuncionario, double salarioAtual, double salarioMinimo) {
            double novoSalario = ReajusteFuncionario.calcularReajuste(salarioAtual, salarioMinimo);
            double aumentoFolha = novoSalario - salarioAtual;
            System.out.println("Nome do funcionário: " + nomeFuncionario);
            System.out.println("Reajuste: " + (novoSalario - salarioAtual));
            System.out.println("Novo salário: " + novoSalario);
            System.out.println("Aumento na folha de pagamento: " + aumentoFolha);
        }
    }