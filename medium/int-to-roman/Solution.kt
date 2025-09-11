fun main() {
    val solution = Solution()
    println(solution.intToRoman(1000))
    println(solution.intToRoman(1994))
    println(solution.intToRoman(9))
    println(solution.intToRoman(47))
    println(solution.intToRoman(3749))
}

class Solution {
    fun intToRoman(n: Int): String {
        if (n == 0) return ""
        if (n >= 1000) {
            return "M" + intToRoman(n - 1000)
        }
        if (n >= 500) {
            if (n >= 900) return "CM" + intToRoman(n - 900)
            return "D" + intToRoman(n - 500)
        }
        if (n >= 100) {
            if (n >= 400) return "CD" + intToRoman(n - 400)
            return "C" + intToRoman(n - 100)
        }
        if (n >= 50) {
            if (n >= 90) return "XC" + intToRoman(n - 90)
            return "L" + intToRoman(n - 50)
        }
        if (n >= 10) {
            if (n >= 40) return "XL" + intToRoman(n - 40)
            return "X" + intToRoman(n - 10)
        }
        if (n >= 1) {
            if (n == 9) return "IX"
            if (n >= 5) return "V" + intToRoman(n - 5)
            if (n == 4) return "IV"
            return "I" + intToRoman(n - 1)
        }
        return ""
    }
}
