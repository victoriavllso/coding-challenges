fun HighestValue(list: List<Int>): Int {
	// case base
	if (list.size == 1) {
		return list.first()
	}
	val next = HighestValue(list.drop(1)) 
	if (list.first() > next) {
		return list.first()
	}
	return HighestValue(list.drop(1))

}

fun main() {
	val list = listOf(0,1,60,8)
	val result = HighestValue(list)
	println(result)
}