package behavepatern.observer;



/**
 * @Auther: ymfa
 * @Date: 2019/3/5 11:25
 * @Description:
 */
//抽象观察者:为所有的观察者定义一个接口
public interface Observer {
    //传入主题对象,得到主题对象的通知时更新自己
    void upadte(Subject subject);
}
