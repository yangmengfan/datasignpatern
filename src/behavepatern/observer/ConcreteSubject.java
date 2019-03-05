package behavepatern.observer;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 11:30
 * @Description:
 */
//具体的主题对象
public class ConcreteSubject extends Subject {
    private int state;//默认状态为0
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
        //当修改了主题对象状态时，通知所有观察者
        this.notifyAllObserver();//通知所有观察者
    }
}
