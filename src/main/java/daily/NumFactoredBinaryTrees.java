package daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by asxy on 2023/8/29
 */
class NumFactoredBinaryTrees {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        long[] dp = new long[n];
        Arrays.fill(dp, 1);

        long ans = 0;
        long model = 1000000007;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) {
                    int right = arr[i] / arr[j];
                    if (map.containsKey(right)) {
                        dp[i] = (dp[i] + (dp[j] * dp[map.get(right)])) % model;
                    }
                }
            }
            ans = (ans + dp[i]) % model;
        }
        return (int) ans;
    }
}