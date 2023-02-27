enum class Colors(){
    Red,
    Purple,
    Green,
    White,
    Yellow,
    Blue,
    Gray,
    Brown,
    Orange,
    LightBlue,
    Pink,
    Aqua,
    Magenta,
    Cyan;
    fun RandomColor(){//Вывод случайного цвета из списка
        println("Случайный цвет")
        val color = Colors.values().toList()
        println(color[(0..Colors.values().size).random()])
    }
    fun OutAllColors(){//вывод всех цветов в списке
        println("Вывод всех цветов")
        println(Colors.values().toList())
    }
    fun ColorInRainbow(){//Есть ли выбранный пользователем цвет в радуге
        var check: Boolean = false
        println("Введите цвет из списка на английском, чтобы узнать, есть ли он в радуге")
        val color:String = readLine()!!.toString().lowercase()
        val listofcolors = Colors.values().toList()
        for(i in 0 until listofcolors.size) {
            if(listofcolors[i].toString().lowercase()==color)
                check =true
        }
        if(check == false)
            println("Такого цвета нет в списке")
        else if(color!="red"&&color!="orange"&&color!="green"&&color!="yellow"&&color!="lightblue"&&color!="blue"&&color!="purple")
            println("Такого цвета нет в радуге")
        else
            println("Этот цвет есть в радуге")
    }
    fun CMYKsystem(){//Есть ли выбранный пользователем цвет в цветовой модели CMYK
        println("Выбирите цвет для проверки в цветовой модели CMYK(цвет пишется с заглавной буквы на английском языке")
        while(true){
            try {
                val color = Colors.valueOf(readLine()!!).toString()
                if(color =="Cyan"||color =="Magenta"||color =="Yellow"||color =="Black") {
                    println("Этот цвет есть в цветовой модели CMYK")
                    break
                }
                else{
                    println("Этого цвета нет в цветовой модели CMYK")
                    break
                }
            }
            catch (e:Exception){
                println("Этого цвета нет в списке")
            }
        }
    }
}
