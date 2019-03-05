package domain;

/**
 * @Auther: ymfa
 * @Date: 2019/3/4 12:26
 * @Description:
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}