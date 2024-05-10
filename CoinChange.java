import java.util.Arrays;

public class CoinChange {
    public static void coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0]=0;
        System.out.println(Arrays.toString(dp));
        for(int i=1;i<=amount;i++){
            for(int coin:coins){
                if(coin<=i){
                    dp[i]=Math.min(dp[i], dp[i-coin]+1);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        if(dp[amount]>amount){
            System.out.println(-1);
        }
        else{
            System.out.println(dp[amount]);
        }
    }
    public static void main(String[] args) {
        coinChange(new int[]{2}, 3);
    }
}
