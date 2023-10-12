package decorator;

public class LanchonetePedido implements Lanchonete {
    public float valorPedido;

    public LanchonetePedido() {
    }

    public LanchonetePedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }

    public float getValorPedido() {
        return valorPedido;
    }

    public String getEstrutura() {
        return "Pedido";
    }
}
