import java.util.Scanner;

public class Exercicio8 {

    public static void executar() {
        public static void calcularMencao(String nomeAluno, double nota1, double nota2, double nota3) {
            double media = (nota1 + nota2 + nota3) / 3;
            System.out.println("Aluno: " + nomeAluno);
            System.out.println("Média: " + media);
            if (media >= 7) {
                System.out.println("Menção: Aprovado");
            } else if (media <= 5) {
                System.out.println("Menção: Reprovado");
            } else {
                System.out.println("Menção: Recuperação");
            }
        }