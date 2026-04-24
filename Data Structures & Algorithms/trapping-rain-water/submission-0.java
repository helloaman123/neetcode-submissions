class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int []rMax = new int [n];
        int []lMax = new int [n];
        int res= 0 ;
        lMax[0] = height[0];
        for(int i = 1 ;i<n;i++ ){
            lMax[i] = Math.max(lMax[i-1],height[i]);

        }
        rMax[n-1] = height[n-1];
        for(int j = n-2;j>=0;j--){
            rMax[j] = Math.max(rMax[j+1],height[j]);

        }
        for(int i = 0 ; i<n;i++){
            res+=Math.min(rMax[i],lMax[i])-height[i];
        }
        return res;
    }
}
