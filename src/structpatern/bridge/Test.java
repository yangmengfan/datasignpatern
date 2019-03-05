package structpatern.bridge;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 15:42
 * @Description: 通过组合的方式将品牌和类型区分开。
 */
public class Test {
    public static void main(String[] args) {
        //销售联想的笔记本
        Computer c = new Laptop(new Lenovo());
        c.sale();
    }
}
