package behavepatern.TemplateMethod;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 10:47
 * @Description:
 */
public class DrawMoney extends BankTemplateMethod{
    @Override
    public void transact() {
        System.out.println("我要取款");
    }
}
