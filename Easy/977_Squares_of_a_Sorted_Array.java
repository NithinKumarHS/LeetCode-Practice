// ✅ Problem: Squares of a Sorted Array (LeetCode #977)
// 🔗 Link: https://leetcode.com/problems/squares-of-a-sorted-array/
// 📌 Difficulty: Easy
// 📅 Solved On: 24-03-2025
// 🧠 Approach: Square each element in the array using Math.pow, then sort the array using Arrays.sort.
//             This works because squaring can disrupt order, especially with negatives.
// ⏱️ Time Complexity: O(n log n) due to sorting
// 🔁 Space Complexity: O(1) (in-place sorting)

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int k = 2;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], k);
        }
        Arrays.sort(nums);
        return nums;
    }
}
