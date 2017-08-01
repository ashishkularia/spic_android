import java.util.Scanner;

class WhileLoop {
	public static void main(String[] args) {
		String type="", choice="", btype="", ctype="";
		int seats=0, cseats=0;
		double amt=0.0, camt=0.0, deduction=0.0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("\nDo you want to Book or Cancel?");
			btype = sc.next();
			switch (btype) {
				case "Book":
				case "book":
				case "BOOK":
					System.out.println("\nEnter Class type");
					System.out.println("\nGold costs Rs.300 \nSilver costs Rs.200 \nNormal costs Rs.100");
					type=sc.next();
					System.out.println("\nEnter number of seats");
					seats=sc.nextInt();
					switch (type){
						case "Gold":
						case "gold":
						case "GOLD":
							amt=seats*300;
							System.out.println("\nYour Bill is "+amt);
							break;
						case "Normal":
						case "normal":
						case "NORMAL":
							amt=seats*100;
							System.out.println("\nYour Bill is "+amt);
							break;
						case "Silver":
						case "silver":
						case "SILVER":
							amt=seats*200;
							System.out.println("\nYour Bill is "+amt);
							break;
						default:
							System.out.println("\nInvalid Choice");
						}
					break;

				case "Cancel":
				case "cancel":
				case "CANCEL":
					if (type.equals("")) {
						System.out.println("\nSorry Cancellation cannot be proceeded as their is no booking details available.");
					}
					else	{
						System.out.println("\nEnter Class type you want to cancel.");
						System.out.println("\nGold\nSilver\nNormal");
						ctype=sc.next();
						System.out.println("\nEnter the number of seats to cancel");
						cseats=sc.nextInt();
						if ((type.equals("gold")||type.equals("Gold")||type.equals("GOLD"))&&(ctype.equals("gold")||ctype.equals("Gold")||ctype.equals("GOLD"))) {ctype=type;}
						if ((type.equals("silver")||type.equals("Silver")||type.equals("SILVER"))&&(ctype.equals("silver")||ctype.equals("Silver")||ctype.equals("SILVER"))) {ctype=type;}
						if ((type.equals("normal")||type.equals("Normal")||type.equals("NORMAL"))&&(ctype.equals("normal")||ctype.equals("Normal")||ctype.equals("NORMAL"))) {ctype=type;}
						if (ctype.equals(type)) {
							if (cseats<=seats) {
								switch (type){
									case "Gold":
									case "gold":
									case "GOLD":
										camt=seats*300;
										System.out.println("Your Bill was of Rs. " + amt);
										deduction=camt*25/100;
										System.out.println("\n Cancellation Charges are " + deduction);
										camt -= deduction;
										System.out.println("\nAmount that will returned is "+camt+"\n");
										break;
									case "Normal":
									case "normal":
									case "NORMAL":
										camt=seats*100;
										System.out.println("Your Bill was of Rs. " + amt);
										deduction=camt*25/100;
										System.out.println("\n Cancellation Charges are " + deduction);
										camt -= deduction;
										System.out.println("\nAmount that will returned is "+camt+"\n");
										break;
									case "Silver":
									case "silver":
										case "SILVER":
										camt=seats*200;
										System.out.println("Your Bill was of Rs. " + amt);
										deduction=camt*25/100;
										System.out.println("\n Cancellation Charges are " + deduction);
										camt -= deduction;
										System.out.println("\nAmount that will returned is "+camt+"\n");
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
							System.out.println("\nKindle enter your booking class.");
						}
					}
					break;
				default:
					System.out.println("Kindly say \"Yes\" or \"No\"");
			}
			System.out.println("\nDo you want to do another booking or Cancellation? Yes or No");
			choice = sc.next();
		}
		while (choice.equals("Yes")||choice.equals("yes")||choice.equals("YES"));
	}
}

class NestedFor	{
	public static void main(String[] args) {
		for (int i=0; i<=5; i++) {
			for (int j=0; j<=5; j++) {
				System.out.print(i+" "+j+"\t");				
			}
		System.out.println();			
		}
	}
}