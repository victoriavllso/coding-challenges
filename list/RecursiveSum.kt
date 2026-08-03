fun RecursiveSum(list: List<Int>): Int {

	// base case
	if (list.size == 1)  { // could be use 0 and return 0
		return list.single()
	}

	return list.first() + RecursiveSum(list.drop(1))

}


fun main() {
	val array = listOf(50,1,5,7)
	val result = RecursiveSum(array)
	println(result)
}