package domain;

/**
 * @Auther: ymfa
 * @Date: 2019/3/4 12:27
 * @Description:
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}