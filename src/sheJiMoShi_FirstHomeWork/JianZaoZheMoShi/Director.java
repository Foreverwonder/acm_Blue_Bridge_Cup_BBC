package sheJiMoShi_FirstHomeWork.JianZaoZheMoShi;

public class Director {
    //负责指导套餐建造
    public Food creatFoodByDirector(Builderrrrr builder){
        builder.buildSoup();
        builder.buildRice();
        builder.buildSnacks();
        return builder.createFood();
    }
}
