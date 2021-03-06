

fun main(){

    val score = -5

    when (score) {
        in 90..100 -> println("5")
        in 70..89 -> println("4")
        in 50..69 -> println("3")
        in 30..49 -> println("2")
        in 0..29 -> println("1")
        else -> println("invalid score")
    }

    val a = 5
    val b = 3

    val maxValue = when(a>b) {
        true -> a
        false -> b
    }
    println("maxvalue: $maxValue")
}