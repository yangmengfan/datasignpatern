package behavepatern.chainofresponsibility;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 15:01
 * @Description:
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;//下一个继承者
    public Leader(String name) {
        super();
        this.name = name;
    }
    //设置责任链上的下一个继承者
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }
    //处理请求的抽象方法
    public abstract void handleRequest(LeaveRequest leader);
}