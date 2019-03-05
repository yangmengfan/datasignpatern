package behavepatern.state;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 12:26
 * @Description:
 */
//具体状态：已预定
public class BookedState implements State{
    @Override
    public void handler() {
        System.out.println("房间已被预定！");
    }
}