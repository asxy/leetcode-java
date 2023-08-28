package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asxy on 2023/8/28
 */
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0];
        int right = newInterval[1];
        boolean place = false;
        List<int[]> list = new ArrayList<>();

        for (int[] ints : intervals) {
            if (left > ints[1]) {
                if (!place) {
                    list.add(new int[]{left, right});
                    place = true;
                }
                list.add(ints);
            } else if (right < ints[0]) {
                list.add(ints);
            } else {
                left = Math.min(left, ints[0]);
                right = Math.max(right, ints[1]);
            }
        }
        if (!place) {
            list.add(new int[]{left, right});
        }
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}