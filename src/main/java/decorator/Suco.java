package decorator;

public class Suco extends LanchoneteDecorator {
    public Suco(Lanchonete lanchonete) {
        super(lanchonete);
    }

    public String getNomeEstrutura() {
        return "Suco";
    }

    public float getPrecoProduto() {
        return 5.2f;
    }
}
