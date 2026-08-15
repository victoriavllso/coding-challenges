fun Partition(list: List<Int>, pivo: Int): Triple<List<Int>, List<Int>, List<Int>> {
    val menores = mutableListOf<Int>()
    val iguais = mutableListOf<Int>()
    val maiores = mutableListOf<Int>()
    
    for (item in list) {
        when {
            item < pivo -> menores.add(item)
            item == pivo -> iguais.add(item)
            item > pivo -> maiores.add(item)
        }
    }
    return Triple(menores,iguais, maiores)
    
}

fun QuickSort(list: List<Int>): List<Int> {
	 
	// case base 
	if (list.size == 0) {
		return list
	}

	val index = list.size/2
	val pivo = list[index]

    val (menores, iguais, maiores) = Partition(list, pivo)
    
	return QuickSort(menores) + iguais + QuickSort(maiores)
}

fun main() {
	val list = listOf(40,0,5,-4,2,2,1,6,8)
	val result = QuickSort(list)
	println(result)
}