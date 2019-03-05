package behavepatern.state;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 12:27
 * @Description:通过设计对象来更改状态，每次新增状态时就新建状态对象，就可以不用更改原代码，提高扩展性
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.request(new FreeState());//空闲状态
        context.request(new BookedState());//预定状态
        context.request(new CheckedInState());//已入住

    }
}
