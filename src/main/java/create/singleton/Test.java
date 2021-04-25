package create.singleton;

/**
 * @author yangyang.liu
 * @date 2021-04-25 21:40
 */
public class Test {
    public static void main(String[] args) {
        LoadBalancer loadBalancer1, loadBalancer2, loadBalancer3;

        loadBalancer1 = LoadBalancer.getLoadBalancer();
        loadBalancer2 = LoadBalancer.getLoadBalancer();
        loadBalancer3 = LoadBalancer.getLoadBalancer();

        // 检验一致性
        System.out.println("一致性:" +
                ((loadBalancer1 == loadBalancer2) && (loadBalancer2 == loadBalancer3)));

        loadBalancer1.addServer("Server 1");
        loadBalancer2.addServer("Server 2");
        loadBalancer3.addServer("Server 3");

        // 模拟请求
        for (int i = 0; i < 10; i++) {
            String server = loadBalancer1.getServer();
            System.out.println("请求转发至" + server);

        }

    }
}