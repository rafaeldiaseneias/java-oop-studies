package exercicio19.application;


import exercicio19.entities.Project;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do projeto: ");
        String name = sc.nextLine();
        System.out.print("Orçamento total: R$ ");
        double totalBudget = sc.nextDouble();
        System.out.print("Total gasto: R$ ");
        double spent = sc.nextDouble();

        Project project = new Project(name, totalBudget, spent);

        System.out.println("Projeto: " + project.getName());
        if (project.getSpent() > project.getTotalBudget()) {
            System.out.println("Restando: R$ " + String.format("%.2f", project.remainingBudget()) + " (Orçamento estourado!)");
        } else {
            System.out.println("Restando: R$ " + String.format("%.2f", project.remainingBudget()) + " (Dentro do orçamento!)");
        }

        System.out.print("Deseja registrar um novo gasto? (s/n)? ");
        char response = sc.next().toLowerCase().charAt(0);

        while (response != 's' && response != 'n') {
            System.out.println("Opção inválida!");
            System.out.print("Digite novamente (s/n): ");
            response = sc.next().toLowerCase().charAt(0);
        }

        if (response == 's') {
            System.out.print("Novo gasto: R$ ");
            double amount = sc.nextDouble();
            project.addExpense(amount);

            System.out.println("Após novas despesas...");
            System.out.println("Projeto: " + project.getName());

            if (project.getSpent() > project.getTotalBudget()) {
                System.out.println("Restando: R$ " + String.format("%.2f", project.remainingBudget()) + " (Orçamento estourado!)");
            } else {
                System.out.println("Restando: R$ " + String.format("%.2f", project.remainingBudget()) + " (Dentro do orçamento!)");
            }

        } else {
            System.out.println("Obrigado pela utilização do sistema de gestão!");
        }


        sc.close();
    }
}
