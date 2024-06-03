package leetcode35;

public class Solution {
    public int searchInsert(int[] nums, int target){
        int i=0,j=nums.length;
        while(i<j){
            int m=(i+j)>>>1;
            if(nums[m]<target){
                i=m+1;
            }else if(target<nums[m]){
                j=m-1;
            }else{
                return m;
            }
        }
        return i;
    }
}
