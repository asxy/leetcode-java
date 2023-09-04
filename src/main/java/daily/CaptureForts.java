package daily;

/**
 * Created by asxy on 2023/9/4
 */
class CaptureForts {
    public int captureForts(int[] forts) {
        int pre = -1;
        int result = 0;

        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 1 || forts[i] == -1) {
                if (pre >= 0 && forts[i] != forts[pre]) {
                    result = Math.max(result, i - pre - 1);
                }
                pre = i;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        CaptureForts solution = new CaptureForts();
        System.out.println(solution.captureForts(new int[]{1, 0, 0, -1, 0, 0, 0, 0, 1}));
        System.out.println(solution.captureForts(new int[]{0, 0, 1, -1}));
    }
}