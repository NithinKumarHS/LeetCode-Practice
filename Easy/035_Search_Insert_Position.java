// ✅ Problem: Search Insert Position (LeetCode #35)
// 🔗 Link: https://leetcode.com/problems/search-insert-position/
// 📌 Difficulty: Easy
// 📅 Solved On: 26-03-2025
// 🧠 Approach: Standard Binary Search. While searching, if the target is not found,
//             return the `low` pointer, which will be at the correct insert position.
//             Efficient and avoids extra edge-case checks.
// ⏱️ Time Complexity: O(log n)
// 🔁 Space Complexity: O(1)

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
