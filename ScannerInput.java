package EverLandGo;
import java.util.Scanner;


public class ScannerInput {
	Scanner scanner = new Scanner(System.in);

	private int select=0;
	private int quantity=0;
	private String id="";
	private int discount=0;


	private int eachSum=0;

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
	public String getStrDiscoutToString() {   
	      return ConstValueClass.DISCOUNT[discount];  // select를 인덱스 값으로 하여 ticket 이름으로 반영
	}


}