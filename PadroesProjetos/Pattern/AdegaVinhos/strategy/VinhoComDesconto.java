package strategy;

public class VinhoComDesconto {
    private String nome;
    private double preco;
    private DescontoStrategy desconto;

    public VinhoComDesconto(String nome, double preco, DescontoStrategy desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public void aplicarDesconto() {
        double precoComDesconto = desconto.aplicarDesconto(preco);
        System.out.println("Vinho: " + nome + " | Preço original: R$" + preco + " | Com desconto: R$" + precoComDesconto);
    }
}