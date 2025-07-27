// ✅ Problem: Binary Search (LeetCode #704)
// 🔗 Link: https://leetcode.com/problems/binary-search/
// 📌 Difficulty: Easy
// 📅 Solved On: 06-03-2025
// 🧠 Approach: Standard Binary Search on a sorted array. Calculate the mid index and narrow down 
//             the search space by comparing target with the middle element. Repeat until found or range ends.
// ⏱️ Time Complexity: O(log n)
// 🔁 Space Complexity: O(1)

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
