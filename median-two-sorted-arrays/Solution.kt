class Solution {
    private var p1 = 0
    private var p2 = 0
    private fun getMin(nums1: IntArray, nums2: IntArray): Int {
        if (p1 < nums1.size && p2 < nums2.size) {
            if (nums1[p1] < nums2[p2]) {
                return nums1[p1++]
            }
            return nums2[p2++]
        } else if (p1 < nums1.size) {
            return nums1[p1++]
        } else {
            return nums2[p2++]
        }
    }

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val mergedSize = nums1.size + nums2.size

        if (mergedSize % 2 == 0) {
            for (i in 1..< mergedSize / 2) {
                getMin(nums1, nums2)
            }
            return (getMin(nums1, nums2) + getMin(nums1, nums2)) / 2.0
        } else {
            for (i in 1..mergedSize / 2) {
                getMin(nums1, nums2)
            }
            return getMin(nums1, nums2).toDouble()
        }
    }
}
