package observer;

import java.util.ArrayList;
import java.util.List;

public class VinhoObservable {
    private String nome;
    private int estoque;
    private List<Observer> observers = new ArrayList<>();

    public VinhoObservable(String nome, int estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    public void adicionarObserver(Observer o) {
        observers.add(o);
    }

    public void reduzirEstoque(int quantidade) {
        estoque -= quantidade;
        if (estoque <= 2) {
            notificarObservers();
        }
    }

    private void notificarObservers() {
        for (Observer o : observers) {
            o.atualizar(nome, estoque);
        }
    }
}