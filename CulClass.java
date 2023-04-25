package EverLandGo;

import java.time.LocalDate;

public class CulClass {

	ScannerInput sc = new ScannerInput();


	public int ageCul() { //만나이 계산 
		int year, month, day;
		int current_year, current_month, current_day;
		int gender = 0;
		int age;
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
		int ageSelect = culAgeSelect(age);
		return ageSelect;
	}


	private int culAgeSelect(int culAge) { // select 변경된 값 반영
		int select = sc.getSelect();
		if (culAge < ConstValueClass.MIN_CHILD) {
			sc.setSelect(0);
			return 0;
		} else if (culAge < ConstValueClass.MIN_TEEN || culAge > ConstValueClass.MAX_ADULT) {
			sc.setSelect(select+4);
			return select + 4;
		} else {
			sc.setSelect(select);
			return select;
		}
	}

	public int culPrice () {; // eachSum 계산
	int quantity = sc.getQuantity();
	int discount=sc.getDiscount();
	int select = sc.getSelect();
	int eachSum=0;
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

}
