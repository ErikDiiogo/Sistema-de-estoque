package Java.Projetos.SistemadeEstoque;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("=== Sistema de Estoque ===");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Buscar Produtos");
            System.out.println("4 - Remover Produto");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            System.out.println("Digite uma opção: ");
                
            if (opcao == 1) {

                System.out.println("Nome do produto:  ");
                String nome = scanner.next();

                System.out.println("Preço: ");
                double preco = scanner.nextDouble();

                System.out.println("Quantatidade: ");
                int quantidade = scanner.nextInt();

                System.out.println("Produto adicionado com sucesso!");

                Produto produto = new Produto(nome, preco, quantidade);
                estoque.adicionarProduto(produto);
            } else if(opcao == 2){
                System.out.println("=== Lista de Produtos ===");
                estoque.listarProduto();

            } else if (opcao == 3){
                System.out.println("Qual produto vc quer buscar? ");
                String Buscarnome = scanner.next();
                estoque.buscarProduto(Buscarnome);

            } else if (opcao == 4){
                System.out.println("Qual produto você quer remover? ");
                String removernome = scanner.next();
                estoque.removerProduto(removernome);
            } else {
                System.out.println("Obrigado por usar nosso sistema!!");
            }
            
        }while(opcao != 0);

         scanner.close();
    }
    }