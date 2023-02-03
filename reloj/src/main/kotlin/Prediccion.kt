class Prediccion() {
    var dia1: Dia = Dia()
    var dia2: Dia = Dia()
    var dia3: Dia = Dia()

    fun mostrarDia(){
        println("Elija el día que quiere ver: 1, 2 o 3 ")
        val opcion= readln().toInt()
        when(opcion){
            1-> dia1.mostrar_prediccion()
            2-> dia2.mostrar_prediccion()
            3-> dia3.mostrar_prediccion()
        }
    }

    fun modificarPrevision(){
        println("Elija el día que quiere modificar: 1, 2 o 3 ")
        val opcionPre= readln().toInt()
        when(opcionPre){
            1->{dia1.setMax()
                dia1.setMin()
                dia1.setEstado()}
            2->{dia2.setMax()
                dia2.setMin()
                dia2.setEstado()}
            3->{dia3.setMax()
                dia3.setMin()
                dia3.setEstado()}
        }
    }
    fun modificarActual(){
        println("Elija el día que quiere modificar: 1, 2 o 3 ")
        val opcionMod= readln().toInt()
        when(opcionMod){
            1->dia1.temperaturaActual()
            2->dia2.temperaturaActual()
            3->dia3.temperaturaActual()
        }
    }
}