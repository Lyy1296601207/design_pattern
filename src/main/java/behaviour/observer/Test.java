package behaviour.observer;

import java.util.Observer;

/**
 * @author yangyang.liu
 * @date 2021-05-28 22:09
 */
public class Test {
    public static void main(String[] args) {
        LyySubject subject = new LyySubject("lyy被观察对象");
        Observer observer = new LyyObserver();

        subject.addObserver(observer);

        subject.changeEvent();
    }
}