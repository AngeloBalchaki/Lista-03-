import java.util.Scanner;

public class Exercicio7 {

    public static void executar() {
        public static double calcularCustoConsumidor(double custoFabrica) {
            double impostos = custoFabrica * 0.45;
            double custoDistribuidor = (custoFabrica + impostos) * 0.28;
            return custoFabrica + impostos + custoDistribuidor;
        }
    }