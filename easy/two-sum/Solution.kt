fun main() {
    val solution = Solution()
    println(intArrayToString(solution.twoSum(intArrayOf(2, 7, 11, 15), 9)))
    println(intArrayToString(solution.twoSum(intArrayOf(3, 2, 4), 6)))
}

fun intArrayToString(nums: IntArray): String {
    if (nums.isEmpty()) return "[]"
    var res = "["
    for (n in nums) {
        res += "$n, "
    }
    return res.dropLast(2) + "]"
}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        for ((index, value) in nums.withIndex()) {
            if (value in map) {
                return intArrayOf(map[value] as Int, index)
            }
            map[target - value] = index
        }
        return intArrayOf()
    }
}
