class Solution {
    public void reverseString(char[] s) {
        int length = s.length / 2;
        for(int i = 0; i < length; i++){
            char temp = s[i];
            s[i] = s[s.length - i -1];
            s[s.length - i - 1] = temp;
        }
    }
}