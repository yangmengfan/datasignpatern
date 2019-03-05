package behavepatern.state;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 12:25
 * @Description:
 */
//具体状态：空闲
public class FreeState implements State{
    @Override
    public void handler() {
        System.out.println("房间空闲中，可以预定！");
    }
}
