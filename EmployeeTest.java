package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		boolean found = true;
		List<Employee> employeeList = new ArrayList<Employee>();
		setEmployeeList(employeeList);
		System.out.println("Enter the employee ID");
		Scanner inScan = new Scanner(System.in);
		int idToBeSearched = inScan.nextInt();

		System.out.println("Enter the employee name");
		Scanner inScan2 = new Scanner(System.in);
		String nameToBeSearched = inScan2.next();

		inScan.close();
		inScan2.close();

		for (Employee emp : employeeList) {
			if (emp.getId() == idToBeSearched && emp.getName().equalsIgnoreCase(nameToBeSearched)) {
				System.out.println("Display the employee details of given ID: " + idToBeSearched + " and name : "
						+ nameToBeSearched);
				System.out.println(emp);
				found = true;
				return;
			} else {
				found = false;
			}
		}
		if (!found) {
			System.out.println("Employee details not present for the given inputs");
		}

	}

	private static void setEmployeeList(List<Employee> employeeList) {
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("employee1");
		employee1.setAddress("Address1");
		employee1.setSalary(15000);

		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("employee2");
		employee2.setAddress("Address2");
		employee2.setSalary(19000);

		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("employee3");
		employee3.setAddress("Address3");
		employee3.setSalary(22000);

		Employee employee4 = new Employee();
		employee4.setId(4);
		employee4.setName("employee4");
		employee4.setAddress("Address4");
		employee4.setSalary(18000);

		Employee employee5 = new Employee();
		employee5.setId(5);
		employee5.setName("employee5");
		employee5.setAddress("Address5");
		employee5.setSalary(25000);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);

	}

}
