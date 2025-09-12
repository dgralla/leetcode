import kotlin.math.min

fun main() {
    val solution = Solution()
    println(solution.longestCommonPrefix(arrayOf("flower", "flow", "flash")))
    println(solution.longestCommonPrefix(arrayOf("dog","racecar","car")))
}

class Solution {
    private fun commonPrefix(str1: String, str2: String): String {
        var result = ""
        val maxLen = min(str1.length, str2.length)
        for (i in 0..< maxLen) {
            if (str1[i] != str2[i]) {
                break
            }
            result += str1[i]
        }
        return result
    }

    fun longestCommonPrefix(strs: Array<String>): String {
        strs.sort()
        return commonPrefix(strs.first(), strs.last())
    }

//    fun longestCommonPrefix(strs: Array<String>): String {
//        if (strs.size == 1) return strs[0]
//        var result = strs[0]
//        for (i in 1 until strs.size) {
//            result = commonPrefix(result, strs[i])
//            if (result == "") break
//        }
//        return result
//    }
}
