package TiendaDM

class Pelicula(Titulo : String, precio : Double, Anyo_publicacion: Int, descuentoProducto: Int = 0, Genero : Genero_Pelicula, Director : String) : Producto(Titulo, precio, Anyo_publicacion, descuentoProducto) {
    override fun obtenerDescuento(): Int {
        TODO()
    }


}