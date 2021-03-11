

fun main(){    //точка входа в приложение
    sayHelloKotlin() //передаем аргумент

    println(getMax(5, 6))

    println(getMax(7.0, 9.0))

    println(getMax(7, 9, 3))

    printInts(1,2,2,23,4)


}

fun printInts(vararg ints: Int){ //если в аргументах у нас массив, мы можем использовать vararg, чтобы при вызове функции не создавать массив,
                                 // а просто передать элементы
    for (i in ints) println(i)
}

fun getMax(num1: Int, num2: Int): Int{ //Int за скобками говорит что функция должна вернуть 1 число

    return if (num1 > num2) num1 else num2 // !!! после ретерна никакой код больше не работает
}


fun getMax(num1: Double, num2: Double): Double{  //!!! мы можем создавать функции с одинак именами, но аргументы должны быть разными

    return if (num1 > num2) num1 else num2
}


fun getMax(num1: Int, num2: Int, num3: Int): Int{

    return when{
        num1 > num2 && num1 > num3 -> num1
        num2 > num1 && num2 > num3 -> num2
        else -> num3
    }
}
fun sayHelloKotlin(name: String = "Kotlin", reps: Int = 1){ //name - аргумент, аргументов может быть не больше 3-4, иначе код станет нечитабельным
    var counter: Int = reps                                 //после типа данных в аргументе мы можем передать значение по умолчанию
                                                            //т.е. если при вызове функции мы не передадим значение аргументов, то они сработ по умолчанию
    //for (i in 0 until reps)
    //    println("Hello $name! Where are you?")

    while (counter > 0) {
        println("Hello $name! Where are you?")
        counter--
    }
}