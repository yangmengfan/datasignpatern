package structpatern.composite;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 17:34
 * @Description:
 */
//表示该节点下面没有其他子节点了，就称为叶子
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }
    @Override
    public void add(Component c) {
        System.out.println("leaf no add");
    }
    @Override
    public void remove(Component c) {
        System.out.println("leaf no remove");
    }
    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer("-");
        for (int i = 0; i <= depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString()+name);
    }
}