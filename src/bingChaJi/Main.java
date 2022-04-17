package bingChaJi;

import java.util.Scanner;

public class Main {
    static int m;//行列不要搞反，每道题目不一样的
    static int n;
//        static int[] pre =new int [100001];//注意题意是从1开始的
    static int[] pre;//注意题意是从1开始的

    static void init(int a[]) {
        for (int i = 1; i <= n * m; i++) {
            pre[i] = i;//初始化，每个节点的根都是它自己
        }
    }

    static int findRoot(int x) {
        if (pre[x] == x) return pre[x];
        return pre[x] = findRoot(pre[x]);
    }

    static void unit(int a, int b) {
        int roota = findRoot(a);
        int rootb = findRoot(b);
        if (roota != rootb) {//如果a、b的根节点不一样，那就把a的根节点roota的前驱置为b
            pre[roota] = b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int k = sc.nextInt();
        pre = new int[k*2 + 1];
        init(pre);
        //输入
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            unit(a,b);//输入了以后直接联合吗
        }

        int sum[]=new int [k*2 + 1];
        //找所有的根节点并且置为1，统计
        for(int i=1;i<=m*n;i++){
            int root = findRoot(i);
            sum[root]=1;//这一步之前理解不到位，是需要新建一个数组来进行统计的
        }
        int ans=0;
        for(int i=0;i< pre.length;i++){
            if (sum[i]==1){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
