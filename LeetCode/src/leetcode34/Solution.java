package leetcode34;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a=new int[2];
        a[0]=left(nums,target);
        a[1]=right(nums,target);
        return a;
    }
    public int left(int[] nums,int target){
        int i=0,j=nums.length-1;
        int candiate=-1;
        while(i<=j){
            int m=(i+j)>>>1;
            if(target<nums[m]){
                j=m-1;
            }else if(nums[m]<target){
                i=m+1;
            }else{
                candiate=m;
                j=m-1;
            }
        }
        return candiate;
    }
    public int right(int[] nums,int target){
        int i=0,j=nums.length-1;
        int candiate=-1;
        while(i<=j){
            int m=(i+j)>>>1;
            if(target<nums[m]){
                j=m-1;
            }else if(nums[m]<target){
                i=m+1;
            }else{
                candiate=m;
                i=m+1;
            }
        }
        return candiate;
    }
}
