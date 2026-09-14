fun FirstReverse(str: String): String {

  // code goes here  
  var chars = str.toCharArray()
  var left = 0
  var right = str.length - 1
  var aux: Char = ' '
  while (left < right) {
    aux = chars[left]
    chars[left] = chars[right]
    chars[right] = aux
    left +=1
    right -=1
  }
  
  return chars.concatToString();
  
}

fun main() {
val teste = "I Love Code"
  println(FirstReverse(teste))
}