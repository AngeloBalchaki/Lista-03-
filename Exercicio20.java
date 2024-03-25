import java.util.Scanner;

public class Exercicio20 {

    public static void executar() {
        public static double calcularSalarioProfessor(int nivel) {
            double valorHoraAula;
            switch (nivel) {
                case 1:
                    valorHoraAula = 12.00;
                    break;
                case 2:
                    valorHoraAula = 17.00;
                    break;
                case 3:
                    valorHoraAula = 25.00;
                    break;
                default:
                    valorHoraAula = 0.00;
                    break;
            }
            return valorHoraAula * 40; // Considerando 40 horas semanais de trabalho
        }
    }