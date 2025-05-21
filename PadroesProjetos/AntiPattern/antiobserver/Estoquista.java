package antiobserver;

public class Estoquista {
    public void alerta(String nomeVinho, int estoque) {
        System.out.println("[Estoque Crítico] Vinho: " + nomeVinho + " | Quantidade: " + estoque);
    }
}