class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> temp = new HashSet<>();
        while(n!=1 && !temp.contains(n)){
            temp.add(n);
            n=getsqsum(n);
        }
        return n == 1;
    }
    public static int getsqsum(int num){
        int sum=0;
        while(num>0){
            int rem = num%10;
            sum+=rem*rem;
            num/=10;
        }
        return sum;
    }
}
