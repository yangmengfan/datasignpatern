package behavepatern.iterator;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 11:05
 * @Description:
 */
public interface MyIterator {
    void first();//将游标指向第一个元素
    void next();//将游标指向下一个元素
    boolean hasNext();//判断是否有下一个元素

    boolean isFirst();//判断是否是第一个元素
    boolean isLast();//判断是否是最后一个元素
    Object getCurrentObj();//获取当前对象
}
