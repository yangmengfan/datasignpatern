package behavepatern.TemplateMethod;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 10:48
 * @Description: 只有核心代码由子类实现，其它相似代码按一样的模板来，好处是每多一种实现，只要集成模板代码重写核心代码就好了。
 */
public class Test {
    public static void main(String[] args) {
        BankTemplateMethod template = new DrawMoney();
        template.process();
    }
}
