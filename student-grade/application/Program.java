package exercicio18.application;

import exercicio18.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String name = sc.nextLine();
        System.out.print("Digite a primeira nota do aluno: ");
        double grade1 = sc.nextDouble();

        if (grade1 < 0 || grade1 > 30) {
            while (grade1 < 0 || grade1 > 30) {
                System.out.println("Nota inválida!");
                System.out.println("Digite novamente: ");
                grade1 = sc.nextDouble();
            }
        }

        System.out.print("Digite a" + " segunda nota do aluno: ");
        double grade2 = sc.nextDouble();

        if (grade2 < 0 || grade2 > 35) {
            while (grade2 < 0 || grade2 > 35) {
                System.out.println("Nota inválida!");
                System.out.println("Digite novamente: ");
                grade2 = sc.nextDouble();
            }
        }

        System.out.print("Digite a terceira nota do aluno: ");
        double grade3 = sc.nextDouble();

        if (grade3 < 0 || grade3 > 35) {
            while (grade3 < 0 || grade3 > 35) {
                System.out.println("Nota inválida!");
                System.out.println("Digite novamente: ");
                grade3 = sc.nextDouble();
            }
        }

        Student student = new Student(name, grade1, grade2, grade3);

        double finalGrade = student.calculateFinalGrade();
        if (finalGrade >= 60) {
            System.out.println("Nota final: " + String.format("%.2f", finalGrade));
            System.out.println("Aprovado!");
        } else {
            System.out.println("Nota final: " + String.format("%.2f", finalGrade));
            System.out.println("Reprovado!");
            System.out.println("Faltou " + String.format("%.2f", (Student.MINIMUM_GRADE - finalGrade)) + " pontos para ser aprovado.");
        }


        sc.close();
    }
}
