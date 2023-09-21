package TiendaDM

class Disco(Titulo : String, precio : Double, Anyo_publicacion: Int, descuentoProducto: Int = 0, Genero : Genero_Disco, Grupo : String, Stock : Int) : Producto(Titulo, precio, Anyo_publicacion, descuentoProducto) {
    override fun obtenerDescuento(): Int {
        TODO()
    }
}