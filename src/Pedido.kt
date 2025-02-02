class Pedido(val cliente: String, val fecha: String) {

    private val productos = mutableListOf<Pair<Producto, Int>>()
    var estado: EstadoPedido = EstadoPedido.PDTE
    private val pagos = mutableListOf<Pago>()

    fun agregarProducto(producto: Producto, cantidad: Int) {
        productos.add(Pair(producto, cantidad))
    }

    fun calcularTotal(): Double {
        return productos.sumOf { (producto, cantidad) -> producto.precio * cantidad * (1 + producto.impuestos) }
    }

    fun actualizarEstado(nuevoEstado: EstadoPedido) {
        estado = nuevoEstado
    }
}