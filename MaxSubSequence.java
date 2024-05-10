import java.util.ArrayList;

public class MaxSubSequence {
    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
        int n=nums.size();
        int[] dp=new int[n];
        dp[0]=nums.get(0);
        dp[1]=Math.max(nums.get(0),nums.get(1));
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1], dp[i-2]+nums.get(i));
        }
        return dp[n-1];
	}

    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(4);
        System.out.println(maximumNonAdjacentSum(li));
    }
}
