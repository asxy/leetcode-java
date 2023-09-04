package daily;

/**
 * Created by asxy on 2023/9/1
 */
class WaysToBuyPensPencils {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {

        int result = 0;

        for (int i = 0; i <= Math.floorDiv(total, cost1); i++) {
            int remain = total - cost1 * i;
            // +1 的原因是存在不买第二种的情况
            result += Math.floorDiv(remain, cost2) + 1;
        }

        return result;
    }


}