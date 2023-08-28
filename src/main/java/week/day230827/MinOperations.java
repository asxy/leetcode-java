package week.day230827;

import java.util.Collections;
import java.util.List;

/**
 * Created by asxy on 2023/8/27
 */
class MinOperations {
    public int minOperations(List<Integer> nums, int target) {
        long sum = 0;
        for(Integer i : nums){
            sum+=i;
        }
        if(sum < target){
            return -1;
        }

        int ans = 0;
        Collections.sort(nums);
        while (target >0){
            int last = nums.get(nums.size()-1);
            nums.remove(nums.size() -1);
            if(sum - last >= target){
                sum -= last;
            }else if(last > target){
                ans ++;
                nums.add(last/2);
                nums.add(last/2);
            }else {
                sum = sum -target;
                target -= last;
            }
        }
        return ans;
    }
}