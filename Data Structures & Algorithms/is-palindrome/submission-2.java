class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l =0, r=s.length()-1;

        while(l<=r){
            while(r>l && !Character.isLetterOrDigit(s.charAt(r))) r--;
            while(l<r &&!Character.isLetterOrDigit(s.charAt(l))) l++;
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;

        }
        return true;
    }
}
