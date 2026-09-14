fun BracketCombinations(num: Int): Int {
  // catalan formula
  val numerator = aux(2 * num)
  val denominator = aux (num + 1) * aux(num)

  val result = numerator/denominator
  // code goes here  
  return result;
  
}

fun aux(num: Int): Int {
    // case base
    if (num ==0) {
        return 1
    }
  return num * aux(num-1)
}