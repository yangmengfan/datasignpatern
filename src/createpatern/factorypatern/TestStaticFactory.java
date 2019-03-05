package createpatern.factorypatern;

import domain.Sender;

/**
 * @Auther: ymfa
 * @Date: 2019/3/4 14:05
 * @Description:静态工厂模式，每次增加新的产品就得修改工厂类：
 *              违反开闭原则，在抽象工厂模式中得到改善
 */
public class TestStaticFactory {
    public static void main(String[] args) {
        Sender sms = StaticFactoryMethod.produce("sms");
        sms.Send();
    }
}
