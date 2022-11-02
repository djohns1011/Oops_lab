
//Defining Employee Class
class Employee {
    public String name;
    public String address;
    public String phoneNumber;
    public int age;
    public double salary;

    public void printSalary(){
        System.out.println("Salary: " + salary);
    }
}

//Defining Officer Class
class Officer extends Employee {
    public String specialization;
}

//Defining Manager Class
class Manager extends Employee {
    public String department;
}

//Defining Company Class
class Company {
    public static void main(String[] args){
        Officer officer = new Officer();
		Manager manager = new Manager();

		officer.name = "John Doe";
		officer.age = 25;
		officer.phoneNumber = "192837";
		officer.address = "12D, Brooklyn";
		officer.salary = 55000.00;
		officer.specialization = "Sales";

		manager.name = "Maryln Leo";
		manager.age = 72;
		manager.phoneNumber = "390828";
		manager.address = "5 King Street, California";
		manager.salary = 150000.00;
		manager.department = "Education";

		System.out.println("------ Officer ------");
		System.out.println("Name: " + officer.name);
		System.out.println("Age: " + officer.age);
		System.out.println("Phone number: " + officer.phoneNumber);
		System.out.println("Address: " + officer.address);
		officer.printSalary();
		System.out.println("Specilization: " + officer.specialization);

		System.out.println("------ Manager ------");
		System.out.println("Name: " + manager.name);
		System.out.println("Age: " + manager.age);
		System.out.println("Phone number: " + manager.phoneNumber);
		System.out.println("Address: " + manager.address);
		manager.printSalary();
		System.out.println("Department: " + manager.department);
    }
}