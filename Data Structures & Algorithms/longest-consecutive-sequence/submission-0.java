class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Step 1: Put every number into the HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Check every number
        for (int num : nums) {

            // Only start if num is the beginning of a sequence
            if (!set.contains(num - 1)) {

                int length = 1;
                int current = num;

                // Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
    
