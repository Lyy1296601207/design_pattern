package create.simpleFactory;

/**
 * @author yangyang.liu
 * @date 2021-04-24 21:51
 */
public class Pie implements Chart {

    public Pie() {
        System.out.println("饼图创建");
    }

    public void display() {
        System.out.println("这是饼图");
    }
}