// ✅ Problem: Third Maximum Number (LeetCode #414)
// 🔗 Link: https://leetcode.com/problems/third-maximum-number/
// 📌 Difficulty: Easy
// 📅 Solved On: 03-04-2025
// 🧠 Approach: Use a TreeSet with reverse order to store unique elements in descending order.
//             If there are fewer than 3 distinct elements, return the maximum.
//             Otherwise, iterate and return the third unique maximum.
// ⏱️ Time Complexity: O(n log n) — due to TreeSet operations
// 🔁 Space Complexity: O(n)

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int num : nums) {
            set.add(num);
        }

        if (set.size() < 3) {
            return set.first(); // The maximum number
        }

        Iterator<Integer> iterator = set.iterator();
        iterator.next(); // 1st max
        iterator.next(); // 2nd max
        return iterator.next(); // 3rd max
    }
}
