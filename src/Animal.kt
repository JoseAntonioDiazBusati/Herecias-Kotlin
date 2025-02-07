open class Animal {

    var nombre: String = "Desconocido"

    fun comer(){
        println("$nombre está comiendo...")
    }

    override fun toString(): String {
        return "Animal(nombre = $nombre)"
    }
}