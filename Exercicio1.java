import java.util.Scanner;

public class Exercicio1 {

    public static void executar() { 
        System.out.println("Digite o nome do aluno:");
    String nomeAluno = scanner.nextLine();
    System.out.println("Digite a nota da primeira prova:");
    double nota1 = scanner.nextDouble();
    System.out.println("Digite a nota da segunda prova:");
    double nota2 = scanner.nextDouble();
    System.out.println("Digite a nota da terceira prova:");
    double nota3 = scanner.nextDouble();
    double media = (nota1 + nota2 + nota3) / 3;
    System.out.println("Aluno: " + nomeAluno);
    System.out.println("Média: " + media);
