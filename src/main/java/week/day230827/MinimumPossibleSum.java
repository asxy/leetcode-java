package week.day230827;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by asxy on 2023/8/27
 */
class MinimumPossibleSum {
    public long minimumPossibleSum(int n, int target) {

        int count = 0;
        int num = 1;
        int ans = 0;

        Set<Integer> set = new HashSet<>();
        while (count < n) {
            if (!set.contains(target - num)) {
                set.add(num);
                count++;
                ans += num;
            }
            num++;
        }
        return ans;
    }


    public static void main(String[] args) {
        MinimumPossibleSum solution = new MinimumPossibleSum();
        System.out.println(solution.minimumPossibleSum(2, 3));
        System.out.println(solution.minimumPossibleSum(3, 3));
        System.out.println(solution.minimumPossibleSum(1, 1));
    }
}

