fun main(){
    val miReloj1=Hora(23,32,35)
    val miReloj2=Hora(12,25,36)
    miReloj1.hora24()
    miReloj1.hora12()
    miReloj2.hora24()
    miReloj2.hora12()
    var casio=Reloj()
    casio.menu(Hora())
    var enero1 =Dia(20,10,'s')
    var enero2 =Dia(enero1)
    var enero3 =Dia(22,12,'s')
    enero1.mostrar_prediccion()
    enero2.mostrar_prediccion()
    enero1.setMax()
    enero1.setMin()
    enero1.setEstado()
    enero1.mostrar_prediccion()
    enero2.mostrar_prediccion()
    val lanzarPrediccion= Ejecutar()
    lanzarPrediccion.main()

}