package structure.adapter;

/**
 * @author yangyang.liu
 * @date 2021-05-02 11:03
 */
public class Test {
    public static void main(String[] args) {
        Target adapter = new Adapter();

        adapter.request();
        
    }
}