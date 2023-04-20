package EverLandGo;

import java.time.LocalDate;
import java.util.*;

public class RealInput {
	private ScannerInput sc = null;
	
	setOrder set = new setOrder();
	//Scanner scanner = new Scanner(System.in);

	//RealInput realInput() = new RealInput();
	private int select=0;
	private int eachSum=0;
	private int discount;
	private int quantity;
	private int totalSum=0;
	private String strDiscount="";
	private int age=0;
	ScannerInput scan = new ScannerInput();
	
	public RealInput() {
		sc = new ScannerInput();	
	}
	
	
	public int inputSelect() {

		do {
			set.setReset();
			System.out.println("select the type of ticket!");
			System.out.print("1. A type\t2. B type\t3. C type\t4. D type: \n");
			sc.setSelect();
			select=sc.getSelect();
		}while(  !(sc.getSelect() == 1 || sc.getSelect()  == 2 || sc.getSelect() ==3 || sc.getSelect() ==4)  );
		return sc.getSelect();
	}



	public void id() {
		// String id;
		int len ;

		do {
			System.out.println("Please enter your resident registration number. (Input format: yymmdd1234567)");
			
			sc.setId();
			len = sc.getId().length();
			
		}while( sc.getId().length() != 13  );
		

		//String id =scanner.next();
		int year, month, day;
		int current_year, current_month, current_day;
		int gender = 0;

		year = Integer.parseInt(sc.getId().substring(0, 1)) * 10 + Integer.parseInt(sc.getId().substring(1, 2));
		month = Integer.parseInt(sc.getId().substring(2, 3)) * 10+Integer.parseInt(sc.getId().substring(3, 4));
		day = Integer.parseInt(sc.getId().substring(4, 5)) * 10+Integer.parseInt(sc.getId().substring(5, 6));
		gender = Integer.parseInt(sc.getId().substring(6, 7));

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
		
		
		System.out.println(age + " "+ sc.getSelect());
		//return age;
		if (age < ConstValueClass.MIN_CHILD) {
			//select=0;
			select = 0;
			
			
			//return 0;
		} else if (age < ConstValueClass.MIN_TEEN || age > ConstValueClass.MAX_ADULT) {
			select = sc.getSelect() + 4;
		} 
		select = sc.getSelect();
	}


	
	
	public void intputQuantity() {
		//int quantity=0;
		do {
			System.out.println("How many would you like to order? (Up to 10)");
			
			sc.setQuantity();
		} while(sc.getQuantity() > ConstValueClass.MAX_COUNT || sc.getQuantity() < ConstValueClass.MIN_COUNT);
		
		quantity = sc.getQuantity();
	}



	public void inputDiscount() {
		//int discount;
		do {

			System.out.println("Please select any preferences");
			System.out.println("1.None [Age benefits are automatically processed]  2. Disabled person  "
					+ "3. National merit recipient  4. Multi-child family  5. Pregnant woman");
			sc.setDiscount();

		} while(!(sc.getDiscount() == 1 || sc.getDiscount() == 2 || sc.getDiscount() == 3||sc.getDiscount()==4));
		discount= sc.getDiscount();
	}
	
	
	

	public String selectDiscount(int discount) {
		//strDiscount="";
		switch (discount) {
		case 1:
			strDiscount = "*No special benefits";
			break;
		case 2:
			strDiscount= "*Disabled benefits applied";
			break;
		case 3:
			strDiscount= "*National merit benefits applied";
			break;
		case 4:
			strDiscount = "*Multi-child benefits applied";
			break;
		case 5:
			strDiscount = "*Pregnancy benefits applied";
			break;
		}
		return strDiscount;	
	}	

	public int culPrice (int discount, int quantity) {;
		
		switch (discount) {
		case 0:
			eachSum=0;
		case 1:
			eachSum = (int)(ConstValueClass.PRICE[select] * quantity);
			break;
		case 2:
			eachSum = (int)(ConstValueClass.DISABLE_DISCOUNT_RATE * ConstValueClass.PRICE[select] * quantity);	
			break;
		case 3:
			eachSum = (int)(ConstValueClass.MERIT_DISCOUNT_RATE * ConstValueClass.PRICE[select] * quantity);
			break;
		case 4:
			eachSum = (int)(ConstValueClass.MULTICHILD_DISCOUNT_RATE * ConstValueClass.PRICE[select] * quantity);
			break;
		case 5:
			eachSum = (int)(ConstValueClass.PREGNANT_DISCOUNT_RATE * ConstValueClass.PRICE[select] * quantity);
			break;
		}
		return eachSum;

	}
	
	
	public void printPrice() {
		culPrice (discount, quantity);
		System.out.printf("The price is %d won.\n",eachSum);	
		set.setOrders(select, quantity, eachSum, strDiscount);
	}
	
	
	
	public int inputReStart() {
		
		System.out.println("Continue with ticket process?");		
		System.out.println("1. ticket purchasing \n2. Quit\n");
		sc.setClose();
		return sc.getClose();
	}
	
	public void printEndprintPrice() {
	
	
		culPrice(discount, quantity);
		System.out.println("\nTicket printing completed. Thank you\n");
		System.out.println("==================== EverLand ====================");
		
		
		
		for(OrderList orderList : set.data) {
			
			//totalSum += orderList.getEachSum();
			System.out.printf("%-15s  *  %3d  %10dWon   %-10s \n",
					orderList.getTotalSelectToString(),orderList.getQuantity(),orderList.getEachSum(),orderList.getStrDiscout());
			totalSum+=eachSum;
		}	
		System.out.printf("The total admission fee is %d Won\n",totalSum);
		System.out.println("==================================================");
	}

		
	public int  intputEnd() {	
		
		System.out.println("Please select an option:     1 : New order, 2: End the program : ");
		sc.setClose();
		return sc.getClose();		
	}
	


}
