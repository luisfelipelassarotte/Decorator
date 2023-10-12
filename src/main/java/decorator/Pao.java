package decorator;

public class Pao extends LanchoneteDecorator {
    public Pao(Lanchonete lanchonete) {
        super(lanchonete);
    }

    public String getNomeEstrutura() {
        return "Pão";
    }

    public float getPrecoProduto() {
        return 1;
    }
}
