package composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria implements VinhoComponent {
    private String nome;
    private List<VinhoComponent> itens = new ArrayList<>();

    public Categoria(String nome) {
        this.nome = nome;
    }

    public void adicionar(VinhoComponent componente) {
        itens.add(componente);
    }

    @Override
    public void mostrar() {
        System.out.println("Categoria: " + nome);
        for (VinhoComponent item : itens) {
            item.mostrar();
        }
    }
}