class ArraysLeetCode {

  class ListNode(var `val`: Int) {
    var next: ListNode? = null
  }

  companion object {
    fun twoSum(nums: IntArray, target: Int): Array<Int> {
      val map = hashMapOf<Int, Int>()

      nums.forEachIndexed { index, i ->
        val get = map[target - i]
        if (get != null) {
          return arrayOf(index, get).sortedArray()
        }
        map[i] = index
      }

      return arrayOf();
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
      val number1 = mutableListOf<Int>()
      val number2 = mutableListOf<Int>()
      var li1 = l1!!
      number1.add(l1.`val`)
      var li2 = l2!!
      number2.add(l2.`val`)


      while (li1.next != null) {
        li1 = li1.next!!
        number1.add(li1.`val`)
      }
      while (li2.next != null) {
        li2 = li2.next!!
        number2.add(li2.`val`)
      }
      val maxSize = if (number1.size > number2.size) number1.size else number2.size
      val sumOfFirst = number1[0] + number2[0]
      var b = 0
      var listNode: ListNode
      if (sumOfFirst <= 9) {
        listNode = ListNode(sumOfFirst)
      } else {
        listNode = ListNode(sumOfFirst - 10)
        b = 1
      }
      var listNode2 = listNode

      if (number1.size == 1 && number2.size == 1 && b == 1) listNode2.next = ListNode(1)


      for (i in 1..maxSize - 1) {
        var a = b
        if (number1.size > i) {
          a += number1[i]
        }
        if (number2.size > i) {
          a += number2[i]
        }
        if (a <= 9) {
          listNode.next = ListNode(a)
          b = 0
          listNode = listNode.next!!
        } else {
          listNode.next = ListNode(a - 10)
          b = 1
          listNode = listNode.next!!
          if (i == maxSize - 1) {
            listNode.next = ListNode(1)
          }
        }
      }

      return listNode2
    }


  }
}


