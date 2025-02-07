class Gato(nombre:String): Animal() {

    fun maullar(){
        println("$nombre está maullando!!!")
    }

    override fun toString(): String {
        return "Este es mi gato $nombre"
    }
}