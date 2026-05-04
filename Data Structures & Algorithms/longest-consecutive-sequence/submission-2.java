

public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;   // ✅ track the maximum streak

        // Add all numbers to the set
        for (int n : nums) {
            set.add(n);   // ✅ use add, not put
        }

        // Iterate through each number
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            // Only start counting if it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                int count = 1;   // ✅ reset count for each sequence
                while (set.contains(num + 1)) {
                    num = num + 1;
                    count++;
                }
                longest = Math.max(longest, count);  // ✅ update longest
            }
        }

        return longest;   // ✅ return the result
    }
}
