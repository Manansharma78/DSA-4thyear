package day4;

import java.util.Arrays;
import java.util.List;

public class jumpGame {

    static int minJumps(List<Integer> arr) {
        int n = arr.size();
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j <= i + arr.get(i) && j < n; j++) {
                if (dp[j] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[j]);
                }
            }
        }

        return (dp[0] == Integer.MAX_VALUE) ? -1 : dp[0];
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 3, 1, 1, 4);
        System.out.println(minJumps(arr));
    }
}