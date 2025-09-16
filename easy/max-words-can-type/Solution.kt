fun main() {
    val solution = Solution()
    println(solution.canBeTypedWords("hello world", "ad"))
    println(solution.canBeTypedWords("leet code", "lt"))
    println(solution.canBeTypedWords("leet code", "e"))
}

class Solution {
    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        val broken = BooleanArray(26)
        for (letter in brokenLetters) {
            broken[letter - 'a'] = true
        }

        var count = 0
        var canBeTyped = true

        for (i in 0..text.length) {
            if (i < text.length && text[i] != ' ') {
                if (broken[text[i] - 'a']) {
                    canBeTyped = false
                }
            } else {
                if (canBeTyped) count++
                canBeTyped = true
            }
        }
        return count
//        var words = text.split(" ")
//        for (letter in brokenLetters) {
//            words = words.filter { word -> !word.contains(letter) }
//        }
//        return words.size
    }
}