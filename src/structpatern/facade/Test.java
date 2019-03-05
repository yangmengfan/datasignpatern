package structpatern.facade;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 18:04
 * @Description: 就是封装
 */
public class Test {
    public static void main(String[] args) {
        //使用了外观模式后
        System.out.println("-----------------------");
        Facade facade = new Facade();
        facade.facade();
    }
}
