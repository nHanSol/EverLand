package EverLandGo;

import java.util.ArrayList;
import java.util.List;

public class OrderList {

	private int select;
	private int quantity;
	private int eachSum;
	private static int discount;

	private String strDiscout;
	



	public int getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = sc.getDiscount();
	}


	
	private ScannerInput sc=null;
	//private static int discount=3;

	public OrderList() {
		this.sc = new ScannerInput();
		discount = sc.getDiscount();
	}


	public int getSelect() {
		return select;
	}
	public void setSelect(int select) {
		this.select = select;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getEachSum() {
		return eachSum;
	}
	public void setEachSum(int eachSum) {
		this.eachSum = eachSum;
	}
	public String getStrDiscout() {
		return strDiscout;

	}
	
	
	public void setStrDiscout(String strDiscout) {
		
		if( PrintClass.LANGUAGE.equals("KR")) {
			strDiscout= ConstValueClass.DISCOUNT_KR[discount];
			}else if(PrintClass.LANGUAGE.equals("US")) {
				strDiscout= ConstValueClass.DISCOUNT_US[discount];
			}else if(PrintClass.LANGUAGE.equals("JP")) {
				strDiscout= ConstValueClass.DISCOUNT_JP[discount];
			}else
				strDiscout= "NULL";
		
		
		this.strDiscout = strDiscout;
	}




	public String getTotalSelectToString() {


		return ConstValueClass.NAME[select];

	}

	public String getTotalSelectToStringLanguage() {
		if( PrintClass.LANGUAGE.equals("KR")) {
			return ConstValueClass.NAME_KR[select];
		}else if(PrintClass.LANGUAGE.equals("US")) {
			return ConstValueClass.NAME_US[select];
		}else if(PrintClass.LANGUAGE.equals("JP")) {
			return ConstValueClass.NAME_JP[select];
		}else
			return "NULL";
	}







}
