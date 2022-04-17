package sheJiMoShi_FirstHomeWork.ZhuangShiZheMoshi.装饰者;

import sheJiMoShi_FirstHomeWork.ZhuangShiZheMoshi.抽象快餐;

public class 卤蛋 extends 顶层装饰者{
    private static final int COST =2;
    private final 抽象快餐 抽象快餐;

    public 卤蛋(sheJiMoShi_FirstHomeWork.ZhuangShiZheMoshi.抽象快餐 抽象快餐) {
        this.抽象快餐 = 抽象快餐;
    }

    @Override
    public double count() {
//        System.out.println("加卤蛋：2元");
        return COST+抽象快餐.count();
    }

    @Override
    public void display() {
        System.out.println("加卤蛋：2元");
        抽象快餐.display();
    }
}
