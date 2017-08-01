import java.util.Scanner;

class WhileLoop {
	public static void main(String[] args) {
		String type="", choice="";
		int seats;
		double amt=0.0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter Class type");
			System.out.println(" Gold 300 \n Silver 200 \n Normal 100 \n");
			type=sc.next();
			System.out.println("Enter number of seats");
			seats=sc.nextInt();
			switch (type){
				case "Gold":
				case "gold":
				case "GOLD":
					amt=seats*300;
					System.out.println("\nYour Bill is "+amt+"\n");
					break;
				case "Normal":
				case "normal":
				case "NORMAL":
					amt=seats*100;
					System.out.println("Your Bill is "+amt+"\n");
					break;
				case "Silver":
				case "silver":
				case "SILVER":
					amt=seats*200;
					System.out.println("Your Bill is "+amt+"\n");
					break;
				default:
					System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to book more tickets? Yes or No \n");
			choice = sc.next();
		}
		while (choice.equals("Yes")||choice.equals("yes")||choice.equals("YES"));
	}
}