class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        HashSet<String> pairs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (Math.abs(nums[i] - nums[j]) == k) {

                    int x = Math.min(nums[i], nums[j]);
                    int y = Math.max(nums[i], nums[j]);

                    String pair = x + "," + y;

                    if (!pairs.contains(pair)) {
                        pairs.add(pair);
                        count++;
                    }
                }
            }
        }

        return count;
    }
}