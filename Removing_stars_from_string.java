class Solution {
    public String removeStars(String s) {
        // StringBuilder to store the characters that are not removed
        StringBuilder result = new StringBuilder();
        
        // Iterate over the string
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                // If we encounter a '*', remove the last character
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                // Otherwise, add the character to the result
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}
