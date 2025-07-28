class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int l = 0;
        int r = c.length-1;
        while(l<r){
            while(l<r && !isVowel(c[l])){
                l++;
            }
            while(l<r && !isVowel(c[r])){
                r--;
            }
            char t = c[l];
            c[l] = c[r];
            c[r] = t;
            l++;
            r--;
        }
        return new String(c);
    }
    private boolean isVowel(char c){
            return "aeiouAEIOU".indexOf(c)!=-1;
        }
}
