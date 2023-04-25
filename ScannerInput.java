package EverLandGo;
import java.util.Scanner;


public class ScannerInput {
	Scanner scanner = new Scanner(System.in);

	private static int select=0;
	private static int quantity=0;
	private static String id="";
	private static int discount=0;


	private int eachSum=0;
	private int chooseLanguage=0;
		
	public int getChooseLanguage() {
		return chooseLanguage;
	}


	public void setChooseLanguage() {
		chooseLanguage=scanner.nextInt();
	}


	public int getEachSum() {
		return eachSum;
	}


	public void setEachSum(int eachSum) {
		this.eachSum = eachSum;
	}


	public void setSelect(int select) {
		this.select = select;
	}


	public int getSelect() {
		return select;
	}

	public void setSelect() {
		select=scanner.nextInt();
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity() {
		quantity=scanner.nextInt();
	}
	public String getId() {
		return id;
	}
	public void setId() {
		 id=scanner.next();
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount() {
		discount=scanner.nextInt();
	}
	public int getClose() {
		return discount;
	}
	public void setClose() {
		discount=scanner.nextInt();
	}



}