


fun main(){
//квадрат
    for (i in 1..4){
        for( j in 1..5){
            print(" *")
        }
        println()
    }
//треугольник
    for (i in 0..5){
        for (j in 5 downTo 1){
            if (i < j)
                print("  ")
            else
                print(" *")
        }
        println()
    }

    println("-----------------------------")

    println("Введите число:")
    var num = readLine()!!.toInt()

    var sum = 0

    while (num != 0) {
        num /= 10
        sum++
    }
    println(sum)

    println("-----------------------------")

    var i = 2
    var n = 0
    while (n < 20) {
        print("$i ")
        i *= 2
        n++
    }

}