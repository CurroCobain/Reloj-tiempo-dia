class Dia() {
    var max: Int = 0
    var min: Int = 0
    var estado: Char = 'x'
        get():Char{
            return field
        }
        set(valor:Char){
            if (valor in listOf<Char>( 's','n','l')){
                field=valor
            }
        }

    constructor(max: Int, min: Int, estado:Char):this(){
        this.min= min
        this.max=max
        this.estado=estado
    }
    constructor(copiaDia: Dia):this(){
        min= copiaDia.min
        max = copiaDia.max
        estado = copiaDia.estado

    }

    fun setMin(){
        println("Introduzca la temperatura mínima del día: ")
        this.min= readln().toInt()
    }
    fun setMax(){
        println("Introduzca la temperatura máxima del día: ")
        this.max= readln().toInt()
    }
    fun setEstado(){
        println("Introduzca el estado del día: 's' soleado, 'n' nublado o 'l' lluvioso: ")
        val nuevoEstado= readln().toString()
        if (nuevoEstado[0] in listOf<Char>('s','n','l')){
            this.estado=nuevoEstado[0]
        }else{
            println("Error en el estado introducido. Introduzca el estado del día en el formato indicado anteriormente. ")
        }
    }
    fun temperaturaActual(){
        println("Introduzca la emperatura actual: ")
        val tempAct = readln().toInt()
        if (tempAct > this.max){
            this.max= tempAct
        }else if(tempAct < this.min){
            this.min=tempAct
        }
    }

    fun mostrar_prediccion(){
        var estadoMostrar=""
        when(this.estado){
            's'-> estadoMostrar="soleado"
            'n'-> estadoMostrar="nublado"
            'l'-> estadoMostrar="lluvioso"
        }
        println(" Hoy habrá una temperatura máxima de $max+º, mínima de $min+º  y se espera un día $estadoMostrar")
    }


}