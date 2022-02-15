package padrao.mediator;

public class Aeronave {
    public String pedirAutorizacaoPouso(String mensagem) {
        return TorreControle.getInstance().receberPedidoPousoControlador(mensagem);
    }

    public String pedirAutorizacaoDecolagem(String mensagem) {
        return TorreControle.getInstance().receberPedidoDecolagemControlador(mensagem);
    }
}
