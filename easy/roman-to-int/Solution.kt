fun main() {
    val solution = Solution()
    println(solution.romanToInt("III"))
    println(solution.romanToInt("LVIII"))
    println(solution.romanToInt("MCMXCIV"))
}

class Solution {
    fun romanToInt(s: String): Int {
        var copy = s
        var roman = 0
        while (copy.isNotEmpty()) {
            when (copy.take(1)) {
                "I" -> {
                    if (copy.take(2) == "IV") {
                        roman += 4
                        copy = copy.drop(1)
                    }
                    else if (copy.take(2) == "IX") {
                        roman += 9
                        copy = copy.drop(1)
                    }
                    else roman += 1
                }
                "V" -> roman += 5
                "X" -> {
                    if (copy.take(2) == "XL") {
                        roman += 40
                        copy = copy.drop(1)
                    }
                    else if (copy.take(2) == "XC") {
                        roman += 90
                        copy = copy.drop(1)
                    }
                    else roman += 10
                }
                "L" -> roman += 50
                "C" -> {
                    if (copy.take(2) == "CD") {
                        roman += 400
                        copy = copy.drop(1)
                    }
                    else if (copy.take(2) == "CM") {
                        roman += 900
                        copy = copy.drop(1)
                    }
                    else roman += 100
                }
                "D" -> roman += 500
                "M" -> roman += 1000
            }
            copy = copy.drop(1)
        }
        return roman
    }
}
