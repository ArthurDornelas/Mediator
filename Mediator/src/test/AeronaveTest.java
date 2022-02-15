package test;

import org.junit.jupiter.api.Test;
import padrao.mediator.Aeronave;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AeronaveTest {
    @Test
    void devePedirAutorizacaoPouso() {
        Aeronave aeronave = new Aeronave();
        assertEquals("A Torre de controle recebeu seu pedido de pouso\nO controlador respondeu seu pedido: O controlador autorizou seu pedido de pouso Aeronave 555",
                aeronave.pedirAutorizacaoPouso("Aeronave 555"));
    }

    @Test
    void devePedirAutorizacaoDecolagem() {
        Aeronave aeronave = new Aeronave();
        assertEquals("A Torre de controle recebeu seu pedido de decolagem\nO controlador respondeu seu pedido: O controlador autorizou seu pedido de decolagem Aeronave 555",
                aeronave.pedirAutorizacaoDecolagem("Aeronave 555"));
    }
}
