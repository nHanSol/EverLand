package EverLandGo;
import java.time.LocalDate;
import java.util.Locale;

public class RealMain {


	public static void main(String[] args) {
		

		Locale currentLocale = Locale.getDefault();
		System.out.println("local : " + currentLocale.getCountry());

		PrintClass.startLanguage(currentLocale.getCountry());

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