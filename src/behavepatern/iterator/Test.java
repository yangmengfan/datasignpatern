package behavepatern.iterator;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 11:08
 * @Description:提供一种方法顺序的访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。就是迭代器
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMyAggregate cma = new ConcreteMyAggregate();
        cma.addObject("111");
        cma.addObject("222");
        cma.addObject("333");
        cma.addObject("444");

        MyIterator iterator = cma.createIterator();
        cma.removeObject("111");//如果删除一个元素的话，迭代的时候也同样会被删除
        while (iterator.hasNext()) {
            System.out.println(iterator.getCurrentObj());//获取当前对象
            iterator.next();//将游标向下移
        }
    }
}
