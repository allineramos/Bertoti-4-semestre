package observer;

public class Estoquista implements Observer {
    private String nome;

    public Estoquista(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeVinho, int estoque) {
        System.out.println("[Alerta Estoquista " + nome + "]: Estoque do vinho '" + nomeVinho + "' está baixo: " + estoque);
    }
}