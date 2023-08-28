fun main() {
    val arrayList = arrayListOf<Int>(
        5,2,35,6,76,4,32,1,34,5,4
    )

    mergeSort(arrayList)

    println(arrayList)
}

fun mergeSort(list: ArrayList<Int>) {
    val listSize = list.size
    if(listSize <= 1) return
    
    val firstHalf = arrayListOf<Int>()
    val secondHalf = arrayListOf<Int>()
    
    var i: Int = 0
    while (i < listSize/2){
        firstHalf.add(list[i])
        i++
    }
    while (i < listSize){
        secondHalf.add(list[i])
        i++
    }

    mergeSort(firstHalf)
    mergeSort(secondHalf)
    
    merge(firstHalf, secondHalf, list)
    
}

fun merge(firstHalf: ArrayList<Int>, secondHalf: ArrayList<Int>, list: ArrayList<Int>) {
    var i = 0 // sorted list iterator
    var j = 0 // firstHalf iterator
    var k = 0 // secondHalf iterator

    while (j < firstHalf.size && k < secondHalf.size) {
        if (firstHalf[j] <= secondHalf[k]) {
            list[i] = firstHalf[j]
            i++
            j++
        } else {
            list[i] = secondHalf[k]
            i++
            k++
        }
    }
        while (j < firstHalf.size) {
            list[i] = firstHalf[j]
            i++
            j++
        }

        while (k < secondHalf.size){
            list[i] = secondHalf[k]
            i++
            k++
        }

}


