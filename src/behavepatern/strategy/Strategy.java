package behavepatern.strategy;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 14:34
 * @Description:
 */
//抽象算法接口：定义了所有支持算法的公共接口
public interface Strategy {
    //算法方法:打印商品的价格（不同的实现打不同的折扣）
    public double getPrice(double price);
}
