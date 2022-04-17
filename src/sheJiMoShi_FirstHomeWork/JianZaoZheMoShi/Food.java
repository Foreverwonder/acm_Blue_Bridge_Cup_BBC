package sheJiMoShi_FirstHomeWork.JianZaoZheMoShi;

public class Food {
    private String soup;
    private String rice;
    private String snacks;

    public String getSoup() {
        return soup;
    }

    public void setSoup(String soup) {
        this.soup = soup;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getSnacks() {
        return snacks;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }

    @Override
    public String toString() {
        return "Food{" +
                "soup='" + soup + '\'' +
                ", rice='" + rice + '\'' +
                ", snacks='" + snacks + '\'' +
                '}';
    }
}
