fun main() {

    val z1 = Solution()
    println( z1.twoSum(intArrayOf(3,2,4),5))



}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray{


        for(i in 0..nums.size-1){
            for(j in i+1..nums.size-1){
                if(nums[i] + nums[j] == target){
                    return intArrayOf(i,j)
                }
            }
        }
      return intArrayOf()
    }
}