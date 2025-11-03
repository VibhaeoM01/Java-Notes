class employee {
    private String name,email;
    private int Salary;
    public employee(String name,String email)
    {
        this.name=name;
        this.email=email;
    }
    public void getVal1()
    {
        System.out.println(name+ "'s email is "+email);
    }
    public employee(int Salary,String name)
    {
        this.Salary=Salary;
        this.name=name;
    }
    public void getVal()
    {
        System.out.println(Salary+" Is the salary of "+name);
    }
};

public class Opp2 {
    public static void main(String[] args) {
        employee employee= new employee(1000, "Ram");
        employee.getVal();
        employee employee2=new employee("Ram", "ram@gmail.com");
        employee2.getVal1();
    }

}
