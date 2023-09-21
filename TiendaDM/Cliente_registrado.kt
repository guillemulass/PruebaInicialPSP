package TiendaDM

class Cliente_registrado (Nombre : String, Apellidos : String, DNI_NIF : String, Telefono : String, Saldo : Double, Descuento : Double = 0.02){

    var dni_nif = DNI_NIF

    var descuento = Descuento

    fun valida_dni (dni_nif : String) : Boolean{

        if (dni_nif.length == 8 || dni_nif.length == 9) return true
        else return false
    }

    fun esVIP () : Boolean{
        var VIP = false
        return VIP
    }

    fun actualizaDescuento(Saldo: Double) : Double{
        var cont = 0
        return if (descuento >= 0.3) 0.3
        else{
            if (Saldo >= 100.0){
                descuento += 0.5
                while (cont < Saldo){
                    if (descuento >= 0.3) break
                    if (Saldo % 50 == 0.0 && Saldo > 100.0) descuento+=0.01
                    cont++
                }
            }
            descuento
        }
    }

}