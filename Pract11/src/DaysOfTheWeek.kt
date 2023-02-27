enum class DaysOfTheWeek {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;
    fun WeekendsOrNot(){//Будний или выходной день
        println("Введите день недели на английском с заглавной буквы")
        while(true) {
            try {
                val day = DaysOfTheWeek.valueOf(readLine()!!).toString()
                if(day== "Saturday"||day=="Sunday")
                    println("Выходной")
                else
                    println("Будний день")
                break

            }
            catch (e:Exception){
                println("Такого дня недели нет")
            }
        }
    }
    fun ListOfDays(){//Список дней
        println("Список дней:")
        println(DaysOfTheWeek.values().toList())
    }
    fun PreviousDay(){//Какой день был предыдущим от того, который ввел пользователь
        var day:String
        println("Введите день недели на английском с заглавной буквы, чтобы узнать, какой день был предыдущим")
        while(true) {
            try {
                day = DaysOfTheWeek.valueOf(readLine()!!).toString()
                break
            }
            catch (e: Exception) {
                println("Такого дня недели нет")
            }
        }
        val days = DaysOfTheWeek.values().toList()
        for(i in 0 until days.size){
            if(day=="Monday") {
                println("Sunday")
                break
            }
            else if(day==days[i].toString()) {
                println("Предыдущий день ${days[i - 1]}")
                break
            }
        }
    }
    fun SelectDay(){//Вывод дня недели по номеру
        println("Введите номер дня от 1 до 7")
        var num: Int
        while(true){
            try {
                num = readLine()!!.toInt()
                if (num < 1 || num > 7)
                    println("Введите номер, который подходит под условия")
                else
                    break
            }
            catch (e:Exception){
                println("Вы ввели не число")
            }
        }
        val days = DaysOfTheWeek.values().toList()
        println(days[num-1])
    }
}