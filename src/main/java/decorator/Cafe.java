package decorator;

public class Cafe extends LanchoneteDecorator {
    public Cafe(Lanchonete lanchonete) {
        super(lanchonete);
    }

    public String getNomeEstrutura() {
        return "Café";
    }

    public float getPrecoProduto() {
        return 2.5f;
    }
}
