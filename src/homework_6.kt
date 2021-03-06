import kotlin.math.*

fun  main(){
    //Задание №1
    println("Введите номер месяца(от 1 до 12 включительно)")

    when (val month = readLine()!!.toInt()) {
        1 -> println("Месяц $month - дней 31")
        2 -> println("Месяц $month - дней 28")
        3 -> println("Месяц $month - дней 31")
        4 -> println("Месяц $month - дней 30")
        5 -> println("Месяц $month - дней 31")
        6 -> println("Месяц $month - дней 30")
        7 -> println("Месяц $month - дней 31")
        8 -> println("Месяц $month - дней 31")
        9 -> println("Месяц $month - дней 30")
        10 -> println("Месяц $month - дней 31")
        11 -> println("Месяц $month - дней 30")
        12 -> println("Месяц $month - дней 31")
    }


    //Задание №2
    println("Введите координаты точки(x;y)")
    val x = readLine()!!.toDouble()
    val y = readLine()!!.toDouble()

    println("Введите радиус круга")
    val r = readLine()!!.toDouble()

    val hypotenuse = sqrt(x*x+y*y)

    when{
        hypotenuse <= r -> println("точка принадлежит кругу")
        else -> println("точка не принадлежит кругу")
    }
}



