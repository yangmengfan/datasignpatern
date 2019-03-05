package createpatern.abstractfactory;

import domain.MailSender;
import domain.Provider;
import domain.Sender;

/**
 * @Auther: ymfa
 * @Date: 2019/3/4 14:13
 * @Description:
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce(){
        return new MailSender();
    }
}
