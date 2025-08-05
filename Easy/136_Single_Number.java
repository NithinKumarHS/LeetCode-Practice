// ✅ Problem: Single Number (LeetCode #136)
// 🔗 Link: https://leetcode.com/problems/single-number/
// 📌 Difficulty: Easy
// 📅 Solved On: 27-07-2025
// 🧠 Approach: Use a HashMap to count occurrences of each number.
//             Traverse the map to find the element that appears exactly once.
//             This is simple and clear, but not the most space-efficient.
// ⏱️ Time Complexity: O(n)
// 🔁 Space Complexity: O(n)

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int x : nums) {
            if (hashMap.containsKey(x)) {
                hashMap.put(x, hashMap.get(x) + 1);
            } else {
                hashMap.put(x, 1);
            }
        }

        for (int x : hashMap.keySet()) {
            if (hashMap.get(x) == 1) {
                return x;
            }
        }

        return -1;
    }
}
