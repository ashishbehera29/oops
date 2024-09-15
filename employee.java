public class employee  extends citizen{
    int empid;
    double salary;
    public employee(String name, String gender, int age, int empid, double salary) {
        super(name, gender, age);
        this.empid = empid;
        this.salary = salary;
    }

  
}
