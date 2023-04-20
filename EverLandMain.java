package EverLandGo;
import java.util.*;
import java.time.LocalDate;

// Before class split

public class EverLandMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	


		int select=0, quantity=0, eachSum=0;
		String strDiscout="";
		int discount=0, count=0;
		int close=0;
		int totalSum=0;
		do {
			setOrder set = new setOrder();
			do {
				do {
					System.out.println("Please select the type of ticket you want!");
					System.out.print("1. A type\t2. B type\t3. C type\t4. D type: \n");
					select = scanner.nextInt();
				}while(  !(select == 1 || select == 2 || select==3 || select==4)  );

				//age calculation
				System.out.println("Please enter your resident registration number. (Input format: yymmdd1234567)");
				String id =scanner.next();
				int year, month, day,age;
				int current_year, current_month, current_day;
				int gender = 0;

				year = Integer.parseInt(id.substring(0, 1)) * 10 + Integer.parseInt(id.substring(1, 2));
				month = Integer.parseInt(id.substring(2, 3)) * 10+Integer.parseInt(id.substring(3, 4));
				day = Integer.parseInt(id.substring(4, 5)) * 10+Integer.parseInt(id.substring(5, 6));
				gender = Integer.parseInt(id.substring(6, 7));

				if (gender == 3 || gender == 4) {
					year += 2000;
				} else {
					year += 1900;
				}
				current_year=LocalDate.now().getYear();
				current_month =	LocalDate.now().getMonthValue();
				current_day = LocalDate.now().getDayOfMonth();
				age = current_year - year;
				if ((current_month < month) || ((current_month == month) && (current_day < day))) {
					age--;
				}

				//age Discount  
				if (age < ConstValueClass.MIN_CHILD) {
					select = 0;
				} else if (age < ConstValueClass.MIN_TEEN || age > ConstValueClass.MAX_ADULT) {
					select = select + 4;

				} 


				// quantity
				do {
					System.out.println("How many would you like to order? (Up to 10)");
					quantity = scanner.nextInt();
				} while(quantity > ConstValueClass.MAX_COUNT || quantity < ConstValueClass.MIN_COUNT);

				//  select Discount 

				do {

					System.out.println("Please select any preferences");
					System.out.println("1.None [Age benefits are automatically processed]  2. Disabled person  "
							+ "3. National merit recipient  4. Multi-child family  5. Pregnant woman");
					discount = scanner.nextInt();

				} while(!(discount == 1 || discount == 2 || discount == 3||discount==4));

				switch (discount) {
				case 0: 
					eachSum=0;
				case 1:
					eachSum = (int)(ConstValueClass.PRICE[select] * quantity);
					strDiscout = "*No special benefits";
					break;
				case 2:
					eachSum = (int)(ConstValueClass.DISABLE_DISCOUNT_RATE * ConstValueClass.PRICE[select] * quantity);
					strDiscout= "*Disabled benefits applied";
					break;
				case 3:
					eachSum = (int)(ConstValueClass.MERIT_DISCOUNT_RATE * ConstValueClass.PRICE[select] * quantity);
					strDiscout= "*National merit benefits applied";
					break;
				case 4:
					eachSum = (int)(ConstValueClass.MULTICHILD_DISCOUNT_RATE * ConstValueClass.PRICE[select] * quantity);
					strDiscout = "*Multi-child benefits applied";
					break;
				case 5:
					eachSum = (int)(ConstValueClass.PREGNANT_DISCOUNT_RATE * ConstValueClass.PRICE[select] * quantity);
					strDiscout = "*Pregnancy benefits applied";
					break;
				}


				System.out.printf("The price is %d won.\n",eachSum);
				System.out.println("Continue with ticket issuance?");
				System.out.println("1. ticket purchasing \n2. Quit\n");
				close = scanner.nextInt();

				set.setOrders(select, quantity, eachSum, strDiscout);
			} while(close==1);



			System.out.println("\nTicket printing completed. Thank you\n");
			System.out.println("==================== EverLand ====================");

			for(OrderList orderList : set.data) {
				totalSum += orderList.getEachSum();
				System.out.printf("%-15s  *  %3d  %10dWon   %-10s \n",
						orderList.getTotalSelectToString(),orderList.getQuantity(),orderList.getEachSum(),orderList.getStrDiscout());
			}


			System.out.printf("The total admission fee is %d Won\n",totalSum);
			System.out.println("==================================================");

			System.out.println("Please select an option:     1 : New order, 2: End the program : ");
			close = scanner.nextInt(); } while (close ==1);




	}


}
