package createpatern.abstractfactory;

import domain.Provider;
import domain.Sender;

/**
 * @Auther: ymfa
 * @Date: 2019/3/4 14:13
 * @Description:抽象工厂模式：这个模式解决了静态工厂模式每次增加工厂需要修改工厂类的缺点。
 *              但是每创建一个产品类就需要创建一个工厂，造成了类的冗余。
 */
public class Test {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
