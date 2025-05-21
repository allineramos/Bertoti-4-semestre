package antistrategy;

public class Vinho {
    private String nome;
    private double preco;

    public Vinho(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void aplicarDesconto(String tipoDesconto) {
        double precoFinal = preco;
        if ("aniversario".equals(tipoDesconto)) {
            precoFinal = preco * 0.9;
        } else if ("queima".equals(tipoDesconto)) {
            precoFinal = preco * 0.8;
        } else {
            precoFinal = preco;
        }

        System.out.println("Vinho: " + nome + " | Preço com desconto: R$" + precoFinal);
    }
}