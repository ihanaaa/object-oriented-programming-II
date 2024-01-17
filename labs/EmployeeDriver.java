
public class EmployeeDriver {

	public static void main(String[] args) {

		Manager m1 = new Manager();
		Manager m2 = new Manager(3, 3, "John");
		Engineer e1 = new Engineer();
		Engineer e2 = new Engineer(1, 1, "Maria");
		Employee[] employees = new Employee[4];
		employees[0] = m1;
		employees[1] = e1;
		employees[2] = m2;
		employees[3] = e2;

		for (int i = 0; i < employees.length; i++) {

			System.out.println(employees[i].toString());
		}
	}

}
