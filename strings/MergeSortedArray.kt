class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var ultimo_nums1 = m - 1
        var ultimo_nums2 = n - 1
        var pos = m + n - 1

        while (ultimo_nums2 >=0) {
            if ( ultimo_nums1 >= 0 && nums1[ultimo_nums1] >= nums2[ultimo_nums2]) {
                nums1[pos] = nums1[ultimo_nums1]
                ultimo_nums1--
            } else{
                nums1[pos] = nums2[ultimo_nums2]
                ultimo_nums2--
            }
            pos--
        }
    }
}
