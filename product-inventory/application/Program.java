package exercicio16.application;

import exercicio16.entities.Product;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        ArrayList<Product> products = new ArrayList<>();

        int n = 0;

        while (n != 5) {
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Remover quantidade");
            System.out.println("4 - Adicionar quantidade");
            System.out.println("5 - Sair do sistema");
            n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    System.out.print("Nome: ");
                    String name = sc.nextLine();
                    System.out.print("Preço: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantity = sc.nextInt();
                    products.add(new Product(name, price, quantity));
                    break;

                case 2:
                    if (products.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado!");
                    } else {
                        System.out.println("Informações do produto:");
                        for (Product p : products) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite a quantidade a ser removida do estoque: ");
                    int quantidade = sc.nextInt();
                    product.removeProducts(quantidade);
                    break;
                case 4:
                    System.out.print("Digite a quantidade a ser adicionada do estoque: ");
                    int quantidadeAdicionada = sc.nextInt();
                    product.addProducts(quantidadeAdicionada);
                case 5:
                    System.out.println("Sistema encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
