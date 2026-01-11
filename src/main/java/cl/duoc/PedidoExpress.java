package cl.duoc;

public class PedidoExpress extends Pedido{

    public PedidoExpress(String idPedido,String direccionEntregada, String tipoPedido) {
        super( idPedido, direccionEntregada, tipoPedido);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Express]");
        System.out.println("Asignando repartidor");
        System.out.println("Repartidor mas cercano con disponibilidad inmediata encontrado");
    }
}
