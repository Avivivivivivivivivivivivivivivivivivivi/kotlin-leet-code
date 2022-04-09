import org.junit.jupiter.api.Test

class AddTwoNumbersTest {
  @Test
  fun `example one test`() {
    var listNode = ArraysLeetCode.ListNode(2)
    val listNode2 = ArraysLeetCode.ListNode(4)
    listNode2.next = ArraysLeetCode.ListNode(3)
    listNode.next = listNode2


    val list2Node = ArraysLeetCode.ListNode(5)
    val list2Node2 = ArraysLeetCode.ListNode(6)
    list2Node2.next = ArraysLeetCode.ListNode(4)
    list2Node.next = list2Node2
    ArraysLeetCode.addTwoNumbers(listNode, list2Node)
  }

  @Test
  fun `example two test`() {
    var listNode = ArraysLeetCode.ListNode(5)
    val listNode2 = ArraysLeetCode.ListNode(5)

    ArraysLeetCode.addTwoNumbers(listNode, listNode2)
  }

  @Test
  fun `example xone test`() {
    val array = arrayOf(1, 2, 3, 4, 5)
    var listNode = ArraysLeetCode.ListNode(1)
    var listNode2 = listNode
    for (i in 1 until array.size) {
      listNode.next = ArraysLeetCode.ListNode(array[i])
      listNode = listNode.next!!
    }
//    listNode.next = listNode2
    println("test")
  }
}