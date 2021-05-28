package structure.composite;

/**
 * 叶子节点
 *
 * @author yangyang.liu
 * @date 2021-05-28 12:14
 */
public class Leaf extends Component {

    public Leaf(String name) {
        this.componentName = name;
    }

    @Override
    public void add(Component c) throws Exception {
        throw new Exception("子节点无法添加子成员");
    }

    @Override
    public void remove(Component c) throws Exception {
        throw new Exception("子节点无法删除子成员");
    }

    @Override
    public Component getChild(int i) throws Exception {
        throw new Exception("子节点无法获取子成员");
    }

    @Override
    public void operation() {
        System.out.println(componentName + "的子成员方法");
    }
}