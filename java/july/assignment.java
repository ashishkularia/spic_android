import java.util.Scanner;

/*class Assignment_1_28_07_2017{
	public static void main(String[] args) {
		
	}
	void function_1{
		int
	}
}*/

class Assignment_1_31_07_2017{
		int seat, choice, total;
	public static void main(String[] args) {
		Assignment_1_31_07_2017 obj=new Assignment_1_31_07_2017();
		obj.function_1();
	}
	void function_1() {
		Scanner obj=new Scanner(System.in);
		System.out.println("Price of Tickets");
		System.out.println("1. Gold = 300");
		System.out.println("2. Silver = 200");
		System.out.println("3. Normal = 100");
		System.out.println("");
		System.out.println("Select your Choice by entering number");
		choice = obj.nextInt();
		System.out.println("");
		System.out.println("Enter The number of Seat(s)");
		System.out.println("");
		seat = obj.nextInt();
		switch (choice) {
			case 1:
				total = seat*300;
				System.out.println("Your Bill is " + total);
				break;
			case 2:
				total = seat*200;
				System.out.println("Your Bill is " + total);
				break;
			case 3:
				total = seat*100;
				System.out.println("Your Bill is " + total);
				break;
			default:
				System.out.println("Kindly Select at least one category to proceed ahead");
		}
	}
}

class Assignment_2_31_07_2017{
	int unit;
	double bill=0.0;

	public static void main(String[] args) {
		Assignment_2_31_07_2017 obj = new Assignment_2_31_07_2017();
		obj.function_2();
	}
	void function_2() {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Units");
		unit = obj.nextInt();
		if (unit<=100){
			bill=unit*1.25;
		}
		else if(unit<=200 && 100<unit){
			bill=100*1.25;
			unit=unit-100;
			bill=bill+(unit*2.10);
		}
		else if (unit<=300 && 200<unit) {
			bill = (100*1.25) + (100*2.10);
			unit = unit-200;
			bill = bill + (unit*3.50);		
		}
		else if (unit<=400 && 300<unit) {
			bill = (100*1.25) + (100*2.10) + (100*3.50);
			unit = unit-300;
			bill = bill + (unit*4.50);
		}
		else if (unit<=500 && 400<unit) {
			bill = (100*1.25) + (100*2.10) + (100*3.50) + (100*4.50);
			unit = unit - 400;
			bill = bill + (unit*5.50);
		}
		else {
			bill = (100*1.25) + (100*2.10) + (100*3.50) + (100*4.50) + (100*5.50);
			unit = unit - 500;
			bill = bill + (unit*7.50);
		}
		System.out.println("Totol bill : " + bill);
	}
}