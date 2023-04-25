package EverLandGo;

import java.time.LocalDate;
import java.util.*;

public class RealInput {
	ScannerInput sc = null;
	CulClass cul = null;

	setOrder set = new setOrder();
	PrintClass language = new PrintClass();
	
	private int select=0;
	private int eachSum=0;
	private int discount;
	private int quantity;
	private int totalSum=0;

	private static String strDiscount="";

	private int age=0;
	
	ScannerInput scan = new ScannerInput();

	public RealInput() {
		sc = new ScannerInput();	
		cul = new CulClass();
	}
	
	public void resetData() {
		totalSum=0;
		set.setReset();         
	}

	
	
	
	public int inputSelect() {

		do {
			language.inputSelectLanguage();
			sc.setSelect();
			select=sc.getSelect();
		}while(  !(sc.getSelect() == 1 || sc.getSelect()  == 2 || sc.getSelect() ==3 || sc.getSelect() ==4)  );
		return sc.getSelect();
	}



	public void id() {
		do {
			language.inputIdLanguage();
			sc.setId();
			

		}while( sc.getId().length() != 13  );

		select = cul.ageCul(); // 나이와 select 계산
	}




	public void intputQuantity() {
		do {
			language.inputQuantityLanguage();

			sc.setQuantity();
		} while(sc.getQuantity() > ConstValueClass.MAX_COUNT || sc.getQuantity() < ConstValueClass.MIN_COUNT);

		quantity = sc.getQuantity();
	}



	public void inputDiscount() {
		
		do {
			language.inputDiscountLanguage();
			sc.setDiscount();

		} while(!(sc.getDiscount() == 1 || sc.getDiscount() == 2 || sc.getDiscount() == 3||sc.getDiscount()==4||sc.getDiscount()==5));
		discount= sc.getDiscount();
	}






	public void printPrice() {
		discount=sc.getDiscount();
		eachSum = cul.culPrice ();
		totalSum+=eachSum;
		language.printPriceLanguage(eachSum);
		set.setOrders(select, quantity, eachSum,strDiscount);
	}



	public int inputReStart() {
		language.inputReStartLanguage();
		sc.setClose();
		return sc.getClose();
	}

	public void printEndprintPrice() {
		language.printEndprintPriceThankYou();



		for(OrderList orderList : set.data) {

			language.printEndprintPriceTotal(orderList.getTotalSelectToStringLanguage(),orderList.getQuantity(),orderList.getEachSum(),orderList.getStrDiscout());

		}	
		language.printEndprintPriceTotalSum(totalSum);
		
	}


	public int  intputEnd() {	
		language.inputEndLanguage();
		sc.setClose();
		return sc.getClose();		
	}



}