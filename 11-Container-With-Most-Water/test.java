public int maxArea(int[] height) {
    if(height == null || height.length < 2) return 0;
    int left = 0;
    int right = height.length-1;
    int ans = Integer.MIN_VALUE;
    while(left < right){
        ans = Math.max(ans, Math.min(height[left], height[right])*(right-left));
        if(height[left] < height[right]){
            left++;
        }else if(height[left] == height[right]){
            right--;
            left++;
        }else{
            right--;
        }
    }
    return ans;
}