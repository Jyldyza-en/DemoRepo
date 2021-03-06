fun main(){
    println("Введите 1е число")
    val line = readLine()
    val a = line!!.toInt()

    println("Введите 2е число")
    val line2 = readLine()
    val b = line2!!.toInt()

    val value = a + b
    println("Ответ a+b = $value")

 //Вычитание:

    println("Введите 1е число")
    val lined = readLine()
    val c = lined!!.toInt()

    println("Введите 2е число")
    val lined2 = readLine()
    val d = lined2!!.toInt()

    val value2 = c - d
    println("Ответ a-b = $value2")
}
