package exercise;

/**
 * &#064;Author  asxy
 * &#064;Version  1.0
 * &#064;Date  2023/8/18
 */
class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer result = null;
        for (int num : nums) {
            if(count == 0){
                result = num;
            }
            count += (num == result)?1:-1;
        }
        return result;
    }
}
