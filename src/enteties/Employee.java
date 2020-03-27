package enteties;

public class Employee {
	
	private String name;
	private String mail;
	private Double salary;
	
	public Employee() {
		
	}

	public Employee(String name, String mail, Double salary) {
		super();
		this.name = name;
		this.mail = mail;
		this.salary = salary;
	}

	public Employee(String string, double parseDouble) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", mail=" + mail + ", salary=" + salary + "]";
	}
	
	
	

}
