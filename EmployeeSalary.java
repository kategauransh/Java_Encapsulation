package encapsulation;

class blc{
	private int id;
	private String name;
	private long salary;
	
	public blc(int id,String name,long salary) 
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public long getSalary() 
	{
		return salary;
	}
	
	public void setId(int id) 
	{
		this.id=id;
	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	
	public void setSalary(long salary) 
	{
		if(salary<=this.salary) 
		{
			System.err.println("Error : Incremented amout must be greater than current salary");
			System.exit(0);
		}
		
		this.salary=salary;
	}
	
	public String toString() 
	{
		return "Employee[Id : "+id+", Name : "+name+", Salary : "+salary+"]";
	}
}
public class EmployeeSalary {

	public static void main(String[] args)
	{
		int id=Integer.parseInt(IO.readln("Enter your id : "));
		String name =IO.readln("Enter your name : ");
		long salary=Long.parseLong(IO.readln("Enter your salary : "));
		
		blc scott=new blc(id ,name,salary);
		IO.println(scott);
		
		long increment=Long.parseLong(IO.readln("Enter your Incremented Salary : "));
		scott.setSalary(scott.getSalary()+increment);
		
		IO.println(scott);

	}

}
