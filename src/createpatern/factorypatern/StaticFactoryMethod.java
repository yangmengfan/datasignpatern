package createpatern.factorypatern;

import domain.MailSender;
import domain.Sender;
import domain.SmsSender;

/**
 * @Auther: ymfa
 * @Date: 2019/3/4 12:28
 * @Description:静态工厂模式
 */
public class StaticFactoryMethod {
    public static Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
