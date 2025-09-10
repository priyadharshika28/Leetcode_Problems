import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int[] res = twosum(arr,t);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twosum(int[] arr,int t){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==t){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }
}
