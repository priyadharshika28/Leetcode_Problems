class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] temp = new int[m+n];
        int i=0,j=0,ind=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                temp[ind++] = nums1[i++];
            }
            else{
                temp[ind++] = nums2[j++];
            }
        }
        while(i<m){
            temp[ind++] = nums1[i++];
        }
        while(j<n){
            temp[ind++] = nums2[j++];
        }
        int s = m+n;
        if(s%2!=0)
        {
            return (double)(temp[s/2]);
        }
        return ((double)temp[s/2]+(double)(temp[(s/2)-1]))/2;
    }
}
