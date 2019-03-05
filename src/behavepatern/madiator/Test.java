package behavepatern.madiator;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 11:50
 * @Description: 中介者模式有啥事找总经理转发，而不是直接的和其他部门交流
 */
public class Test {
    public static void main(String[] args) {
        Mediator m = new President();//构建中介者对象：总经理
        m.register("finacial",new Development());
        Market market = new Market(m);//构建市场部
        market.selfAction();
        market.outAction();//市场部和财务部交互
    }
}
