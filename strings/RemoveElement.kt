class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var escrita = 0 // valor k que vai ser retornado

        for (leitura in nums.indices) {
            if (nums[leitura] != `val`) {
                nums[escrita] = nums[leitura]
                escrita++
            } 
        }
        return escrita
    }
}