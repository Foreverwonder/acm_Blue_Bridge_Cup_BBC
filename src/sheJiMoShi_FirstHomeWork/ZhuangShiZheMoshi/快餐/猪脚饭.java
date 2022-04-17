package sheJiMoShi_FirstHomeWork.ZhuangShiZheMoshi.快餐;

import sheJiMoShi_FirstHomeWork.ZhuangShiZheMoshi.抽象快餐;

public  class 猪脚饭 extends 抽象快餐 {
    public double count() {
//        System.out.println("猪脚饭：" + 15 + "元");
        return 16;
    }

    @Override
    public void display() {
        System.out.println("猪脚饭：" + 15 + "元");

    }
}
