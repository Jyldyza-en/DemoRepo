
import java.time.*

//Задание №1


fun main() {
    println("ax^2 + bx + c = 0")
    println("Введите a, b и c:")
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()

    val disc = b * b - 4 * a * c

    when {
        (disc > 0.0) -> {
            val x1 = (-b - kotlin.math.sqrt(disc)) / (2 * a)
            val x2 = (-b + kotlin.math.sqrt(disc)) / (2 * a)
            println("Корни уравнения: x1 = $x1, x2 = $x2")
        }
        (disc == 0.0) -> {
            val x = -b / (2 * a)
            println("Корень уравнения: x = $x")
        }
        else -> {
            println("Корней нет")
        }
    }

//Задание №2
    val time1 = LocalTime.of(9,25)
    val time2 = LocalTime.of(13,1)
    val durat = Duration.between(time1, time2)
    val res = durat.toMinutes()
    println("Поезд был в пути $res минут")

    //Задание №3
    println("Введите 2 числа:")
    var first = readLine()!!.toInt()
    var second = readLine()!!.toInt()
    println("Пользователь ввел - first=$first, second=$second")

    val other = first + second
    first = other - first
    second = other - second
    println("Переменные с изменными значениями - first=$first, second=$second")
}
