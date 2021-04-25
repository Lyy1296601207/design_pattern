package create.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * 负载均衡器LoadBalancer：单例类，
 * 真实环境下该类将非常复杂，包括大量初始化的工作和业务方法，
 * 考虑到代码的可读性和易理解性，只列出部分与模式相关的核心代码
 *
 * @author yangyang.liu
 * @date 2021-04-25 21:37
 */
public class LoadBalancer {
    /**
     * 私有静态成员变量，存储唯一实例
     */
    private static LoadBalancer instance = null;

    /**
     * 服务器集合
     */
    private List serverList = null;

    /**
     * 私有构造函数，为了杜绝外部 new 对象
     */
    private LoadBalancer() {
        serverList = new ArrayList();
    }

    /**
     * 公有静态成员方法，返回唯一实例
     *
     * @return LoadBalancer
     */
    public static LoadBalancer getLoadBalancer() {
        instance = instance == null ? new LoadBalancer() : instance;
        return instance;
    }

    /**
     * 增加服务器
     *
     * @param server 服务器
     */
    public void addServer(String server) {
        serverList.add(server);
    }

    /**
     * 删除服务器
     *
     * @param server 服务器
     */
    public void removeServer(String server) {
        serverList.remove(server);
    }

    /**
     * 随机获取服务器
     *
     * @return 服务器
     */
    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }

}