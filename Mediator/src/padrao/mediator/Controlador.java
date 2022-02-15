package padrao.mediator;

public class Controlador {
    private static Controlador instancia = new Controlador();

    public Controlador() {}

    public static Controlador getInstancia() {
        return instancia;
    }

    public String receberPedidoPouso(String mensagem) {
        return "O controlador autorizou seu pedido de pouso " + mensagem;
    }

    public String receberPedidoDecolagem(String mensagem) {
        return "O controlador autorizou seu pedido de decolagem " + mensagem;
    }
}
