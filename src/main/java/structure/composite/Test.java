package structure.composite;

/**
 * @author yangyang.liu
 * @date 2021-05-28 12:21
 */
public class Test {
    public static void main(String[] args) {
        // site代表容器（文件夹） leaf 代表容器内的子组件
        Component site1, site2, site3, leaf11, leaf21, leaf22, leaf31, leaf32;

        site1 = new Composite("容器1");
        site2 = new Composite("容器1的子容器2");
        site3 = new Composite("容器2的子容器3");

        leaf11 = new Leaf("容器1的子节点1");
        leaf21 = new Leaf("容器2的子节点1");
        leaf22 = new Leaf("容器2的子节点2");
        leaf31 = new Leaf("容器3的子节点1");
        leaf32 = new Leaf("容器3的子节点2");

        try {
            // 构建层级关系
            site2.add(site3);
            site1.add(site2);

            site1.add(leaf11);
            site2.add(leaf21);
            site2.add(leaf22);
            site3.add(leaf31);
            site3.add(leaf32);

            // 这里进行一次调用即可看到全部的调用
            site1.operation();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}