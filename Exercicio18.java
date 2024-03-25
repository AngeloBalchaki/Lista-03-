import java.util.Scanner;

public class Exercicio18 {

    public static void executar() {
        public static void calcularSalarioLiquido(String nome, int idade, char sexo, double salarioFixo) {
            double abono = 0;
            if (sexo == 'M') {
                if (idade >= 30) {
                    abono = 100.00;
                } else {
                    abono = 50.00;
                }
            } else if (sexo == 'F') {
                if (idade >= 30) {
                    abono = 200.00;
                } else {
                    abono = 80.00;
                }
            }
            double salarioLiquido = salarioFixo + abono;
            System.out.println("Nome: " + nome);
            System.out.println("Salário líquido: R$ " + salarioLiquido);
        }
    }