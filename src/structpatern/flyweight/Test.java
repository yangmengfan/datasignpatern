package structpatern.flyweight;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 18:17
 * @Description: 享元模式，不保存外部状态，也就是外部状态是随时改变的。只用来显示而不保存，其实也是给对象设置两个属性然后重复赋值。
 */
public class Test {
    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");//黑1
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");//黑2
        System.out.println(chess1==chess2);//结果为true，相同或相似对象内存中只存在一份

        //使用享元的外部状态
        chess1.display(new Coordinate(10, 10));//黑1在10,10的位置
        chess2.display(new Coordinate(20, 20));//黑2在20,20的位置
        System.out.println(chess1==chess2);//结果为true，相同或相似对象内存中只存在一份


    }
}
