/*
 * 1481. Least Number of Unique Integers after K Removals
Medium

Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.

Example 1:

Input: arr = [5,5,4], k = 1
Output: 1
Explanation: Remove the single 4, only 5 is left.

Example 2:

Input: arr = [4,3,1,1,3,3,2], k = 3
Output: 2
Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.

 

Constraints:

    1 <= arr.length <= 10^5
    1 <= arr[i] <= 10^9
    0 <= k <= arr.length

 * 
 */

public class LeastNumberUniqueIntegers {

    public static int[] input ={5,5,4};
    public static int[] amount = new int[input.length];
    public static int k = 1;

    public static void main(String[] args) {
        amount = count_occurences(input);
        System.out.println(findLeastNumberofUniqueInts(input, amount, k));

    }

    public static int findLeastNumberofUniqueInts(int[] input,int[]amount, int k){
        while(k>0){
            int position = find_smallest_number(input);
            System.out.println("HIER");
            input[position] = -1;
            if(k>= amount[position]){
                k = k - amount[position];
            }else{
                k = k-1;
            }
        }
        return count_values(count_occurences(input));
        
    }
    
    public static int count_uniques(int[] arr){
        int count[] = new int[arr.length];
        int result = 0;
        for(int i = 0;i<arr.length;i++){
            
            for(int j=0;j<count.length;j++){
                if(arr[i]!=count[j] && arr[i] != -1){
                    count[j] = arr[i];
                    result = result +1;
                }
            }
        }
        return result;
    }
    

    public static int count_values(int[] arr){
        int result = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0){
                result = result +1;
            }
        }
        return result;
    }

    public static int[] count_occurences(int[] arr){
        int[] result = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[i] != -1){
                    result[i] = result[i] +1;
                }
            }
        }
        return result;
    }

    public static void printArray(int[] p_array){
        for(int i=0;i<p_array.length;i++){
            System.out.println(p_array[i] + ",");
        }
    }

    public static int find_smallest_number(int[] input){
        int smallest = 10;
        int position = 0;
        for(int i=0;i<input.length;i++){
            if(input[i]<smallest && input[i] != -1){
                smallest = input[i];
                position = i;
            }
        }
        return position;
    }

    
}
