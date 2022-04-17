package sheJiMoShi_FirstHomeWork.JianZaoZheMoShi;

public class Choice_one implements Builderrrrr {
    private Food food;
    public Choice_one(){
        this.food=new Food();
    }
    @Override
    public void buildSoup() {
        this.food.setSoup("花旗参鸡汤");
    }

    @Override
    public void buildRice() {
        this.food.setRice("排骨饭");
    }

    @Override
    public void buildSnacks() {
        this.food.setSnacks("卤蛋");
    }

    @Override
    public Food createFood() {
        return this.food;
    }
}
