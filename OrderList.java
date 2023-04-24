package EverLandGo;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
	
	private int select;
	private int quantity;
	private int eachSum;
	private String strDiscout;
	private int totalSum;
		
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
		this.strDiscout = strDiscout;
	}
		
	
//	public void setTotalSelectToString(String strDiscout) {
//		
//		this.strDiscout = strDiscout;
//		
//	}

	public String getTotalSelectToString() {
		
		return ConstValueClass.NAME[select];
		
	}
	
	public void setTotalSum(int totalSum ) {
		this.totalSum = totalSum;
	}
	public int getTotalSum() {
		return totalSum;
	}

	

}
