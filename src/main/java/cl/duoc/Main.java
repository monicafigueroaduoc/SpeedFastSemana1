package cl.duoc;

public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new PedidoComida("P001", "Av Las Rosas 1470", "Comida");
        Pedido pedido2 = new PedidoEncomienda("P002", "Manuel Rodriguez 780", "Encomienda");
        Pedido pedido3 = new PedidoExpress("P003", "Los Carrera Poniente 21", "Compra Express");

        pedido1.asignarRepartidor();
        pedido1.asignarRepartidor("Rogelio Hernandez");

        System.out.println();

        pedido2.asignarRepartidor();
        pedido2.asignarRepartidor("Rafael Bravo");

        System.out.println();

        pedido3.asignarRepartidor();
        pedido3.asignarRepartidor("Marcela Carrasco");
    }


}
