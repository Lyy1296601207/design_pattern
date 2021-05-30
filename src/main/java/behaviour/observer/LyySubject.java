package behaviour.observer;

import java.util.Observable;

/**
 * @author yangyang.liu
 * @date 2021-05-28 22:06
 */
public class LyySubject extends Observable {

    private String name;

    public LyySubject(String name) {
        this.name = name;
    }

    /**
     * 被观察者事件，触发通知
     */
    public void changeEvent() {
        System.out.println("目标类发生改变");
        setChanged();
        notifyObservers();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}