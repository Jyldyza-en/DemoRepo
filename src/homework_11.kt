

var myMap: MutableMap<String, String>? = null

fun main(){

    val names = arrayOf("KG","RU", "USA", "TR")

    val codes = arrayOf("+996", "+7", "+1", "+98")

    myMap = mutableMapOf()

    for (i in names.indices) {
        myMap!![names[i]] = codes[i]
    }

    println(myMap)
    println(myMap!!["KG"])

}

