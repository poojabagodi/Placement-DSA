// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

class TrappingRainwater{
    public static int watertrapped(int height[]){
        int n=height.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        int watertrapped=0;
        leftmax[0]=height[0];
        rightmax[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);

        }
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);

        }
        for(int i=0;i<n;i++){
           int  waterlevel=Math.min(leftmax[i],rightmax[i]);
           watertrapped=watertrapped+(waterlevel-height[i]);

        }
      return watertrapped;
    }
    public static void main(String[] args){
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(watertrapped(height));
    }
}