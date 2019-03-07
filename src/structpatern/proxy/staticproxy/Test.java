package structpatern.proxy.staticproxy;

/**
 * @Auther: ymfa
 * @Date: 2019/3/7 14:43
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);
        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();//真实对象的操作（明星唱歌）
        proxy.collectMoney();
    }
}
