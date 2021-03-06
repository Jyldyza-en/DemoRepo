

fun main(args: Array<String>){

    val arr: IntArray = intArrayOf(10, 2, 10, 3, 1, 2, 5, 2, -1, 3)
    var t: Int

    print("unsorted numbers: ")
    for (i in 0..9)
        print(" "+arr[i])
    for (i in 0..9){
        for (j in 1 until 10){
            if (arr[j - 1]>arr[j]){
                t = arr[j - 1]
                arr[j-1]=arr[j]
                arr[j]= t

            }
        }
    }
    println()
    print("sorted numbers: ")
    for (i in 0..9)
        print(" "+arr[i])

}