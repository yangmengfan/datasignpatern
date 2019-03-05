package behavepatern.strategy;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 14:34
 * @Description:
 */
//具体的算法:注册用户：打9折
public class RegisterUser implements Strategy{
    @Override
    public double getPrice(double price) {
        System.out.println("注册用户：打9折");
        return price*0.9;
    }
}
