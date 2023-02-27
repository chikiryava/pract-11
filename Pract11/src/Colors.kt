import java.util.*

enum class Colors(){
    Red,
    Purpule,
    Green,
    White,
    Yellow,
    Blue,
    Gray,
    Brown,
    Orange,
    LightBlue;
    fun RandomColor(){
        val rnd:Int = (0..7).random()
        val color = Colors.values().toList()
        println(color[rnd])
    }
    fun OutAllColors(){
        println("Вывод всех цветов")
        println(Colors.values().toList())
    }
    fun ColorInRainbow(){
        var check: Boolean = false
        println("Введите цвет из списка на английском, чтобы узнать, есть ли он в радуге")
        val color:String = readLine()!!.toString()
        color.tol
        val listofcolors = Colors.values().toList()
        for(i in 0..9) {
            if(listofcolors[i].toString()==color)
                check =true
        }
        if(check == false)
            println("Такого цвета нет в списке")
        else if(color!="Red"&&color!="Orange"&&color!="Green"&&color!="Yellow"&&color!="LightBlue"&&color!="Blue"&&color!="Purpule")
            println("Такого цвета нет в радуге")
        else
            println("Этот цвет есть в радуге")
    }


}
