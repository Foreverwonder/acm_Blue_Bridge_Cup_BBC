package sheJiMoShi_FirstHomeWork.JianZaoZheMoShi;

public class Choice_two implements Builderrrrr {
    private Food food;
    public Choice_two(){
        this.food=new Food();
    }
    @Override
    public void buildSoup() {
        this.food.setSoup("虫草花老鸭汤");
    }

    @Override
    public void buildRice() {
        this.food.setRice("叉烧饭");
    }

    @Override
    public void buildSnacks() {
        this.food.setSnacks("蒸蛋");
    }

    @Override
    public Food createFood() {
        return this.food;
    }
}
