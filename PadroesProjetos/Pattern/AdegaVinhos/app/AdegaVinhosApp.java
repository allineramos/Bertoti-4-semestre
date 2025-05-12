package app;

import composite.*;
import observer.*;
import strategy.*;
import singleton.ControleAdega;

public class AdegaVinhosApp {
    public static void main(String[] args) {
        // Composite
        Categoria tinto = new Categoria("Tintos");
        tinto.adicionar(new Vinho("Malbec"));
        tinto.adicionar(new Vinho("Cabernet Sauvignon"));

        Categoria branco = new Categoria("Brancos");
        branco.adicionar(new Vinho("Chardonnay"));

        Categoria adega = new Categoria("Minha Adega");
        adega.adicionar(tinto);
        adega.adicionar(branco);
        adega.mostrar();

        // Observer
        VinhoObservable vinhoObs = new VinhoObservable("Merlot", 3);
        vinhoObs.adicionarObserver(new Estoquista("Carlos"));
        vinhoObs.reduzirEstoque(2);

        // Strategy
        VinhoComDesconto vinhoDesconto = new VinhoComDesconto("Syrah", 100.0, new DescontoAniversario());
        vinhoDesconto.aplicarDesconto();

        // Singleton
        ControleAdega controle = ControleAdega.getInstancia();
        controle.exibirMensagem();
    }
}