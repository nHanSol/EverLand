package EverLandGo;

public class RealMain {


	public static void main(String[] args) {


		// OrderList.setOrders(orderList);
		RealInput input = new RealInput();
		do {
			input.resetData();
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