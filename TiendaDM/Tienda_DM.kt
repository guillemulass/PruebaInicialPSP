package TiendaDM

fun main(){

    var listaProductos = mutableListOf<Producto>()
    var listaCliente = mutableListOf<Cliente_registrado>()

    fun addProducto (producto: Producto){
        listaProductos.add(producto)
    }
    fun addCliente (cliente: Cliente_registrado){
        listaCliente.add(cliente)
    }

    fun buscarProducto() : Int {
        return TODO()
    }

    fun buscarDisco() : Disco{
        return TODO()
    }
    fun buscarPelicula() : Pelicula{
        return TODO()
    }

    fun compraPelicula(numEjemplares : Int) : Double{
        return TODO()
    }
    fun compraDisco(numEjemplares : Int) : Double{
        return TODO()
    }

    var Client1 = Cliente_registrado("Pepe", "Perez", "49988340W", "666548360", 0.0)
    addCliente(Client1)

    var Prodct1 = Pelicula("Las Aventuras de Pepe", 10.0, 2024, 0, "", "pepe")
    addProducto(Prodct1)


}