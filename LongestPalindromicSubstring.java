//Problem
/*
Given a string s, return the longest palindromic substring in s.
Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 
*/
//Solution
class Solution {
	public String longestPalindrome(String s) {
		int i = 0, a, b;
		int j = s.length() - 1;
		boolean palindrom = true;
		int count = 0;
		int result = 0;
		if (s.length() == 1)
			return s;
		String output = "Not";
		while (i < s.length()) {
			while (j > i && s.charAt(i) != s.charAt(j)) {
				j--;
			}
			a = i;
			b = j;
			count = 0;
			palindrom = true;
			while (a <= b) {
				if (s.charAt(a) != s.charAt(b)) {
					palindrom = false;
					break;
				}
				a++;
				b--;
			}
			if (!palindrom && j > i) {
				j--;
				continue;
			}
			if (palindrom && result < (j - i)) {
				result = j - i;
				output = s.substring(i, j + 1);
			}
			j = s.length() - 1;
			i++;

		}
		if (output.equals("Not"))
			return Character.toString(s.charAt(0));
		return output;

	}
}

public class LongestPliandrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String out = s.longestPalindrome("aacabdkacaa");
		System.out.println(out);
	}

}
