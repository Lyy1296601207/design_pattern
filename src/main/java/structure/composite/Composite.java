package structure.composite;

import java.util.ArrayList;

/**
 * 容器抽象
 *
 * @author yangyang.liu
 * @date 2021-05-28 12:15
 */
public class Composite extends Component {

    private ArrayList<Component> list = new ArrayList<>();

    public Composite(String name) {
        this.componentName = name;
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        System.out.println(componentName + "的容器方法");
        //容器构件具体业务方法的实现
        //递归调用成员构件的业务方法
        for (Component obj : list) {
            obj.operation();
        }
    }
}