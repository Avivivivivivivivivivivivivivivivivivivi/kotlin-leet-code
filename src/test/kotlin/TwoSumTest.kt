import kotlin.test.Test

class TwoSumTest {
  @Test
  fun `example one test`() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    assert(ArraysLeetCode.twoSum(nums, target) contentEquals arrayOf(0, 1))
  }

  @Test
  fun `example two test`() {
    val nums = intArrayOf(3, 2, 4)
    val target = 6
    assert(ArraysLeetCode.twoSum(nums, target) contentEquals arrayOf(1, 2))
  }

  @Test
  fun `example three test`() {
    val nums = intArrayOf(3, 3)
    val target = 6
    assert(ArraysLeetCode.twoSum(nums, target) contentEquals arrayOf(0, 1))
  }
}