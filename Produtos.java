package ListaCompras;
import java.util.Scanner;

//Aqui vai ser a Interface, onde não necessriamente estarão os códigos principais
//Local onde deve estar métodos abstratos de classes que vamos implementar

public class Produtos{     
    private String nome;
    private double valor;  //Atributos da classe Coisas (que é os Produtos)
    private double peso;

    public Produtos(String nome, double valor, double valor){
        this.nome = nome;
        this.valor = valor;
        this.peso = peso;
    }
    
    public String getNome() {     //Agora tamo fazer os métodos especiais para ninguém ficar fuçando os códigos
        return nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor){
        this.valor=valor;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }

    public String toString(){
        return "Nome:"+nome+"Valor:"+valor+"Peso:"+peso;
    }



}