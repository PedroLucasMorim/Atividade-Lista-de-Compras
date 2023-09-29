package ListaCompras;
import java.util.ArrayList;

public class Lista {           //Aqui estou definindo a classe da Lista e suas funções, o que ela tem dentro

    private String nome;
    private ArrayList<Produtos> produtos;

    public Lista(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public ArrayList<Produtos> getProdutos(){
        return produtos;
    }
    

    public void adicionarprodutos(Produtos produto){
        produtos.add(produto); 
    }
    public void retirarprodutos(Produtos produto){
        produtos.remove(produto);
    }
    public double valortotal(Produtos produto){
        for (Produtos produto:produtos){
            valortotal+= produto.getValor();
        }
        return valortotal;
    }
    public double pesototal(){
        for(Produtos produto:produtos){
            pesototal+=peso.getValor();
        }
    }

    public String toString(){
        return "Lista:"+nome+"Produtos:"+produtos.toString()+"Valor Total:"+valortotal()+"Peso Total:"+pesototal();
    }

    

     




    
}
