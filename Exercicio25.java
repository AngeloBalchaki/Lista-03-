import java.util.Scanner;

public class Exercicio25 {

    public static void executar() {
        public static double calcularNotaFinal(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
            
            double pesoLaboratorio = 2;
            double pesoSemestral = 3;
            double pesoExameFinal = 5;
    
           
            double notaFinal = (notaLaboratorio * pesoLaboratorio + notaSemestral * pesoSemestral + notaExameFinal * pesoExameFinal) / (pesoLaboratorio + pesoSemestral + pesoExameFinal);
    
            return notaFinal;
        }
    
        
        public static char determinarClassificacao(double notaFinal) {
            if (notaFinal >= 8 && notaFinal <= 10) {
                return 'A';
            } else if (notaFinal >= 7 && notaFinal < 8) {
                return 'B';
            } else if (notaFinal >= 6 && notaFinal < 7) {
                return 'C';
            } else if (notaFinal >= 5 && notaFinal < 6) {
                return 'D';
            } else {
                return 'R';
            }
        }
    }