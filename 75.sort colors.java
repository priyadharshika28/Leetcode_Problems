class Solution {
    public void swap(int[] nums,int p1,int p2){
        int temp ;
        temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
    public void sortColors(int[] nums) {
        int low,mid,high;
        int n = nums.length;
        for(low =0,mid=0,high=n-1;mid<=high;){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,high,mid);
                high--;
            }
            else{
                mid++;
            }
        }
    }
}
