import java.util.Scanner;

public class Exercicio15 {

    public static void executar() {
        public static double[] calcularDescontoValor(double valorVeiculo, String combustivel) {
            double desconto = 0;
            if (combustivel.equalsIgnoreCase("álcool")) {
                desconto = 0.25 * valorVeiculo;
            } else if (combustivel.equalsIgnoreCase("gasolina")) {
                desconto = 0.21 * valorVeiculo;
            } else if (combustivel.equalsIgnoreCase("diesel")) {
                desconto = 0.14 * valorVeiculo;
            }
            double valorPago = valorVeiculo - desconto;
            return new double[] { desconto, valorPago };
        }
    }
    
  