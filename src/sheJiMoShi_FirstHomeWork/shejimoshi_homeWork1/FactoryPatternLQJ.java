package sheJiMoShi_FirstHomeWork.shejimoshi_homeWork1;
//抽象工厂模式
public class FactoryPatternLQJ {
    public static void main(String[] args) {
        ProductFactory factory=new JiuYang_Factory();
        DianDunZhong dianDunZhong = factory.createDianDunZhong();
        dianDunZhong.print();
    }
}

//interface Phone{
//    void print();
//}
interface DianFanGuo{//电饭锅
    void print();
}

interface WeiBoLu{//微波炉
    void print();
}

interface DianDunZhong{//电炖盅
    void print();
}
//----------class苏泊尔---------------------------
class SuBoEr_DianFanGuo implements DianFanGuo{

    @Override
    public void print() {
        System.out.println("SuBoEr_DianFanGuo");
    }
}
class SuBoEr_WeiBoLu implements WeiBoLu{

    @Override
    public void print() {
        System.out.println("SuBoEr_WeiBoLu");
    }
}
class SuBoEr_DianDunZhong implements DianDunZhong{

    @Override
    public void print() {
        System.out.println("SuBoEr_DianDunZhong");
    }
}
//----------------------------美的------------------------------------

class MeiDi_DianFanGuo implements DianFanGuo{

    @Override
    public void print() {
        System.out.println("MeiDi_DianFanGuo");
    }
}
class MeiDi_WeiBoLu implements WeiBoLu{

    @Override
    public void print() {
        System.out.println("MeiDi_WeiBoLu");
    }
}
class MeiDi_DianDunZhong implements DianDunZhong{

    @Override
    public void print() {
        System.out.println("MeiDi_DianDunZhong");
    }
}
//--------------------class九阳------------------
class JiuYang_DianFanGuo implements DianFanGuo{

    @Override
    public void print() {
        System.out.println("JiuYang_DianFanGuo");
    }
}
class JiuYang_WeiBoLu implements WeiBoLu{

    @Override
    public void print() {
        System.out.println("JiuYang_WeiBoLu");
    }
}
class JiuYang_DianDunZhong implements DianDunZhong{

    @Override
    public void print() {
        System.out.println("JiuYang_DianDunZhong");
    }
}

//抽象工厂类
interface ProductFactory{
    DianFanGuo createDianFanGuo();
    DianDunZhong createDianDunZhong();
    WeiBoLu createWeiBoLu();
}

//具体工厂类
//美的工厂
class MeiDi_Factory implements ProductFactory{

    @Override
    public DianFanGuo createDianFanGuo() {
        System.out.println("美的工厂创建");
        return new MeiDi_DianFanGuo();
    }

    @Override
    public DianDunZhong createDianDunZhong() {
        System.out.println("美的工厂创建");
        return new MeiDi_DianDunZhong();
    }

    @Override
    public WeiBoLu createWeiBoLu() {
        System.out.println("美的工厂创建");
        return new MeiDi_WeiBoLu();
    }
}


//苏泊尔工厂
class SuBoEr_Factory implements ProductFactory{
    @Override
    public DianFanGuo createDianFanGuo() {
        System.out.println("苏泊尔工厂创建");
        return new SuBoEr_DianFanGuo();
    }

    @Override
    public DianDunZhong createDianDunZhong() {
        System.out.println("苏泊尔工厂创建");
        return new SuBoEr_DianDunZhong();
    }

    @Override
    public WeiBoLu createWeiBoLu() {
        System.out.println("苏泊尔工厂创建");
        return new SuBoEr_WeiBoLu();
    }
}


//九阳工厂
class JiuYang_Factory implements ProductFactory{
    @Override
    public DianFanGuo createDianFanGuo() {
        System.out.println("九阳工厂创建");
        return new JiuYang_DianFanGuo();
    }

    @Override
    public DianDunZhong createDianDunZhong() {
        System.out.println("九阳工厂创建");
        return new JiuYang_DianDunZhong();
    }

    @Override
    public WeiBoLu createWeiBoLu() {
        System.out.println("九阳工厂创建");
        return new JiuYang_WeiBoLu();
    }
}





