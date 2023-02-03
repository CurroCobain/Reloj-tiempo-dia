class Reloj() {
    var casio: Hora= Hora()
    fun menu(hora: Hora) {
        var opcion = 0
        while (opcion != 6) {
            println(
                """
            Reloj 
            ------ 
            1. Mostrar hora 12 
            2. Mostrar hora 24 
            3. Modificar horas 
            4. Modificar minutos 
            5. Modificar segundos 
            6. Salir. 
        """.trimIndent()
            )
            opcion = readln().toInt()
            when(opcion){
                1->{casio.hora12()}
                2->{casio.hora24()}
                3->{casio.modificarHora()}
                4->{casio.modificarMinutos()}
                5->{casio.modificarSegundos()}
                6->{
                    println("Ha elegido salir, que tenga un buen día.")
                    break
                }

            }
        }
    }
}