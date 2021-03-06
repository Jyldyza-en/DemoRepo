

fun main(){

    //Map

    val password = "12345"
    val username = "onepunchman"
    val name = "John"


    val myMap = hashMapOf<String, String>()

    myMap.put("password","12345")
    myMap.put("username","onepunchman")
    myMap.put("name", "John")

    println(myMap.entries)

    myMap.remove("name")

    println(myMap.entries)

    println(myMap.get("password"))

    //set

    val mySet = HashSet<Int>()   //значения должны быть уникальными
    mySet.add(1)   //похожие значения он будет игнорировать
    mySet.add(1)   //выведет только 1, 2, 3
    mySet.add(2)
    mySet.add(2)
    mySet.add(1)
    mySet.add(3)

    println(mySet)

    val list = arrayListOf(1,2,3,4,4,4,4,1,1)

    mySet.addAll(list)

    println(mySet)
}