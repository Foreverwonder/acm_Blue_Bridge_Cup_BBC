package sheJiMoShi_FirstHomeWork.sheJiMoShi_homeWork2;
//工厂模式
public class FactoryPatternLQJ {
    public static void main(String[] args) {
        Factory factory=new IPhoneFactory();
        Phone phone=factory.createPhone();
        phone.print();
    }
}
interface Phone{
    void print();
}
class IPhone implements Phone{

    @Override
    public void print() {
        System.out.println("IPhone");
    }
}
class HuaWeiPhone implements Phone{

    @Override
    public void print() {
        System.out.println("HuaWeiPhone");
    }
}
interface Factory{
    Phone createPhone();
}
class IPhoneFactory implements Factory{

    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}

class HuaWeiFactory implements Factory{
    @Override
    public Phone createPhone() {
        return new HuaWeiPhone();
    }
}

