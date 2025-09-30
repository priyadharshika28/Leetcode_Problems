class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        int[] countsecret = new int[10];
        int[] countguess = new int[10];
        for(int i=0;i<secret.length();i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s==g){
                bull++;
            }
            else{
                countsecret[s-'0']++;
                countguess[g-'0']++;
            }
        }
        for(int d=0;d<10;d++){
            cow+=Math.min(countsecret[d],countguess[d]);
        }
        return bull + "A" + cow + "B";
    }
}
