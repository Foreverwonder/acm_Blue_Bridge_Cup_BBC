import java.util.*;
public class Main {
    //题目一，计算给定两个数的和
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//            int a=sc.nextInt();//输入第一个数
//            int b=sc.nextInt();//输入第二个数
//            System.out.println(a+b);//计算他们的和，并且显示出来
//        }
//    }


//    //题目二：给定一个n，n是整数，计算从1到n的和
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            int result=0;
//            for(int i=1;i<=n;i++){
//                result+=i;
//            }
//            System.out.println(result);
//            System.out.println();
//        }
//    }

    //题目三：给定一个a,b,求和，当a，b为0时，就结束程序
//1091
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while(scanner.hasNext()){
//            int a=scanner.nextInt();
//            int b=scanner.nextInt();
//            if(a==0||b==0){
//                break;
//            }
//            System.out.println(a+b);
//        }
//
//    }

//    1092

    /**
     * 问题：
     * Problem DescriptionYour task is to Calculate the sum of some integers.
     * InputInput contains multiple test cases. Each test case contains a integer N,
     * and then N integers follow in the same line.
     * A test case starting with 0 terminates the input and this test case is not to be processed.
     * OutputFor each group of input integers you should output their sum in one line,
     * and with one line of output for each line in input.
     * Sample Input4 1 2 3 45 1 2 3 4 50
     * Sample Output1015
     * 解析：
     * 该题目主要是要控制输入数据的个数，通过while进行控制输入的数据并	且判断
     * 程序是不是应该结束；
     * 第二个while语句为控制输入数据的个数，并且计算出要求得和	；
     * 第一遍的时候出现了错误；
     * 因为sum在第二次计算之前没有清零！！！！这点很重要
     */
    //
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNextInt()){
//            int n=sc.nextInt();
//            int sum=0;
//            while (n--!=0){
//                int num=sc.nextInt();
//                sum+=num;
//            }
//            System.out.println(sum);
//        }
//    }
//1093
/*Problem Description
Your task is to calculate the sum of some integers.


Input
Input contains an integer N in the first line, and then N lines follow.
Each line starts with a integer M, and then M integers follow in the same line.


Output
For each group of input integers you should output their sum in one line,
and with one line of output for each line in input.

Sample Input

2
4 1 2 3 4
5 1 2 3 4 5

Sample Output

10
15


*/

    /*
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()) {
            int L= sc.nextInt();
            while (L--!=0){
                int n=sc.nextInt();
                int sum=0;
                while (n--!=0){
                    sum+=sc.nextInt();
                }
                System.out.println(sum);
            }

        }


    }

*/
    //1094和1092 似乎是一样的，暂时不做
    /*Problem Description
Your task is to calculate the sum of some integers.


Input
Input contains multiple test cases, and one case one line. Each case starts with an integer N, and then N integers follow in the same line.


Output
For each test case you should output the sum of N integers in one line, and with one line of output for each line in input.


Sample Input


4 1 2 3 4
5 1 2 3 4 5


Sample Output

10
15
*/





    public static void main(String[] args) {
        //1月19
        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(simpleDateFormat.format(new Date(new Scanner(System.in).nextLong())));*/






    }


}

//二分法
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target) {
                high = mid - 1;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            }

        }
        return -1;
    }
}

class Solutioni {
    public int minMoves(int[] nums) {
        int minNum = Arrays.stream(nums).min().getAsInt();
        int res = 0;
        for (int num : nums) {
            res += num - minNum;
        }
        return res;
    }
}
