

fun main(){

    //For loop

    val names = arrayListOf("Kotlin", "Java", "Dart")
//1
    for(name in names){
        println(name)
    }
 //2
    for (i in 0..2){        //i=0
        println(names[i])   //i = 0+1 i=1+1
    }
    //3
    for(i in 0 until names.size){
        println(names[i])
    }
    //4
    names.forEach { println(it)}
    //5 с индексом вывод
    names.forEachIndexed { index, name ->
        println("$index $name")
    }

    //6 с шагами вывод

    for(i in 0..10 step 2){
        println(i)
    }
    //7 по убыванию вывод
    for(i in 10 downTo 0 step 2){
        println(i)
    }
    //8 continue
    for(i in 0..10){
        if(i == 6) continue // когда for loop доходит до 6 из-за континю 6 игнорируется
        println(i)          //и переходит к следующей итерации
    }
    //9 break
    for(i in 0..10){
        if(i == 6) break  //for loop дошел до 6 и завершился(прервался)
        println(i)
    }


    //while loop
    println("---------------------------------------------")
    var j = 11

    while ( j <= 10){
        println(j)
        j++ //увеличиваем джей ровно на 1
    }

    //do while loop

    var k = 11

    do{
        println(k)
        k++
    }while (k <= 10)  //даже если условие ложь, do while вызовится хоть 1 раз
                      //в этом и отличиие с while
}