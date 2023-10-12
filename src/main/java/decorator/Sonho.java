package decorator;

public class Sonho extends LanchoneteDecorator {
    public Sonho(Lanchonete lanchonete) {
        super(lanchonete);
    }

    public String getNomeEstrutura() {
        return "Sonho";
    }

    public float getPrecoProduto() {
        return 3.2f;
    }
}
