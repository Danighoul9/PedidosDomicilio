package Services;

import Models.Pedido;

import java.util.*;

public class GestorDePedidos {
    private String nombreRestaurante;
    private Map<String, Pedido> pedidos; // Codigo - pedido

    public GestorDePedidos(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
        this.pedidos = new HashMap<>();
    }

    /**
     * Agregar un pedio al gestor de pedidos
     * @param pedido
     */
    public void addPedido(Pedido pedido){
        this.pedidos.put(nombreRestaurante.substring(0,3).toUpperCase() + "_" + pedido.getId(), pedido);
    }

    /**
     * Muestra todos los pedidos
     */
    public void mostrarPedidos(){
        IO.println("--- Pedidos ---");
        for (String codigo : pedidos.keySet()){
            IO.println(codigo + "\n" + pedidos.get(codigo).mostrarPedido());
        }
    }

    public void mostrarPedidosPorFecha(){
        // Convertir a lista
        List<Pedido> pedidosFecha = new ArrayList<>(pedidos.values());

        // Ordenarlos por fecha
        pedidosFecha.sort(Comparator.comparing(Pedido::getFecha));

        IO.println("--- PEDIDOS ORDENADOS POR FECHA ---");
        for (Pedido p : pedidosFecha){
            IO.println(p.mostrarPedido());
        }
    }


    public void mostrarPedidosPorEstado(){
        // Convertir a lista
        List<Pedido> pedidosFecha = new ArrayList<>(pedidos.values());

        // Ordenarlos por fecha
        pedidosFecha.sort(Comparator.comparing(Pedido::getEstado));

        IO.println("--- PEDIDOS ORDENADOS POR FECHA ---");
        for (Pedido p : pedidosFecha){
            IO.println(p.mostrarPedido());
        }
    }

    public void mostrarPedidosOrdenadosPorCliente() {
        //Sacar todos los pedidos con values()
        List<Pedido> pedidosCliente = new ArrayList<>(pedidos.values());
        //Ordenarlos por fecha
        pedidosCliente.sort(Comparator.comparing((p1) -> p1.getCliente().getNombre()));
        IO.println("--- PEDIDOS ORDENADOS POR CLIENTE ---");
        for(Pedido pedido : pedidosCliente) {
            IO.println(pedido.mostrarPedido());
        }
    }

    public void mostrarPedidosOrdandosPorEstado() {
        //Sacar todos los pedidos con values()
        List<Pedido> pedidosEstado = new ArrayList<>(pedidos.values());
        //Ordenarlos por fecha
        pedidosEstado.sort(Comparator.comparing(Pedido::getEstado).reversed());
        IO.println("--- PEDIDOS ORDENADOS POR ESTADO ---");
        for(Pedido pedido : pedidosEstado) {
            IO.println(pedido.mostrarPedido());
        }
    }


}

