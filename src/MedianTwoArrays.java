/*4. Median of Two Sorted Arrays
Hard

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

 

Constraints:

    nums1.length == m
    nums2.length == n
    0 <= m <= 1000
    0 <= n <= 1000
    1 <= m + n <= 2000
    -106 <= nums1[i], nums2[i] <= 106


 * 
 * 
 * 
 */

public class MedianTwoArrays {

    private static int[] nums1= {1,3};
    private static int[] nums2= {2};
    private static int[] result = new int[nums1.length+nums2.length];

    public static void main(String[] args) {
        
        mergeArrays();
        printArray(result);
        //System.out.println(detect_Median(result));
    }

    public static void mergeArrays(){
        for(int i=0;i<result.length;i++){
            int smallest1[] = find_smallest_number_pair(nums1);
            int smallest2[] = find_smallest_number_pair(nums2);
            if( smallest1[0] <= smallest2[0]){
                result[i] = smallest1[0];
                nums1[smallest1[1]]=-1;
            }
            else{
                result[i] = smallest2[0];
                nums2[smallest2[1]]=-1;
            }
        }
    }

    public static int find_biggest_number(int[] nums){
        int biggest = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]> biggest){
                biggest = nums[i];
            }
        }
        return biggest;
    }

    public static int[] find_smallest_number_pair(int[] nums){
        int[] smallest_number_pair = {10,0}; // here we need to call find_biggest_number
        for(int i=0;i<nums.length;i++){
            if(nums[i]<smallest_number_pair[0] && nums[i] != -1){
                smallest_number_pair[0] = nums[i];
            }
        }
        return smallest_number_pair;
    }

    public static void printArray(int[] p_array){
        for(int i=0;i<p_array.length;i++){
            System.out.println(p_array[i] + ",");
        }
    }

    public static double detect_Median(int[] nums){
        if (nums.length % 2 ==0){
            return (nums[nums.length/2] + nums[nums.length/2 +1]) / 2;
        }else{
            return nums[nums.length/2];
        }
    }

    

    
}
