
fun main(){

    println("Введите четырехзначное число:")
    val numb = readLine()!!.toInt()

    if (numb / 1000 + (numb / 100) % 10 == (numb / 10) % 10 + numb % 10)
        println(true)
    else
        println(false)


//Задание №2
    println("Введите свой возраст:")
    val age = readLine()!!.toInt()

    val k = age % 10

    if( age <= 1 || age > 199)
        println("Возраст указан некоректно")
    else {
        if (k == 1 && age != 11 )
            println("$age год")
        else {
            if (k == 4 && age != 14 || k == 3 && age != 13 || k == 2 && age != 12)
                println("$age года")
            else
                println("$age лет")
        }
    }
}