package structpatern.bridge;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 15:39
 * @Description:
 */
public interface Brand {
    void sale();//销售电脑
}
class Lenovo implements Brand{
    @Override
    public void sale() {
        System.out.println("联想");
    }
}
class Dell implements Brand{
    @Override
    public void sale() {
        System.out.println("戴尔");
    }
}