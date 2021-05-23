package create.prototype;

/**
 * @author yangyang.liu
 * @date 2021-05-23 11:45
 */
public class Proto implements Cloneable {

    private String value1;

    private String value2;

    @Override
    public Proto clone() throws CloneNotSupportedException {
        Object obj = null;

        try {
            obj = super.clone();
            return (Proto) obj;
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException("克隆失败");
        }
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Proto{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                '}';
    }
}