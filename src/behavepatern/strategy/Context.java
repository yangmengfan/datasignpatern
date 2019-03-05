package behavepatern.strategy;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 14:35
 * @Description:
 */
//上下文：用来维护不同对象的不同折扣
public class Context {
    private Strategy strategy;//持有算法族的引用
    public Context(Strategy strategy) {
        super();
        this.strategy = strategy;
    }
    //打印价钱
    public void printPrice(double price){
        System.out.println("应付金额："+Math.round(strategy.getPrice(price)));
    }
}