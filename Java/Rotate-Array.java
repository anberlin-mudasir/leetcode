/*

Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
*/


class Solution {
    public void rotate(int[] nums, int k) {
         if(nums.length <= 1){
            return;
        }
       k %= nums.length;
    reverse(nums, 0, nums.length-1);  // reverse the whole array
    reverse(nums, 0, k-1);  // reverse the first part
    reverse(nums, k, nums.length-1);  // reverse the second part
    }
    
    public void reverse(int[] nums,int l, int r){
       int temp;
        while (l<r){
            temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
            
        }
    }
}
