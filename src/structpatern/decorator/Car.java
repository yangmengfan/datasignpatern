package structpatern.decorator;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 16:27
 * @Description:
 */
//ConcreteComponent：具体的对象
class Car implements ICar{
    @Override
    public void move() {
        System.out.println("汽车移动");
    }
}