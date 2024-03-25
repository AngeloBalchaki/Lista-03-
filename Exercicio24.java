import java.util.Scanner;

public class Exercicio24 {

    public static void executar() {
        public static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
            // Pesos das notas
            double pesoLaboratorio = 2;
            double pesoSemestral = 3;
            double pesoExameFinal = 5;
    
            // Calculando a média ponderada das notas
            double notaFinal = (notaLaboratorio * pesoLaboratorio + notaSemestral * pesoSemestral + notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoSemestral + pesoExameFinal);
    
            return notaFinal;
        }
    }