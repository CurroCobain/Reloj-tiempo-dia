class Ejecutar() {
    var ejecutarPredicion: Prediccion = Prediccion()

    fun main(){
        ejecutarPredicion.dia1.setMax()
        ejecutarPredicion.dia1.setMin()
        ejecutarPredicion.dia1.setEstado()
        ejecutarPredicion.dia2.setMax()
        ejecutarPredicion.dia2.setMin()
        ejecutarPredicion.dia2.setEstado()
        ejecutarPredicion.dia3.setMax()
        ejecutarPredicion.dia3.setMin()
        ejecutarPredicion.dia3.setEstado()
        ejecutarPredicion.dia1.mostrar_prediccion()
        ejecutarPredicion.dia2.mostrar_prediccion()
        ejecutarPredicion.dia3.mostrar_prediccion()
        ejecutarPredicion.dia1.temperaturaActual()
        ejecutarPredicion.dia2.temperaturaActual()
        ejecutarPredicion.dia3.temperaturaActual()
        ejecutarPredicion.dia1.mostrar_prediccion()
        ejecutarPredicion.dia2.mostrar_prediccion()
        ejecutarPredicion.dia3.mostrar_prediccion()

    }
}