class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i:nums)
        {
            a.put(i,a.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : a.entrySet())
        {
            if(entry.getValue()>(nums.length/3))
            l.add(entry.getKey());
        }

        return l;
    }
}