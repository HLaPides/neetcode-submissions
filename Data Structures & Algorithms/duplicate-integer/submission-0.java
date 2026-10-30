class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        int i = 0;
        while (i<nums.length) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            }
            else {
                return true;
            }
            i++;
        }
        return false;
    }
}