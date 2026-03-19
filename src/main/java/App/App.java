package App;

import Models.Cliente;
import Models.Pedido;
import Models.Plato;
import Services.GestorDePedidos;

public class App {
    public static void main(String[] args) {
        GestorDePedidos gp = new GestorDePedidos("A que vuelves");

        //Creamos los clientes
        Cliente c1 = new Cliente(23335437, "Daniel", "daniel@gmail.com",677889333);
        Cliente c2 = new Cliente(27990114, "Ernesto", "ernudo@gmail.com",622300211);

        //Creamos los pedidos
        Pedido pr1 = new Pedido(c1, "Calle Sevilla 33, Vera");
        pr1.addPlato(new Plato(14,"Smash burguer doble barbacoa", 15.50, ""));
        pr1.addPlato(new Plato(15,"Dichosa", 16.50, ""));
        pr1.addPlato(new Plato(25,"Ración patatas fritas", 12.50, ""));

        Pedido pr2 = new Pedido(c2, "Calle Córdoba 2, Garrucha");
        pr2.addPlato(new Plato(14,"Smash burguer doble barbacoa", 15.50, ""));
        pr2.addPlato(new Plato(14,"Smash burguer doble barbacoa", 15.50, ""));
        pr2.addPlato(new Plato(25,"Ración patatas fritas", 12.50, ""));

        gp.addPedido(pr1);
        gp.addPedido(pr2);

        gp.mostrarPedidos();
        gp.mostrarPedidosPorFecha();
        gp.mostrarPedidosOrdenadosPorCliente();
        gp.mostrarPedidosOrdandosPorEstado();






    }
}
