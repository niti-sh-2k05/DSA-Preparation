class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;int max=0;int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];

            if((right-left+1)-sum>k){
                sum-=nums[left];
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}