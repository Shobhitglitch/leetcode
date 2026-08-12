class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            int sum=0;
            while(temp!=0)
            {
                int r=temp%10;
                sum+=r;
                temp=temp/10;
            }
            a.add(sum);
        }
        return Collections.min(a);
    }
}