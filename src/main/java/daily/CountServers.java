package daily;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by asxy on 2023/8/24
 */
class CountServers {
    public int countServers(int[][] grid) {
        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1){
                    row.put(i, row.getOrDefault(i, 0) + 1);
                    col.put(j, col.getOrDefault(j, 0) + 1);
                }
            }
        }

        int result = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1 && (row.get(i) > 1 || col.get(j) > 1)){
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CountServers solution = new CountServers();
//        int[][] grid = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        int[][] grid = new int[][]{{1,1},{1,0}};
        System.out.println(solution.countServers(grid));
    }
}
