package week.day230827;

/**
 * Created by asxy on 2023/8/27
 */
class FurthestDistanceFromOrigin {
    public int furthestDistanceFromOrigin(String moves) {
        int leftCount = 0;
        int rightCount = 0;
        int _Count = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                leftCount++;
            } else if (moves.charAt(i) == 'R') {
                rightCount++;
            } else {
                _Count++;
            }
        }

        return Math.abs(leftCount - rightCount) + _Count;
    }

    public static void main(String[] args) {
        FurthestDistanceFromOrigin solution = new FurthestDistanceFromOrigin();
        System.out.println(solution.furthestDistanceFromOrigin("L_RL__R"));
        System.out.println(solution.furthestDistanceFromOrigin("_R__LL_"));
        System.out.println(solution.furthestDistanceFromOrigin("_______"));
        System.out.println(solution.furthestDistanceFromOrigin("L"));
        System.out.println(solution.furthestDistanceFromOrigin("R"));
        System.out.println(solution.furthestDistanceFromOrigin("_"));
    }
}