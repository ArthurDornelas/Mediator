package padrao.mediator;

public class TorreControle {
    private static TorreControle instacia = new TorreControle();

    private TorreControle() {}

    public static TorreControle getInstance() {
        return instacia;
    }

    public String receberPedidoPousoControlador(String mensagem) {
        return "A Torre de controle recebeu seu pedido de pouso\n" +
                "O controlador respondeu seu pedido: " +
                Controlador.getInstancia().receberPedidoPouso(mensagem);
    }

    public String receberPedidoDecolagemControlador(String mensagem) {
        return "A Torre de controle recebeu seu pedido de decolagem\n" +
                "O controlador respondeu seu pedido: " +
                Controlador.getInstancia().receberPedidoDecolagem(mensagem);
    }
}
