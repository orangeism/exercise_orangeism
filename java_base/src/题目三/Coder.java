package 题目三;

public class Coder {
    private String name;
    private String id;
    private double salary;
    Coder()
    {

    }
    Coder(String id,String name,double salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void setName(String name)
        {
            this.name=name;
        }
    public void setId(String id)
        {
            this.id=id;
        }
        public void setSalary(double salary)
        {
            this.salary=salary;
        }
        public String getName()
        {
            return name;
        }
        public String getId()

        {
            return id;
        }
        public double getSalary()
        {
            return salary;
        }
    public void work()
    {
        System.out.println("工号为" + id + "基本工资为" + salary + "的程序员"+name+"正在努力的写着代码......");    }
}
