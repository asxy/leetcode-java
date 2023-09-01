package daily;

/**
 * Created by asxy on 2023/8/31
 */
class MaxDistToClosest {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;

        int left = 0;
        while (left < n && seats[left] == 0) {
            left++;
        }

        int result = left;

        while (left < n) {
            int right = left + 1;
            while (right < n && seats[right] == 0) {
                right++;
            }
            if (right == n) {
                result = Math.max(result, right - left - 1);
            } else {
                result = Math.max(result, (right - left) / 2);
            }
            left = right + 1;
        }
        return result;
    }


    public static void main(String[] args) {
        MaxDistToClosest solution = new MaxDistToClosest();
//        System.out.println(solution.maxDistToClosest(new int[]{1,0,0,0,1,0,1}));
        System.out.println(solution.maxDistToClosest(new int[]{0, 1}));
        System.out.println(solution.maxDistToClosest(new int[]{1, 0}));
        System.out.println(solution.maxDistToClosest(new int[]{1, 0, 0, 0}));
    }
}