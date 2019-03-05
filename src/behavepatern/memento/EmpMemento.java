package behavepatern.memento;

/**
 * @Auther: ymfa
 * @Date: 2019/3/5 12:10
 * @Description: 换个对象保存当前对象状态，以便恢复
 */
//备忘录对象
public class EmpMemento {
    //自身属性
    private String ename;
    private int age;
    private double salary;
    //构造备忘录对象时，需要传入一个需要备忘的对象（发起人）
    public EmpMemento(EmpOriginator emp) {
        this.ename = emp.getEname();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }
    //省略3个属性的set,get方法

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}