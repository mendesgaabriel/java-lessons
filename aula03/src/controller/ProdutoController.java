// https://youtu.be/ujyJ4TIW9X4?list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL
package controller;

public class ProdutoController {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 18.50, 100); //produto1 é umainstância da classe Produto (ou, simplesmente um objeto)
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());
        produto1.setEstoque(-100);
        System.out.println(produto1.getEstoque());


        Produto produto2 = new Produto("Feijão", 8.30, 100);
        System.out.println();
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());

        Produto produto3 = new Produto();
        System.out.println();
        System.out.println(produto3.getNome());
        System.out.println(produto3.getValor());
        System.out.println(produto3.getEstoque());

        Produto produto4 = new Produto();
        System.out.println();
        System.out.println(produto4.getNome());
        System.out.println(produto4.getValor());
        System.out.println(produto4.getEstoque());


        //Métodos construtores; - Método especial, utilizado com a palavra reservada 'new', usado na construção de objetos na mem. ram
        //Introdução ao encapsulamento
        //Métodos acessores

    }
}
class Produto{
    private String nome;
    private double valor;
    private int estoque;

    public Produto() {
    }

    public Produto(String nome, double valor, int estoque) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome; //this utilizado quando há conflito de nomes
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        int novoEstoque = this.estoque + estoque;
        if(novoEstoque > 0){
        this.estoque = estoque;

        }
    }
} //fim classe Produto
