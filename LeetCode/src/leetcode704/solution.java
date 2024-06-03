package leetcode704;

public class solution {
    public int search(int[] nums,int target){
        int i=0,j=nums.length;
        while(i<j){
            int m=(i+j)>>>1;
            if(nums[m]<target){
                i=m+1;
            }else if(target<nums[m]){
                j=m;
            }else{
                return m;
            }
        }
        return -1;
    }
}
