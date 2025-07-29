class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[256];
        for(int i=0;i<s.length()-1;i++){
            char c = s.charAt(i);
            count[c]++;
        }
        for(int i=0;i<s.length()-1;i++){
            char c = s.charAt(i);
            if(count[c]==1){
                char res = i;
            }
        }
        return res;
    }
}
