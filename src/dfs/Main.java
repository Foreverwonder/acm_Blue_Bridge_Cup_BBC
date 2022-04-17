package dfs;

import java.util.Scanner;
//力扣水域大小
public class Main {
    static int vis[][];
    static int map[][];
    static int n;//行
    static int m;//列
    static int dir[][] = new int[][]{{1, 0}, {-1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
    static int sum[];
    //一个坐标dfs一遍，返回一个池塘的大小，存进数组里面
    static int size;

    static int dfs(int x, int y) {
        if (vis[x][y] == 0) {
            vis[x][y] = 1;//若没有观察过，则置为1
            if (map[x][y] == 0)//找到一个答案，则返回size+1
                size++;//这里不应该return，因为不是找到了就结束dfs，而是要继续找
            for (int i = 0; i < 8; i++) {
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];
                if (isInMap(nx, ny) == true && vis[nx][ny] == 0 && map[nx][ny] == 0) {
                    dfs(nx, ny);
                }
            }
        }
        return size;
    }


    static boolean isInMap(int x, int y) {
        if (0 <= x && x < n && 0 <= y && y < m) {//n和m还是要区别一下
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//行
        m = sc.nextInt();//列
        sum = new int[n * m];
        map = new int[n][m];
        vis = new int[n][m];
        //完成输入
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        /*
        4 4
        0 2 1 0
        0 1 0 1
        1 1 0 1
        0 1 0 1
*/
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                size = 0;//每次dfs之前都要置为0
                size = dfs(i, j);
//                System.out.println("size = " + size);
                sum[size] = size;
            }
        }
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] != 0) {
                System.out.print(sum[i] + " ");
            }
        }

    }
//   static class Solution {
//        public static int[] pondSizes(int[][] land) {
//            int len1= land.length;
//            int len2= land[0].length;
//            return new int[0];
//        }
//    }
}
