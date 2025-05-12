package composite;

public class Vinho implements VinhoComponent {
    private String nome;

    public Vinho(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrar() {
        System.out.println("  - Vinho: " + nome);
    }
}