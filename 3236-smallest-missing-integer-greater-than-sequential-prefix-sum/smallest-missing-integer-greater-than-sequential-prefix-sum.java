class Solution {
    public int missingInteger(int[] nums) {
        int a=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-1==nums[i-1])
            {
                a+=nums[i];
            }
            else
            break;
        }
        boolean b=true;
        while(b){
            b=false;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==a){
            a++;
            b=true;
            }
        }
        }
        return a;
    }
}