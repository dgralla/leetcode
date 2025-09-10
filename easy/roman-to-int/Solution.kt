fun main() {
    val solution = Solution()
    println(solution.romanToInt("III"))
    println(solution.romanToInt("LVIII"))
    println(solution.romanToInt("MCMXCIV"))
}

class Solution {
    private fun romanCharToInt(s: Char): Int {
        return when (s) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }

    fun romanToInt(s: String): Int {
        var res = 0
        for ((i, ch) in s.withIndex()) {
            if (i + 1 < s.length && romanCharToInt(ch) < romanCharToInt(s[i + 1])) {
                res -= romanCharToInt(ch)
            } else {
                res += romanCharToInt(ch)
            }
        }
        return res
    }
}
