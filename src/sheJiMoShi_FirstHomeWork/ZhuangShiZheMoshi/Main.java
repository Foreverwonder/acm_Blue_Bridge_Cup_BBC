package sheJiMoShi_FirstHomeWork.ZhuangShiZheMoshi;

import sheJiMoShi_FirstHomeWork.ZhuangShiZheMoshi.快餐.卤肉饭;
import sheJiMoShi_FirstHomeWork.ZhuangShiZheMoshi.装饰者.卤蛋;
import sheJiMoShi_FirstHomeWork.ZhuangShiZheMoshi.装饰者.卤豆腐;

public class Main {
    public static void main(String[] args) {
        抽象快餐 卤肉饭=new 卤肉饭();
        卤肉饭=new 卤蛋(卤肉饭);
        卤肉饭=new 卤蛋(卤肉饭);
        卤肉饭=new 卤豆腐(卤肉饭);
        卤肉饭.display();
        System.out.println("总价格为"+卤肉饭.count());

    }
}
