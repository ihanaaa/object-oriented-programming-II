
public class Employee {
	protected int id;
	protected String name;

	public Employee() {
		id = 0;
		name = "";
	}

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public String toString() {

		return "this is the ID: " + id + "\nthis is the name: " + name;
	}

}

class Manager extends Employee {

	private int noOfDepts;

	public Manager() {
		noOfDepts = 0;
	}

	public Manager(int noOfDepts, int id, String name) {
		super(id, name);
		this.noOfDepts = noOfDepts;
	}

	public String toString() {

		return "this is the number of departments: " + noOfDepts + "\nthis is the ID: " + id + "\nthis is the name: "
				+ name;
	}

}

class Engineer extends Employee {
	private int noOfProjects;

	public Engineer() {
		noOfProjects = 0;
	}

	public Engineer(int noOfProjects, int id, String name) {
		super(id, name);
		this.noOfProjects = noOfProjects;

	}

	public String toString() {

		return "this is the number of projects: " + noOfProjects + "\nthis is the ID: " + id + "\nthis is the name: "
				+ name;
	}

}
