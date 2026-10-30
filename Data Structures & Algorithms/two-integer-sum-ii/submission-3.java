class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pointer_1 = 0;
        int pointer_2 = numbers.length-1;
        while (pointer_1 < pointer_2) {
            int num_1 = numbers[pointer_1];
            int num_2 = numbers[pointer_2];
            int sum = num_1 + num_2;
            if (sum == target) {
                return new int[] {pointer_1+1,pointer_2+1};
            }
            else if (sum<target) {
                pointer_1++;
            }
            else {
                pointer_2--;
            }
        }
        return new int[] {0,0};
    }
}
