class Perro (nombre: String): Animal() {

    fun ladrar(){
        println("$nombre está ladrando!!!")
    }

    override fun toString(): String {
        return "Este es mi perro $nombre"
    }
}