package exercise;

/**
 * &#064;Author  asxy
 * &#064;Version  1.0
 * &#064;Date  2023/8/21
 */
class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        while(nums[slow] != nums[fast]){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        int pre1 = 0;
        int pre2 = slow;
        while (pre1 != pre2){
            pre1 = nums[pre1];
            pre2 = nums[pre2];
        }
        return pre1;
    }

    public static void main(String[] args) {
        FindDuplicate solution = new FindDuplicate();
        solution.findDuplicate(new int[]{1,3,4,2,2});
    }
}
