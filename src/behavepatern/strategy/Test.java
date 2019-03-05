package behavepatern.strategy;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 14:35
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        double price = 998;//商品价格
        Strategy generalUser = new GeneralUser();//普通用户
        Strategy registerUser = new RegisterUser();//注册用户


        //根据不同的用户打不同的折扣
        Context c1 = new Context(generalUser);
        c1.printPrice(price);
        Context c2 = new Context(registerUser);
        c2.printPrice(price);

    }
}
