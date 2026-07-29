package Java.Projetos.SistemadeEstoque;

import java.util.ArrayList;

public class Estoque{
    
   private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    public void listarProduto(){
        for (Produto p : produtos) {
            System.out.println(p.getNome() + " | R$ " + p.getPreco() + " | " + p.getQuantidade() + " unidades");
        } 
    }
    public void buscarProduto(String nome){
        for (Produto p : produtos) {
            if ( p.getNome().equalsIgnoreCase(nome)){
                System.out.println("Produtos encontrados: " + p.getNome());
            } else {
        System.out.println("Produto não encontrado");
     }
        }
    }
    public void removerProduto(String nome){
     Produto paraRemover = null;
     for (Produto p : produtos) {
        if (p.getNome().equalsIgnoreCase(nome)){
            paraRemover = p;
        }
     }

     if (paraRemover != null) {
        produtos.remove(paraRemover);
        System.out.println("Produto " + paraRemover.getNome() + " foi removido");
     } else {
        System.out.println("Produto não encontrado");
     }
    }
}
