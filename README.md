## Ejemplo de lcase para gestionar los pedidos online a restaruates

1. Plato: platos que puedes pedir: id, nombre, precio, descripcion
2. Cliente: dni, nombre, email, telefono
3. Estado del pedido: 
   -  PENDIENTE,
   -  EN_PROCESO,
   -  ENTREGADO,
   -  CANCELADO
4. Pedido: id, fecha, cliente, direccion, estado, List<Plato> platos;)
5. Pedidos: ArrayList <Pedido>
6. Ordenación de pedidos por:
    - Fecha
    - Cliente
    - Estado
7. Gestor de pedidos: nombreRestaurante, Map<String, Pedido> pedidos (codigo - pedido)