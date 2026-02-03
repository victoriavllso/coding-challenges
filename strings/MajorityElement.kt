// aqui fiz duas soluções, sendo que a primeira segue espaço e tempo linear


class Solution {
	// tempo O(n) e espaço O(1)
    fun majorityElement(nums: IntArray): Int {
        var candidato = 0
        var contador = 0

        for (num in nums ) {
            if (contador == 0) {
                candidato = num
            }

            if (num == candidato) {
                contador++
            } else {
                contador--
            } 
        }
        return candidato
    }
}

class Solution {
	// tempo O(n) e espaço O(n)

    fun majorityElement(nums: IntArray): Int {
        val contagem = mutableMapOf<Int, Int>()
        val n = nums.size

        for (num in nums) {
            // se o num já existe, soma 1. Se não, começa com 0 e soma 1.
            contagem[num] = contagem.getOrDefault(num, 0) + 1
            
            if (contagem[num]!! > n / 2) {
                return num
            }
        }

        return -1 
    }
}