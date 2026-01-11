package cl.duoc;

public class PedidoEncomienda extends Pedido{

    public PedidoEncomienda(String idPedido, String direccionEntregada, String tipoPedido) {
        super(idPedido, direccionEntregada, tipoPedido);
    }
    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("Validando peso y embalaje...OK");
    }
}
