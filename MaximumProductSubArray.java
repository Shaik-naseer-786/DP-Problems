public class MaximumProductSubArray {
    public static int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        
        int max=nums[0];
        int min=nums[0];
        int result=max;
        for(int i=1;i<n;i++){
            if(nums[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(nums[i],max*nums[i]);
            min=Math.min(nums[i],nums[i]*min);
            result=Math.max(result,max);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2,3,-2,4}));
    }
}
