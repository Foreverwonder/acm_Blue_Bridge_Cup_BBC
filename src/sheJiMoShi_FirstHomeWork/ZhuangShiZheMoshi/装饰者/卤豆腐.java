package sheJiMoShi_FirstHomeWork.ZhuangShiZheMoshi.装饰者;

public class 卤豆腐 extends 顶层装饰者{
    private static final int COST =3;
    private final sheJiMoShi_FirstHomeWork.ZhuangShiZheMoshi.抽象快餐 抽象快餐;

    public 卤豆腐(sheJiMoShi_FirstHomeWork.ZhuangShiZheMoshi.抽象快餐 抽象快餐) {
        this.抽象快餐 = 抽象快餐;
    }

    @Override
    public double count() {
//        System.out.println("加卤豆腐：3元");
        return COST+抽象快餐.count();
    }

    @Override
    public void display() {
        System.out.println("加卤豆腐：3元");
        抽象快餐.display();
    }
}
