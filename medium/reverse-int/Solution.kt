fun main() {
    val solution = Solution()
    println(solution.reverse(123))
    println(solution.reverse(-123))
    println(solution.reverse(200))
    println(solution.reverse(Int.MAX_VALUE))
}

class Solution {
    fun reverse(x: Int): Int {
        var num = x
        val isNegative = x < 0
        if (isNegative) num = -num
        var reverse = 0
        var prev = 0
        while (num != 0) {
            val nextDigit = num % 10
            reverse = (reverse * 10) + nextDigit
            if ((reverse - nextDigit) / 10 != prev) {
                return 0
            }
            prev = reverse
            num /= 10
        }
        return if (isNegative) -reverse else reverse
    }
}
