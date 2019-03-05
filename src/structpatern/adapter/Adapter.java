package structpatern.adapter;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 15:18
 * @Description:
 */
/**
 * 具体的适配器的实现（相当于各国的翻译）
 */
public class Adapter implements Target{
    //这里需要和被适配对象关联起来：1.继承   2.组合(推荐)
    private Adaptee adaptee;//这里使用组合
    @Override
    public void handleReq() {
        adaptee.request();
    }
    public Adapter(Adaptee adaptee) {//在构造器中构造被适配的对象
        super();
        this.adaptee = adaptee;
    }
}