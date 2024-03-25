import java.util.Scanner;

public class Exercicio22 {

    public static void executar() {
        public static double calcularValorContaLuz(int tipoCliente, double consumoKWh) {
            double valorKWh;
            switch (tipoCliente) {
                case 1:
                    valorKWh = 0.60;
                    break;
                case 2:
                    valorKWh = 0.48;
                    break;
                case 3:
                    valorKWh = 1.29;
                    break;
                default:
                    valorKWh = 0.00;
                    break;
            }
            return valorKWh * consumoKWh;
        }
    }