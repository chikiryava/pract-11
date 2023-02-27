enum class DaysOfTheWeek {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;
    fun WeekendsOrNot(){
        println("Введите день недели на английском с заглавной буквы")
        while(true) {
            try {
                val day = DaysOfTheWeek.valueOf(readLine()!!).toString()
                if(day== "Saturday"&&day=="Sunday")
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
    fun ListOfDays():List<DaysOfTheWeek>{
        println("Список дней:")
        return values().toList()
    }
    fun PreviousDay(){
        var day:String
        println("Введите день недели на английском с заглавной буквы")
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
        for(i in 0..6){
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
    fun SelectDay(){
        println("Введите номер дня от 1 до 7")
        var num: Int
        while(true){
            try {
                num = readLine()!!.toInt()
                if (num < 1 || num > 7)
                    println("Введите номер для, который подходит под условия")
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