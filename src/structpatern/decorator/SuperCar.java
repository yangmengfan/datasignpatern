package structpatern.decorator;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 16:27
 * @Description:
 */
//Decorator：装饰抽象类
class SuperCar implements ICar{
    protected ICar car;//持有一个真实对象的引用
    @Override
    public void move() {
        car.move();//这里调用真实对象的移动方法
    }
    //构造的时候传参
    public SuperCar(ICar car) {
        super();
        this.car = car;
    }
}