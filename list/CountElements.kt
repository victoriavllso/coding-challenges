fun CountElements(list: List<Int>): Int {
	 
	// case base 
	if (list.size == 0) {
		return 0
	}

	return 1 + CountElements(list.drop(1))
}

fun main() {
	val list = listOf(40,6,5,4,2,1,1,6,8)
	val result = CountElements(list)
	println(result)
}