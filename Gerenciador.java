package ListaCompras;
import java.util.ArrayList;


public class Gerenciador {
    private ArrayList<Produtos>produtos;
    private ArrayList<Lista> listas;
    
    //Aqui onde a parada vai acontecer e ser controlada
    //Deve ter os métodos: Cadastrar Produtos; Listar Produtos; Criar Lista; Adicionar Produtos; Adicionar Listas; Listar Listas
    //Lembrando que tem que ser tudo privado, ngm pode mexe

    public Gerenciador(){
        listas=new ArrayList<>();
        produtos=new ArrayList<>();
    }

    public String cadastrarProduto(String nome, double valor, double peso){
       Produtos novoitem = new Produto (nome, valor, peso);
       produtos.add(novoitem);
       return "Cadastro feito com sucesso.";

        for (Produtos produto:produtos){
            if(produto.getNome().equals(nome)){
                return "Esse produto já está Cadastrado, meu nobre";
            }
        }
    }

    public String listarProdutos(){
        for(Produtos produto:produtos){
            result.append("Nome: ").append(produto.getNome()).append(" Valor: ").append(produto.getValor())
            .append(" Peso: ").append(produto.getPeso()).append("\n");
        }
        return result.toString();
    }

    public String criarLista(String nome){
        for (Lista lista:listas){
            if (lista.getNome().equals(nome)){
                return "Essa Lista já está Cadastrada, meu nobriga";
            }
        }

    Lista novalista = new Lista(nome);
    listas.add(novalista);
    return "Lista criada com sucesso";
    }

    public String adicionarProduto(String nomeProduto, String nomeLista){
        for (Produtos p:produtos){
            if (p.getNome().equals(nomeProduto)){
                produto = p;
                break;
            }
        }

    Lista lista = null;
    for (Lista 1:listas){
        if (1.getNome().equals(nomeLista)){
            lista=1;
            break;
        }
    }

    if (produtos==null){
        return "Produto não encontrado";
    }
    if (lista==null){
        return "Lista não encontrada";
    }

    lista.adicionarProduto(produto);
    return "Adicionado";
    }

    public String listarListas(){
        for (Lista lista:listas){
            result.append(lista.getNome()).append("\n");
        }
        return result.toString();
    }

    public String detalhesLista(String nome){
        Lista lista=null;
        for (Lista 1:listas){
            if (1.getNome().equals(nomeLista)){
                lista = 1;
                break;
            }
        }

        if (produto == null || lista == null || !lista.contemProduto(produto)) {
            return "Informações Inválidas";
        }

        lista.removerProduto(produto);
        return "Removido";

    }
}
