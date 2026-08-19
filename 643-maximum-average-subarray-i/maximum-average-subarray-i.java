class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,j=0;
        double max=Integer.MIN_VALUE,sum=0;
        while(j<nums.length)
        {
            sum+=nums[j];
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                max=Math.max(sum,max);
                sum-=nums[i];
                i++;
                j++;
            }
        }
        return (double)max/k;
    }
}