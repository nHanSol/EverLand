package EverLandGo;

public class RealMain {


	public static void main(String[] args) {
		int select=0;
		int quantity=0;
		int eachSum=0;
		String strDiscot=" ";

		setOrder set = new setOrder();	

		// OrderList.setOrders(orderList);
		RealInput input = new RealInput();
		do {
			do {
				input.inputSelect();
				input.id();
				input.intputQuantity();
				input.inputDiscount();
				input.printPrice();

			} while(input.inputReStart()==1);
			input.printEndprintPrice();
		}while(input.intputEnd()==1);
	}

}
