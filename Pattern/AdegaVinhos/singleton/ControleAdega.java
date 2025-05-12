package singleton;

public class ControleAdega {
    private static ControleAdega instancia;

    private ControleAdega() {
        System.out.println("Controle da adega criado.");
    }

    public static ControleAdega getInstancia() {
        if (instancia == null) {
            instancia = new ControleAdega();
        }
        return instancia;
    }

    public void exibirMensagem() {
        System.out.println("Acesso único ao controle da adega garantido.");
    }
}