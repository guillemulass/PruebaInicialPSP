package TiendaDM

abstract class Producto(Titulo : String, precio : Double, Anyo_publicacion: Int, descuentoProducto: Int = 0) {

    abstract fun obtenerDescuento() : Int

}