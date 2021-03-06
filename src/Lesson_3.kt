
var value: String? = null
fun main() {
    value = "Kotlin"

    // Safe call operator(?.)
    println(value?.length)

    // Safe call with let (?.let)
    value?.let{
        println(it.length)
    }

    // Elvis operator(?:)
    val length = if(value != null){
        value!!.length
    }else{
        -1
    }
    println(length)

    val length2 = value?.length ?: -1

    println(length)

    //Non null assertion operator(!!)

    //lateinit keyword
}