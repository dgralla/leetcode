import kotlin.math.max

fun main() {
    val solution = Solution()
    println(solution.lengthOfLongestSubstring("abcabcbb"))
    println(solution.lengthOfLongestSubstring("bbbb"))
    println(solution.lengthOfLongestSubstring("the quick brown fox jumps over the lazy dog"))
}

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val result: HashSet<Char> = hashSetOf()
        var maxLen = 0
        var left = 0
        for (right in s.indices) {
            while (result.contains(s[right])) {
                result.remove(s[left])
                left++
            }
            result.add(s[right])
            maxLen = max(maxLen, right - left + 1)
        }
        return maxLen
    }
}