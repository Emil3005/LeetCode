/* 1. Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.
 * 
 */

class TwoSums{
    private static int[] input = {3,2,4,15};
    private static int target = 6;
    private static int[] result = new int[2];
    public static void main(String[] args) {
        result = twoSum(input, target);
        System.out.println("Solution = [" + result[0] + "," + result[1] + "]");
    }

    public static int[] twoSum(int[] p_nums, int p_target){
        for(int i=0;i<p_nums.length;i++){
            for(int j =0;j<p_nums.length;j++){
                if(i != j){
                    if(p_nums[i]+p_nums[j]==target){
                        int[] result = new int[2];
                        result[0] = p_nums[i];
                        result[1] = p_nums[j];
                        return result;
                    }
                }
            }
        }
        return null;
    }
    
}