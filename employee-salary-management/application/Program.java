package exercicio17.application;

import exercicio17.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Salário bruto: R$ ");
        double grossSalary = sc.nextDouble();
        System.out.print("Imposto: R$ ");
        double tax = sc.nextDouble();
        Employee employee = new Employee(name, grossSalary, tax);

        System.out.println("Funcionário: " + employee);

        System.out.print("Deseja aumentar o salário? (s/n)? ");
        char response = Character.toLowerCase(sc.next().charAt(0));

        if (response == 's') {
            System.out.print("Qual a porcentagem do aumento salarial? ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
            System.out.println("Dados atualizados do funcionário: " + employee);
        } else if (response == 'n') {
            System.out.println("Agradecemos pela utilização do sistema!");
        } else {
            System.out.println("Opção inválida!");
        }


        sc.close();
    }
}
