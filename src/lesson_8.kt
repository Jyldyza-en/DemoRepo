

fun main(){

    //array

    /*val a = 1
    val b = 2
    val c = 3*/

    //element 42 0 0 0 322
    //index   0  1 2 3   4
//1 способ создать массив
    val myArray:Array<Int> = Array(5){0} //size это количество элементов в масссиве
            //{0} это значение элементов
    myArray[0] = 42
    myArray[4] = 322

    println(myArray[4])

    //2 способ
    val myArray1:Array<Int> = arrayOf(1, 2, 3, 4, 5)

    myArray1[0] = 5

    println(myArray1[0])

    //ArrayList

    val myArraylist = ArrayList<String>() //пустой список
    //val myArrayList = arrayListOf<String>()

    myArraylist.add("Kotlin")  //добавить элемент
    myArraylist.add("Java")  //добавить элемент
    myArraylist.add("Dart")  //добавить элемент

    myArraylist.add(1, "Python")//добавить нов элемент под 1 индексом, он будет между котлин и джава

    myArraylist.removeAt(2)//удалить элемент по индексу

    myArraylist.remove("Dart")//удалить по элементу

    println(myArraylist)
    println(myArraylist.size)



}