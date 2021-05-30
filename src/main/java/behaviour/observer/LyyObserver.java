package behaviour.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yangyang.liu
 * @date 2021-05-28 22:07
 */
public class LyyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        LyySubject subject = (LyySubject) o;
        System.out.println("对" + subject.getName() + "做出反应");
    }
}