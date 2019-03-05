package structpatern.adapter;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 15:17
 * @Description:
 */
/**
 * 需要被适配的类（各个球员）
 */
public class Adaptee {
    public void request(){
        System.out.println("请求通过");
    }
}