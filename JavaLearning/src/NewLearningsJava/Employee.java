package NewLearningsJava;
import java.util.*;
class Employee {
	public static void main(String[] args) {
		List<EmployeeDetails> employees = new ArrayList<>();
		employees.add(new EmployeeDetails("John", "Doe", 30, 50000));
		employees.add(new EmployeeDetails("Alice", "Smith", 28, 60000));
		employees.add(new EmployeeDetails("Bob", "Brown", 35, 70000));
		employees.add(new EmployeeDetails("Charlie", "Davis", 32, 55000));

		//   employees.sort(Comparator.comparing(e->e.firstName.length()));
		empSorter(employees);
		for(EmployeeDetails emp2:employees) {
			emp2.display();
		}      
	}

	public static void empSorter(List<EmployeeDetails> employees) {
		int n=employees.size();
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(employees.get(j).firstName.length()>employees.get(j+1).firstName.length()) {
					EmployeeDetails emp1=employees.get(j);
					employees.set(j, employees.get(j+1));
					employees.set(j+1,emp1);
				}}
		}
	}
}
class EmployeeDetails{ 
	String firstName;
	String secondName;
	int age;
	double salary;

	public EmployeeDetails(String firstName, String secondName, int age, double salary) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.salary = salary;
	}
	public void display() {
		System.out.println(firstName+" "+secondName+" "+age+" "+salary);
	}
}