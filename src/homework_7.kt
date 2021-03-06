
fun main(){
    //if, else
    val a = 7
    val message =
            if(a % 2 == 0)
                "a is even"
            else if (a % 2 != 0 && a % 5 == 0)
                "a is divisible by 5 "
            else
                "a is not even and not divisible by 5"

    println(message)


    //when

    val b = 7
    val message2 =
            when{
                b % 2 == 0 -> "b is even"
                b % 2 != 0 && b % 5 == 0 -> "b is divisible by 5 "
                else -> "a is not even and not divisible by 5"
            }
    println(message2)
}