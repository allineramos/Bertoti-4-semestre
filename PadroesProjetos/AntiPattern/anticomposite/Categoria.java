package anticomposite;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nome;
    private List<Vinho> vinhos = new ArrayList<>();
    private List<Categoria> subcategorias = new ArrayList<>();

    public Categoria(String nome) {
        this.nome = nome;
    }

    public void adicionarVinho(Vinho vinho) {
        vinhos.add(vinho);
    }

    public void adicionarSubcategoria(Categoria categoria) {
        subcategorias.add(categoria);
    }

    public void mostrar() {
        System.out.println("Categoria: " + nome);
        for (Vinho vinho : vinhos) {
            System.out.println("  - Vinho: " + vinho.getNome());
        }
        for (Categoria sub : subcategorias) {
            System.out.println("  - Subcategoria: " + sub.nome);
            sub.mostrar();
        }
    }
}