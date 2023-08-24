package exercise;

/**
 * &#064;Author  asxy
 * &#064;Version  1.0
 * &#064;Date  2023/8/18
 */
class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();
        System.out.println(solution.singleNumber(new int[]{1,2,1}));
        System.out.println(solution.singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(solution.singleNumber(new int[]{1}));
    }
}
