package behavepatern.madiator;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 11:48
 * @Description:抽象同事类：部门
 */
public interface Department {
    void selfAction();//做本部门的事
    void outAction();//向总经理发出申请
}
