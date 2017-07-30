import java.io.*; //importing java.io package
import java.util.Scanner; /*Scanner class is used for taking input from console. It provide different method for different data types like for next() for string  nextInt() for integer and more*/
class MainDemo
{
		String name;
		int roll;
	public static void main(String[] args) {
		show(); //will run only in static method if the called method is static
		MainDemo d=new MainDemo(); //creating object "d" of MainDemo class
		d.show2(); //calling show2 method using object "d"
		d.scannerClassDemo();
	}
	static void show()
	{
		System.out.println("static show() method within class MainDemo");
	}
	void show2()
	{
		try{
			DataInputStream in = new DataInputStream(System.in); //A "in" object is created of DataInputStream class; DataInputStream is predefined class of java.io package
		name = in.readLine(); // reading input with object 'in' and storing into name variable
		String s = in.readLine();
		roll = Integer.parseInt(s); // converting string data into integer type using wrapper class
		System.out.println("show2 method called by using object");
		System.out.println("Name is "+name+" Roll number is "+roll);
		}
		catch(Exception e){

		}
	}
	void scannerClassDemo()
		{
			//String name;
			//int roll;
			double salary;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name, roll number, salary");
			name = sc.nextLine(); //next(); is used for single character while nextLine() is used for group of characters.
			roll = sc.nextInt();
			salary = sc.nextDouble();
			System.out.println("name is "+name+" Roll number is "+roll+" Salary is "+salary);
		}
}