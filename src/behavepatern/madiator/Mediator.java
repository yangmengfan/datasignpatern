package behavepatern.madiator;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 11:47
 * @Description:抽象中介者
 */
public interface Mediator {
    void register(String dname,Department d);//将具体的同事类注册到中介者中，让中介者知道所有的同事。以便进行交互
    void command(String dname);//通过部门名称，发出命令
}
