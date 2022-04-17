package sheJiMoShi_FirstHomeWork.sheJiMoShi_homeWork;

public class SimpleFactoryLqj {
    public static Phone createPhone(String phoneType){
        if(phoneType.equals("xiaomi")){
            return new PhoneXiaomi();
        }
        else if(phoneType.equals("huawei")){
            return new PhoneHuaWei();
        }
        return null;
    }

    public static void main(String[] args) {
        Phone phone=SimpleFactoryLqj.createPhone("xiaomi");
        phone.print();
    }

}

abstract class Phone {
    public abstract void print();
}
class PhoneHuaWei extends Phone {
    @Override
    public void print() {
        System.out.println("华为公司生产华为手机");
    }
}
class PhoneXiaomi extends Phone {
    @Override
    public void print() {
        System.out.println("小米公司生产小米手机");
    }
}