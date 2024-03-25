import java.util.Scanner;

public class Exercicio2 {

    public static void executar() {
        System.out.println("Digite a distância total percorrida pelo automóvel:");
    double distanciaTotal = scanner.nextDouble();
    System.out.println("Digite o total de combustível gasto:");
    double combustivelGasto = scanner.nextDouble();
    double consumoMedio = distanciaTotal / combustivelGasto;
    System.out.println("Consumo médio: " + consumoMedio + " km/l");