package sheJiMoShi_FirstHomeWork.JianZaoZheMoShi;

public class Main {
    public static void main(String[] args) {
        Director director=new Director();
        Food food = director.creatFoodByDirector(new Choice_one());
        Food food2 = director.creatFoodByDirector(new Choice_two());
        System.out.println("小明买了套餐一："+food);
        System.out.println("小明买了套餐二："+food2);
    }
}
