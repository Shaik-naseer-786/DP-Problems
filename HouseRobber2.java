public class HouseRobber2 {
    public static int rob(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return nums[0];
        }
        else if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int[] dp1=new int[n-1];
        int[] dp2=new int[n-1];
        dp1[0]=nums[0];
        dp1[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n-1;i++){
            dp1[i]=Math.max(dp1[i-1],nums[i]+dp1[i-2]);
        }
        dp2[0]=nums[1];
        dp2[1]=Math.max(nums[2],nums[1]);
        for(int i=2;i<n-1;i++){
            dp2[i]=Math.max(nums[i+1]+dp2[i-2],dp2[i-1]);
        }
        int f=Math.max(dp1[n-2],dp1[n-3] );
        int s=Math.max(dp2[n-2],dp2[n-3]);
        return Math.max(f,s);
    }

    
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,2,3}));
    }
}
