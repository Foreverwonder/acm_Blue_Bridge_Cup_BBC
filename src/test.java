import java.math.BigInteger;
import java.util.*;

public class test {
    public static void main(String[] args) {
        int a=-16;
         a >>= 1;
        System.out.println(a);
//        Set<String> set=new HashSet<>();
//        set.add("2");
//        set.add("6");
//        set.add("5");
//        set.add("4");
//        set.forEach(s -> {
//            System.out.println(s);
//        });
        //TreeSet 按字典序排序
//        List list = new ArrayList();
//        list.add("z");
//        list.add("y");
//        list.add("B");
//        list.add("A");
//        list.add("C");
//        List newList=new LinkedList(new TreeSet(list));
////        Set set = new TreeSet(list);
////        System.out.println(newList);
//        String str=new String(String.valueOf(newList));
//        System.out.println(str.toUpperCase());//大写
// System.out.println(list);
//        Set set=new HashSet();
//        set.addAll(list);
//        list.clear();
//        list.addAll(set);
//        System.out.println(list);
    }
}

//    static boolean findNum(int n){
//        //使用sqrt找素数,10000以内所有素数
//        for(int i=2;i<=Math.sqrt(n);i++){//这里这个等于号坑死人
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        int cou=0;
////        Scanner sc=new Scanner(System.in);
////        int n=sc.nextInt();
////        System.out.println(findNum(n));
//        for(int i=2;i<=10000;i++){
//            if (findNum(i)==true) {
//                System.out.print(i+" ");
//                cou++;
//                if(cou%10==0)
//                    System.out.println();
//            }
//        }


//        String s1="3";
//        String s2="8";
//        BigInteger bigInteger=new BigInteger(s1);
//        BigInteger bigInteger1=new BigInteger(s2);
//        //最大公约数
//        System.out.println(bigInteger.gcd(bigInteger1));
//        //最小公倍数
//        System.out.println(Integer.parseInt(s1)*Integer.parseInt(s2)/Integer.parseInt(bigInteger.gcd(bigInteger1).toString()));
