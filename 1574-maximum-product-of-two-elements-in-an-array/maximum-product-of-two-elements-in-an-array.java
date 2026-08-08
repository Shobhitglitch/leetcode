class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int a=nums.length;
        int ans=((nums[a-1])-1)*((nums[a-2])-1);
        return ans;
    }
}