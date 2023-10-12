package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanchoneteTest {

    @Test
    void deveRetornarPedidoVazio() {
        Lanchonete lanchonete = new LanchonetePedido(0.0f);

        assertEquals(0.0f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarPedidoComCafe() {
        Lanchonete lanchonete = new Cafe(new LanchonetePedido(0.0f));

        assertEquals(2.5f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarPedidoComSuco() {
        Lanchonete lanchonete = new Suco(new LanchonetePedido(0.0f));

        assertEquals(5.2f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarPedidoComPao() {
        Lanchonete lanchonete = new Pao(new LanchonetePedido(0.0f));

        assertEquals(1.0f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarPedidoComSonho() {
        Lanchonete lanchonete = new Sonho(new LanchonetePedido(0.0f));

        assertEquals(3.2f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarPedidoComCafeESuco() {
        Lanchonete lanchonete = new Suco(new Cafe(new LanchonetePedido(0.0f)));

        assertEquals(7.7f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarPedidoComCafeEPao() {
        Lanchonete lanchonete = new Pao(new Cafe(new LanchonetePedido(0.0f)));

        assertEquals(3.5f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarPedidoComCafeESonho() {
        Lanchonete lanchonete = new Sonho(new Cafe(new LanchonetePedido(0.0f)));

        assertEquals(5.7f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarPedidoComSucoEPao() {
        Lanchonete lanchonete = new Pao(new Suco(new LanchonetePedido(0.0f)));

        assertEquals(6.2f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarPedidoComSucoESonho() {
        Lanchonete lanchonete = new Sonho(new Suco(new LanchonetePedido(0.0f)));

        assertEquals(8.4f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarPedidoComPaoESonho() {
        Lanchonete lanchonete = new Sonho(new Pao(new LanchonetePedido(0.0f)));

        assertEquals(4.2f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarPedidoComCafeESSucoEPao() {
        Lanchonete lanchonete = new Pao(new Suco(new Cafe(new LanchonetePedido(0.0f))));

        assertEquals(8.7f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarPedidoComCafeESucoESonho() {
        Lanchonete lanchonete = new Sonho(new Suco(new Cafe(new LanchonetePedido(0.0f))));

        assertEquals(10.9f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarPedidoComSucoEPaoESonho() {
        Lanchonete lanchonete = new Sonho(new Pao(new Suco(new LanchonetePedido(0.0f))));

        assertEquals(9.4f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarPedidoComSucoEPaoESonhoECafe() {
        Lanchonete lanchonete = new Cafe(new Sonho(new Pao(new Suco(new LanchonetePedido(0.0f)))));

        assertEquals(11.9f, lanchonete.getValorPedido());
    }

    @Test
    void deveRetornarEstruturaPedido() {
        Lanchonete lanchonete = new LanchonetePedido();

        assertEquals("Pedido", lanchonete.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComCafe() {
        Lanchonete lanchonete = new Cafe(new LanchonetePedido());

        assertEquals("Pedido/Café", lanchonete.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComSuco() {
        Lanchonete lanchonete = new Suco(new LanchonetePedido());

        assertEquals("Pedido/Suco", lanchonete.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComPão() {
        Lanchonete lanchonete = new Pao(new LanchonetePedido());

        assertEquals("Pedido/Pão", lanchonete.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComSonho() {
        Lanchonete lanchonete = new Sonho(new LanchonetePedido());

        assertEquals("Pedido/Sonho", lanchonete.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComCafeESuco() {
        Lanchonete lanchonete = new Suco(new Cafe(new LanchonetePedido()));

        assertEquals("Pedido/Café/Suco", lanchonete.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComCafeEPao() {
        Lanchonete lanchonete = new Pao(new Cafe(new LanchonetePedido()));

        assertEquals("Pedido/Café/Pão", lanchonete.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComCafeESonho() {
        Lanchonete lanchonete = new Sonho(new Cafe(new LanchonetePedido()));

        assertEquals("Pedido/Café/Sonho", lanchonete.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComSucoEPao() {
        Lanchonete lanchonete = new Pao(new Suco(new LanchonetePedido()));

        assertEquals("Pedido/Suco/Pão", lanchonete.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComSucoESonho() {
        Lanchonete lanchonete = new Sonho(new Suco(new LanchonetePedido()));

        assertEquals("Pedido/Suco/Sonho", lanchonete.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComPaoESonho() {
        Lanchonete lanchonete = new Sonho(new Pao(new LanchonetePedido()));

        assertEquals("Pedido/Pão/Sonho", lanchonete.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComCafeESucoEPao() {
        Lanchonete lanchonete = new Pao(new Suco(new Cafe(new LanchonetePedido())));

        assertEquals("Pedido/Café/Suco/Pão", lanchonete.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComCafeESucoESonho() {
        Lanchonete lanchonete = new Sonho(new Suco(new Cafe(new LanchonetePedido())));

        assertEquals("Pedido/Café/Suco/Sonho", lanchonete.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComSucoEPaoESonho() {
        Lanchonete lanchonete = new Sonho(new Pao(new Suco(new LanchonetePedido())));

        assertEquals("Pedido/Suco/Pão/Sonho", lanchonete.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPedidoComSucoEPaoESonhoECafe() {
        Lanchonete lanchonete = new Cafe(new Sonho(new Pao(new Suco(new LanchonetePedido()))));

        assertEquals("Pedido/Suco/Pão/Sonho/Café", lanchonete.getEstrutura());
    }

}