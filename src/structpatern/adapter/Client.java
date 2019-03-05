package structpatern.adapter;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 15:19
 * @Description: 可以创建多个适配器，共同继承一个适配器抽象接口
 */
public class Client {
    //说话
    public void test1(Target t){
        t.handleReq();
    }
    public static void main(String[] args) {
        Client c = new Client();
        Adaptee a = new Adaptee();
        Target t = new Adapter(a);//需要传入适配器
        c.test1(t);
    }
}
