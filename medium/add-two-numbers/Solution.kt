class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val head = ListNode(0)
        var curr = head
        var carry = 0
        var li1 = l1; var li2 = l2
        while (carry != 0 || li1 != null || li2 != null) {
            var sum = carry

            li1?.let {
                sum += it.`val`
                li1 = it.next
            }

            li2?.let {
                sum += it.`val`
                li2 = it.next
            }

            carry = sum / 10
            curr.next = ListNode(sum % 10)
            curr = curr.next!!
        }
        return head.next
    }
}
