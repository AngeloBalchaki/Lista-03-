import java.util.Scanner;

public class Exercicio19 {

    public static void executar() {
        public static String verificarTipoTriangulo(int lado1, int lado2, int lado3) {
            if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
                if (lado1 == lado2 && lado1 == lado3) {
                    return "Triângulo Equilátero";
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    return "Triângulo Isósceles";
                } else {
                    return "Triângulo Escaleno";
                }
            } else {
                return "Os valores informados não formam um triângulo.";
            }
        }
    }