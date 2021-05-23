package create.prototype;

/**
 * @author yangyang.liu
 * @date 2021-05-23 11:49
 */
public class Test {
    public static void main(String[] args) {
        Proto proto1 = new Proto();

        proto1.setValue1("1.1");
        proto1.setValue2("1.2");

        try {
            Proto proto2 = proto1.clone();
            Proto proto3 = proto1.clone();

            proto2.setValue1("2.1");
            proto2.setValue2("2.2");

            proto3.setValue1("3.1");
            proto3.setValue2("3.2");

            System.out.println(proto1.toString());
            System.out.println(proto2.toString());
            System.out.println(proto3.toString());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}