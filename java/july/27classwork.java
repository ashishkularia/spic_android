import java.util.Scanner;
//name id address salary pin designation
class Emp{
		String name, address, designation;
		int id, pin;
		double salary;
	void inputData(){
		Scanner prnt = new Scanner(System.in);
		System.out.println("Enter your Name, Id, Address, Salary, Pin, Designation");
		name = prnt.nextLine();
		id = prnt.nextInt();
		Scanner prnt2= new Scanner(System.in);
		address = prnt2.nextLine();
		salary = prnt.nextDouble();
		pin = prnt.nextInt();
		Scanner prnt3= new Scanner(System.in);
		designation = prnt3.nextLine();
	}
	void outputData(){
		System.out.println("Name is "+name);
		System.out.println("Employee Id is "+id);
		System.out.println("Address: "+address+" Pin : "+pin);
		System.out.println("Salary: "+salary);
		System.out.println("Designation is "+designation);
	}
	public static void main(String[] args) {
		Emp sc=new Emp();
		sc.inputData();
		sc.outputData();
	}
}