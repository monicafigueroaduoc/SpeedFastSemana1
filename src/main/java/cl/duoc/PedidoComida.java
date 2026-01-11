package cl.duoc;

public class PedidoComida extends Pedido{

    public PedidoComida(String idPedido,String direccionEntregada,  String tipoPedido) {
        super(idPedido, direccionEntregada, tipoPedido);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando mochila termica...OK");
    }
}
