package createpatern.abstractfactory;

import domain.Provider;
import domain.Sender;
import domain.SmsSender;

/**
 * @Auther: ymfa
 * @Date: 2019/3/4 14:12
 * @Description:
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
