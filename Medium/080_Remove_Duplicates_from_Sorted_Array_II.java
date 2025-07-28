// ✅ Problem: Remove Duplicates from Sorted Array II (LeetCode #80)
// 🔗 Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// 📌 Difficulty: Medium
// 📅 Solved On: 28-07-2025
// 🧠 Approach: Use two pointers. The idea is to allow at most two occurrences of each element.
//             Start from index 2 and compare the current element with the element at (k - 2).
//             If it's not equal, it means we can safely include this element in the final array.
// ⏱️ Time Complexity: O(n)
// 🔁 Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k; 
    }
}
