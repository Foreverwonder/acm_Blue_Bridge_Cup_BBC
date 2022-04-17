package sheJiMoShi_FirstHomeWork.ZhuangShiZheMoshi.快餐;

import sheJiMoShi_FirstHomeWork.ZhuangShiZheMoshi.抽象快餐;

public  class 卤肉饭 extends 抽象快餐 {
//    public abstract double display();
    public double count(){
//        System.out.println("卤肉饭："+15+"元");
        return 15;
    }

    @Override
    public void display() {
        System.out.println("卤肉饭："+15+"元");
    }

}
