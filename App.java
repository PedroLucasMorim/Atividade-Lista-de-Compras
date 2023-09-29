package ListaCompras;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();

        System.out.println(gerenciador.cadastrarProduto("Arroz", 10.0, 0.5));
        System.out.println(gerenciador.cadastrarProduto("Produto2", 20.0, 1.0));
        System.out.println(gerenciador.listarProdutos());

        System.out.println(gerenciador.criarLista("Lista de compras"));
        
        System.out.println(gerenciador.listarListas());

        System.out.println(gerenciador.adicionarProdutos("Arroz", "Lista de compras"));
        
        System.out.println(gerenciador.detalhesLista("Lista de compras"));

       
}

}
    

