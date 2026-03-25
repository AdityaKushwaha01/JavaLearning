package NewLearningsJava;
import java.util.*;
import java.util.Map.Entry;
public class ObjectWithInMap {

	public static void main(String[] args) {
		Map<String,EmployeeDet> employee = new HashMap<>();
	      employee.put("Aditya",new EmployeeDet("bangalore","Engineer",24,"Testing","abc@gmail.com","23-10-2023"));
	      
	      for(Entry<String, EmployeeDet> ent:employee.entrySet()){
	          System.out.println(ent.getKey()+"==>"+ent.getValue());
	      }
	    }

	}

class EmployeeDet{
    String address;
    String Designation;
    int age;
    String Department;
    String email;
    String DOJ;
    public EmployeeDet(String address,String Designation,int age,String Department,String email,String DOJ){
        this.address=address;
        this.Designation=Designation;
        this.age=age;
        this.Department=Department;
        this.email=email;
        this.DOJ=DOJ;
    }
 
    public String toString() {
        return address +" "+ Designation +" "+ age +" "+Department +" "+ email 
              + " "+ DOJ;
    }
}