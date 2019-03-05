package behavepatern.state;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 12:26
 * @Description:
 */
//具体状态：已入住
public class CheckedInState implements State{
    @Override
    public void handler() {
        System.out.println("房间已入住！");
    }
}