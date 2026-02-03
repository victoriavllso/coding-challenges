class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var k = 1
        var cont = 1

        for (i in 1 until nums.size) {
            if(nums[i] == nums[i-1]){
                cont++
            } else {
                cont = 1
            }

            if (cont <= 2) {
                nums[k] = nums[i]
                k++
            }
        }
        return k
        
    }
}