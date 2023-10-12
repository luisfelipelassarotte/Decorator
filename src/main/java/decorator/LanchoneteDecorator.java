package decorator;

public abstract class LanchoneteDecorator implements Lanchonete {
    public Lanchonete lanchonete;
    public String estrutura;

    public LanchoneteDecorator(Lanchonete lanchonete) {
        this.lanchonete = lanchonete;
    }

    public Lanchonete getLanchonete() {
        return lanchonete;
    }

    public void setLanchonete(Lanchonete lanchonete) {
        this.lanchonete = lanchonete;
    }

    public abstract float getPrecoProduto();

    public float getValorPedido() {
        return this.lanchonete.getValorPedido() + this.getPrecoProduto();
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.lanchonete.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura() {
        this.estrutura = estrutura;
    }
}
