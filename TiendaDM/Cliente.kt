package TiendaDM

interface Cliente  {
    abstract fun aplicaDescuento(producto: Producto): Int

    abstract fun pagar (cantidad : Float) : Boolean
}