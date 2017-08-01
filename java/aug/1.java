import java.util.Scanner;

class WhileLoop {
	public static void main(String[] args) {
		String type="", choice="", btype="", ctype="";
		int seats=0, cseats=0;
		double amt=0.0, camt=0.0, deduction=0.0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Do you want to Book or Cancel?");
			btype = sc.next();
			switch (btype) {
				case "Book":
				case "book":
				case "BOOK":
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
					break;

				case "Cancel":
				case "cancel":
				case "CANCEL":
					System.out.println("Enter Class type");
					System.out.println(" Gold 300 \n Silver 200 \n Normal 100 \n");
					ctype=sc.next();
					System.out.println("Enter the number of seats to cancel");
					cseats=sc.nextInt();
					if (ctype.equals(type)) {
						if (cseats<=seats) {
							switch (type){
								case "Gold":
								case "gold":
								case "GOLD":
									camt=seats*300;
									deduction=camt*25/100;
									System.out.println("\nYour Bill is "+deduction+"\n");
									break;
								case "Normal":
								case "normal":
								case "NORMAL":
									camt=seats*100;
									deduction=camt*25/100;
									System.out.println("Your Bill is "+deduction+"\n");
									break;
								case "Silver":
								case "silver":
									case "SILVER":
									camt=seats*200;
									deduction=camt*25/100;
									System.out.println("Your Bill is "+deduction+"\n");
									break;
								default:
									System.out.println("Invalid Choice");
								}
						}
						else{
							System.out.println("your Booked tickets are " + seats + ".\nSo, kindly enter the correct number of seats.");
						}
					}
					else{
						System.out.println("Kindle book First or Enter the same class.");
					}
					break;
				}

			
			System.out.println("Do you want to continue booking tickets? Yes or No \n");
			choice = sc.next();
		}
		while (choice.equals("Yes")||choice.equals("yes")||choice.equals("YES"));
	}
}