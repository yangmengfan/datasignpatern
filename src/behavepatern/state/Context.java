package behavepatern.state;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 12:26
 * @Description:
 */
//上下文对象：用来引用一个State的实例，维护各个状态
public class Context {
    private State state;//当前状态
    public void request(State s){
        System.out.print("修改状态：");
        this.state = s;
        state.handler();
    }
}