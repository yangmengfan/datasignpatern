package behavepatern.strategy;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 14:34
 * @Description:
 */
//具体的算法:普通用户，不打折
public class GeneralUser implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("普通用户，不打折");
        return price;
    }
}