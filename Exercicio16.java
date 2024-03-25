import java.util.Scanner;

public class Exercicio16 {

    public static void executar() {
        public static double calcularReajuste(double salario, double salarioMinimo) {
            if (salario < 3 * salarioMinimo) {
                return salario * 1.5;
            } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
                return salario * 1.2;
            } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
                return salario * 1.15;
            } else {
                return salario * 1.1;
            }
        }
    }