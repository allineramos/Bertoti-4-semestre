package antiobserver;

public class EstoqueVinho {
    private String nome;
    private int estoque;
    private Estoquista estoquista;

    public EstoqueVinho(String nome, int estoque, Estoquista estoquista) {
        this.nome = nome;
        this.estoque = estoque;
        this.estoquista = estoquista;
    }

    public void reduzirEstoque(int qtd) {
        estoque -= qtd;
        if (estoque <= 2) {
            estoquista.alerta(nome, estoque);
        }
    }
}