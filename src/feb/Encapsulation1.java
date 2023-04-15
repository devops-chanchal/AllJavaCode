package feb;

public class Encapsulation1 { //data+method
	private int age;   //data
	private int salary;
	//bank
	//Those customer age >21  and salary is > 15000 rs for loan
	//getter and setter	
	public static void main(String[] args) {		
	}
	public void setAge(int age) {
		if(age<21) 
		{
			System.out.println("Your age is less than 21");
		}
		else {
		
			this.age = age;
		}
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary<15000) 
		{
			System.out.println("Your salary is too low to get a loan");
		}
		
		else {
		this.salary = salary;
		}
		}
	public String getAge() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
