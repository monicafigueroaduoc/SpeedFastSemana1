package cl.duoc;

public class Pedido {

    private String idPedido;
    private String direccionEntregada;
    private String tipoPedido;

    public Pedido(String idPedido,String direccionEntregada,  String tipoPedido) {

        this.idPedido = idPedido;

        this.direccionEntregada = direccionEntregada;

        this.tipoPedido = tipoPedido;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public String getDireccionEntregada() {
        return direccionEntregada;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void asignarRepartidor(){
        System.out.println("Asignando repartidor...");
        System.out.println("Asignacion generica de pedido");
    }


    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Pedido asignado a: " + nombreRepartidor);
    }
}
