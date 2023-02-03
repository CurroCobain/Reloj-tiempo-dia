class Hora() {
    private var hora: Int = 0
        get():Int{
            return field
        }
        set(valor:Int){
            if (valor in 0..23){
                field=valor
            }else if(valor > 23){
                field= valor-24
            }
        }
    private var minutos:  Int = 0
        get():Int{
            return field
        }
        set(valor:Int){
            if (valor in 0..59){
                field=valor
            }else if(valor > 59){
                field=valor%60
                hora+=valor/60
            }
        }
    private var segundos: Int = 0
        get():Int{
            return field
        }
        set(valor:Int){
            if (valor in 0..59){
                field=valor
            }else if(valor > 59){
                field=valor%60
                minutos+=valor/60
            }
        }
    constructor(hor: Int, min: Int, seg: Int): this(){
        this.hora=hor
        this.minutos= min
        this.segundos=seg
    }

    fun hora12(){
        var horamt=0
        if (this.hora >12){
            horamt=this.hora - 12
            println(" Son las $horamt hora/s $minutos minutos y $segundos segundos de la tarde ")
        }else{
            horamt=this.hora
            println(" Son las $horamt hora/s $minutos minutos y $segundos segundos de la mañana")
        }

    }
    fun hora24(){
        println(" Son las $hora hora/s $minutos minutos y $segundos segundos ")
    }
    fun modificarHora(){
        println("Introduzca la hora: ")
        this.hora= readln().toInt()
    }
    fun modificarMinutos(){
        println("Introduzca los minutos: ")
        this.minutos= readln().toInt()
    }
    fun modificarSegundos(){
        println("Introduzca los segundos: ")
        this.segundos= readln().toInt()
    }

}