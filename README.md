# 🍽️ Sistema de Gestión de Pedidos Online

## 📌 Descripción
Este proyecto implementa un sistema básico para gestionar pedidos online de un restaurante, permitiendo manejar clientes, platos y el estado de los pedidos.

---

## 🧩 Modelo de Datos

### 1. Plato
Representa los platos disponibles para pedir:
- `id`
- `nombre`
- `precio`
- `descripcion`

### 2. Cliente
Información del cliente:
- `dni`
- `nombre`
- `email`
- `telefono`

### 3. Estado del Pedido
Estados posibles:
- `PENDIENTE`
- `EN_PROCESO`
- `ENTREGADO`
- `CANCELADO`

### 4. Pedido
Representa un pedido realizado:
- `id`
- `fecha`
- `cliente`
- `direccion`
- `estado`
- `List<Plato> platos`

### 5. Pedidos
Colección de pedidos:
- `ArrayList<Pedido>`

---

## 🔄 Ordenación de Pedidos

Los pedidos se pueden ordenar por:
- 📅 Fecha
- 👤 Cliente
- 📦 Estado

---

## 🏪 Gestor de Pedidos

Encargado de administrar los pedidos del restaurante:

- `nombreRestaurante`
- `Map<String, Pedido> pedidos` *(clave: código del pedido)*

---

## ⚙️ Dependencias

- Java 25
- Maven

---

## 🚀 Instrucciones de Ejecución

1. Compilar el proyecto:
```bash
mvn clean compile