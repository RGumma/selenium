package day3;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		
		e1.setName("jane");
		e1.setJobTitle("programmer");
		e1.setNumberOfDeapartment(2);
		
		System.out.println(e1.getName() + e1.getJobTitle() + e1.getNumberOfDeapartment());
		System.out.println("Employee Name =" +e1.getName());
		System.out.println("Employee Title =" +e1.getJobTitle());
		System.out.println("Employee Department =" +e1.getNumberOfDeapartment());
	}

}
