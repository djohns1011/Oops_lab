import java.util.Scanner;
public class Employee {
    public String name;
    public String address;
    public String phoneNo;
    public int age;
    public int salary;

    public void printSalary(){
        System.out.println("Salary: " + salary);
    }
    public static void main(String args[]){
        Officer p1 = new Officer();
        Manager p2 = new Manager();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\nEnter the details of the officer: ");
            System.out.println("Enter name, age, phoneNo, address, salary, specialization :");
            p1.name = sc.nextLine();
            p1.age = sc.nextInt();
            sc.nextLine();
            p1.phoneNo = sc.nextLine();
            p1.address = sc.nextLine();
            p1.salary = sc.nextInt();
            sc.nextLine();
            p1.specialization = sc.nextLine();


            System.out.println("\n------ Details of the Officer ------ ");
            System.out.println("Name: " + p1.name);
            System.out.println("Age :" + p1.age);
            System.out.println("Phone Number: " + p1.phoneNo);
            System.out.println("Address :" + p1.address);
            p1.printSalary();
            System.out.println("Specialization :" + p1.specialization);

            System.out.println("\nEnter the details of the manager: ");
            System.out.println("Enter name, age, phoneNo, address, salary, department :");
            p2.name = sc.nextLine();
            p2.age = sc.nextInt();
            sc.nextLine();
            p2.phoneNo = sc.nextLine();
            p2.address = sc.nextLine();
            p2.salary = sc.nextInt();
            sc.nextLine();
            p2.department = sc.nextLine();
        }

        System.out.println("\n------ Details of the Manager ------ ");
        System.out.println("Name: " + p2.name);
        System.out.println("Age :" + p2.age);
        System.out.println("Phone Number: " + p2.phoneNo);
        System.out.println("Address :" + p2.address);
        p2.printSalary();
        System.out.println("Department :" + p2.department);

    }
}

class Officer extends Employee{
    public String specialization;
}

class Manager extends Employee{
    public String department;
}
