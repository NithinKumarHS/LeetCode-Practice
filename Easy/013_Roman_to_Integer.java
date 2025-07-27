// ✅ Problem: Roman to Integer (LeetCode #13)
// 🔗 Link: https://leetcode.com/problems/roman-to-integer/
// 📌 Difficulty: Easy
// 📅 Solved On: 13-03-2025
// 🧠 Approach: Use a HashMap to map Roman numerals to integer values.
//             Traverse the string from left to right, comparing each character with the next.
//             If the current value is less than the next, subtract it; otherwise, add it.
//             Finally, add the value of the last character.
// ⏱️ Time Complexity: O(n)
// 🔁 Space Complexity: O(1)

class Solution {
    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> r = new HashMap<>();
        r.put('I', 1);
        r.put('V', 5);
        r.put('X', 10);
        r.put('L', 50);
        r.put('C', 100);
        r.put('D', 500);
        r.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (r.get(s.charAt(i)) < r.get(s.charAt(i + 1)))
                result -= r.get(s.charAt(i));
            else
                result += r.get(s.charAt(i));
        }
        return result + r.get(s.charAt(s.length() - 1));
    }
}
