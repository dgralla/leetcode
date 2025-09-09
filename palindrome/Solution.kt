class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var reverse = 0
        var copy = x
        while (copy > 0) {
            reverse = (reverse * 10) + (copy % 10)
            copy /= 10
        }
        return x == reverse
    }
}
