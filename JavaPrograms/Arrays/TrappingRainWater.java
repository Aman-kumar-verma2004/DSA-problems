package JavaPrograms.Arrays;

public class TrappingRainWater {
    public static int RainWater(int[] height){
        int n = height.length;
        //left max Boundary
        int[] left = new int[n];
        left[0] = height[0];
        for(int i = 1; i < n; i++){
            left[i] = Math.max(height[i], left[i-1]);
        }
        //Right max boundary
        int right[] = new int[n];
        right[n-1] = height[n-1];
        for(int i = n-2;i>=0; i--){
            right[i] = Math.max(height[i], right[i+1]);
        }
        //for loop chalana hai to finding the trapped rainwater.
        int trappedWater = 0;
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(left[i], right[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        System.out.println(RainWater(height));
    }
}