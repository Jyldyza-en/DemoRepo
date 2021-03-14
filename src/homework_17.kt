
import kotlin.math.pow

fun main(){
    println(deposit(100.00, 10.00, 3.00))

}


fun deposit(I: Double, P: Double, t: Double): Double {

    val a = 1 + P/100
    val b = a.pow(t)
    return I * b
}


