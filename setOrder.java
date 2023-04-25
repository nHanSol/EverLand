package EverLandGo;
import java.util.ArrayList;
import java.util.List;


public class setOrder {  
	List<OrderList> data = new ArrayList<OrderList>();
	OrderList orderList = null;

	public void setOrders(int select,int quantity,int eachSum, String strDiscount) {
		orderList = new OrderList();
		orderList.setSelect(select);
		orderList.setQuantity(quantity);
		orderList.setEachSum(eachSum);
		//orderList.setEachSum(discount);
		orderList.setStrDiscout(strDiscount);	
		data.add(orderList);
	}	
	public void setReset() {
		data.clear();
	}

}