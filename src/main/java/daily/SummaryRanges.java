package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asxy on 2023/8/29
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int left = nums[i];
            while (i < (nums.length - 1) && (nums[i + 1] == nums[i] + 1)) {
                i++;
            }
            if (left == nums[i]) {
                result.add(String.valueOf(left));
            } else {
                result.add(left + "->" + nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SummaryRanges solution = new SummaryRanges();
        System.out.println(solution.summaryRanges(new int[]{0,1,2,4,5,7}));
        System.out.println(solution.summaryRanges(new int[]{0,2,3,4,6,8,9}));

    }
}
