class Solution {
    public int[] resultArray(int[] nums) {
       List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
       int[] result=new int[nums.length];
       arr1.add(nums[0]);
       arr2.add(nums[1]);
       for(int i=2;i<nums.length;i++)
       {
            if(arr1.get(arr1.size() - 1)>arr2.get(arr2.size() - 1))
            arr1.add(nums[i]);
            else
            arr2.add(nums[i]);
       }
       int i=0;
       for(int x:arr1)
       {
            result[i++]=x;
       }
       for(int x:arr2)
       {
            result[i++]=x;
       }
       return result;
    }
}