fun main(){
    println("С каким классном хотите работать?(Colors или DaysOfTheWeek)")
    while (true) {
        when(readLine()!!.toString()){
            "Colors"->{//Класс Colors
                val color = Colors.Blue
                color.RandomColor()
                color.OutAllColors()
                color.ColorInRainbow()
                color.CMYKsystem()
                break
            }
            "DaysOfTheWeek"-> {//Класс DaysOfTheWeek
                val day = DaysOfTheWeek.Monday
                day.WeekendsOrNot()
                day.ListOfDays()
                day.PreviousDay()
                day.SelectDay()
                break
            }
            else -> println("Такого класса нет")
        }
    }
}