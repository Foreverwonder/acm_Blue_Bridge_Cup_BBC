package sheJiMoShi_FirstHomeWork.skyLadder;

public class Main {
    public static void someTest(String... s1) {
        //可变参数
        for (String s :
                s1) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        someTest(s1,s2);
    }
}

//
//public class Main {
//    public static void main(String[] args) {
////        十进制转其他进制
////        Integer a=8;
//       int []a=new int []{1,2,3,4,5,6,7};
//        int[] b = Arrays.copyOf(a, 7);
//        System.out.println(Arrays.toString(b));
//
//        //其他进制转十进制
////        System.out.println(Character.MAX_RADIX);
////        String num="101";
////        System.out.println(Integer.valueOf(num,40));
////        Scanner sc=new Scanner(System.in);
////        int N=sc.nextInt();
////        long a[] =new long[N+1];
////
////        for(int i=1;i<=N;i++){
////            int x=sc.nextInt();
////            a[i]=a[i-1]+x;
////        }
//////        System.out.println(Arrays.toString(a));
////        int Q=sc.nextInt();
////        for(int i=0;i<Q;i++) {
////            int L=sc.nextInt();
////            int R=sc.nextInt();
////        System.out.println(a[L+R-1]-a[L-1]);
////        }
//
//    }
//}
