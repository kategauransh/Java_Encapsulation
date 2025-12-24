package encapsulation;

class BLC {
    private int id;
    private String name;
    private long salary;   

    public BLC(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {        
        return salary;
    }

    public void setSalary(long salary) {   
        if (salary <= this.salary) {
            System.err.println("Error: Incremented amount must be greater than current salary");
            System.exit(0);
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [Id=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

public class Incremented_salary {
    public static void main(String[] args) {

        int id = Integer.parseInt(IO.readln("Enter your Employee Id : "));
        String name = IO.readln("Enter your Name : ");
        long salary = Long.parseLong(IO.readln("Enter your Salary : "));  

        BLC scott = new BLC(id, name, salary);
        IO.println(scott);

        long increment = Long.parseLong(IO.readln("Enter your Incremented Salary : "));
        scott.setSalary(scott.getSalary() + increment);

        IO.println(scott);
    }
}
