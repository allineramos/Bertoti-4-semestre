package strategy;

public class DescontoAniversario implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double preco) {
        return preco * 0.9; // 10% de desconto
    }
}