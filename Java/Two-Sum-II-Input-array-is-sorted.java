/*Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result= new int[2];
        Map<Integer, Integer> hm= new HashMap<Integer, Integer>();
        for (int i =0;i<nums.length;i++){
            
            if(hm.containsKey(target-nums[i])){
                result[1]=i+1;
                result[0]= hm.get(target-nums[i]);
                return result;
            }
            
            hm.put(nums[i],i+1);
            
        }
        
        return result;
        
    }
}
