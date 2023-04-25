package EverLandGo;

public class PrintClass {


	private ScannerInput sc = null;
	//private int chooseLanguage;


	public static String LANGUAGE;

	public static void startLanguage(String country) {
		PrintClass.LANGUAGE=country;
	}






	public void inputSelectLanguage( ) {
		//chooseLanguage = sc.getChooseLanguage();

		if( LANGUAGE.equals("KR")) {
			System.out.println("원하는 티켓 종류를 선택해주세요!");
			System.out.print("1. A 타입\t2. B 타입\t3. C 타입\t4. D 타입 \n");
		}else if(LANGUAGE.equals("US")) {
			System.out.println("select the type of ticket!");
			System.out.print("1. A type\t2. B type\t3. C type\t4. D type \n");
		}else if (LANGUAGE.equals("JP")) {
			System.out.println("希望のチケット種類をお選びください");
			System.out.print("1.  A タイプ\t2. B タイプ\t3. C タイプ\t4. D タイプ \n");
		}
	}

	public void inputIdLanguage() {
		if(LANGUAGE.equals("KR")) {
			System.out.println("주민번호를 눌러주세요 (입력형식 : yymmdd1234567)");

		}else if(LANGUAGE.equals("US")) {
			System.out.println("Please enter your resident registration number. (Input format: yymmdd1234567)");
		}else if (LANGUAGE.equals("JP")) {
			System.out.println("住民番号を押してください (入力形式 : yymmdd1234567)");
			
		}
	}

	public void inputQuantityLanguage() {
		if( LANGUAGE.equals("KR")) {
			System.out.println("구매 수량을 입력해주세요(1개 이상 10개 이하)");

		}else if(LANGUAGE.equals("US")) {
			System.out.println("How many would you like to order? (Up to 10)");
		}else if (LANGUAGE.equals("JP")) {
			System.out.println("ご注文は何個までですか？(10個まで)");
			
		}
	}


	public void inputDiscountLanguage() {
		if(LANGUAGE.equals("KR")) {
			System.out.println("우대조건을 선택하세요!");
			System.out.println("1. 없음 (나이 우대는 자동처리) 2. 장애인 3. 국가유공자 4. 다자녀 5. 임산부");
		}else if(LANGUAGE.equals("US")) {
			System.out.println("Please select any preferences");
			System.out.println("1.None [Age benefits are automatically processed]  2. Disabled person  "
					+ "3. National merit recipient  4. Multi-child family  5. Pregnant woman");
		}else if(LANGUAGE.equals("JP")) {
			System.out.println("ご希望があればお選びください");
			System.out.println("1.なし年齢優遇は自動）2.障害者 3.国家有功者 4.多子家庭 5.妊婦\"");
		}
	}

	public void printPriceLanguage(int eachSum) {
		if( LANGUAGE.equals("KR")) {
			System.out.printf("해당 요금은 %d 원.\n",eachSum);

		}else if(LANGUAGE.equals("US")) {
			System.out.printf("The price is %d won.\n",eachSum);
		}
		else if(LANGUAGE.equals("JP")) {
			System.out.printf("該当料金は %d 円.\n",eachSum);
		}
	}

	public void inputReStartLanguage() {
		if( LANGUAGE.equals("KR")) {
			System.out.println("계속 발권 하시겠습니까?");		
			System.out.println("1. 티켓 발권 \n2. 종료\n");

		}else if(LANGUAGE.equals("US")) {
			System.out.println("Continue with ticket process?");		
			System.out.println("1. ticket purchasing \n2. Quit\n");
		}else if(LANGUAGE.equals("JP")) {
			System.out.println("チケットの手続きを続ける？");		
			System.out.println("1.チケット発券 \n2.終了\n");
		}
	}

	public void printEndprintPriceThankYou() {
		if( LANGUAGE.equals("KR")) {
			System.out.println("\n 티켓 발권이 종료 되었습니다. 감사합니다.\n");
			System.out.println("========================= 에버랜드 ============================");

		}else if(LANGUAGE.equals("US")) {
			System.out.println("\nTicket printing completed. Thank you\n");
			System.out.println("========================== EverLand ===========================");
		}else if(LANGUAGE.equals("JP")) {
			System.out.println("\nチケット印刷完了しました。ありがとうございます\n");
			System.out.println("========================エバーランド ==========================");
		}
	}

	public void printEndprintPriceTotal(String select, int quantity, int eachsum, String discount) {
		if( LANGUAGE.equals("KR")) {
			System.out.printf("%-15s  *  %5d  %10d원   %10s \n",
					select,quantity,eachsum,discount	);
		}else if(LANGUAGE.equals("US")) {
			System.out.printf("%-15s  *  %5d  %10dWon   %10s \n",
					select,quantity,eachsum,discount	);		
		}else if(LANGUAGE.equals("JP")) {
			System.out.printf("%-15s  *  %5d  %10d円   %10s \n",
					select,quantity,eachsum,discount	);		
		}
	}
	
	public void printEndprintPriceTotalSum(int totalSum) {
		if( LANGUAGE.equals("KR")) {
			System.out.printf("총 금액은 %d 원 입니다.\n",totalSum);
			System.out.println("===================================================================");
		}else if(LANGUAGE.equals("US")) {
			System.out.printf("The total admission fee is %d Won\n",totalSum);
			System.out.println("===================================================================");	
		}
		else if(LANGUAGE.equals("JP")) {
			System.out.printf("合計金額は %d 円です.\n",totalSum);
			System.out.println("===================================================================");	
		}
	}
	
	public void inputEndLanguage() {
		if( LANGUAGE.equals("KR")) {
			System.out.println("새로운 주문을 다시하겠습니까?     1 : 새로운 주문 2: 프로그램 종료 : ");
		}else if(LANGUAGE.equals("US")) {
			System.out.println("Please select an option:     1 : New order, 2: End the program : ");	
		}else if(LANGUAGE.equals("JP")) {
			System.out.println("新しい注文を再度行いますか？  1：新しい注文 2：プログラム終了 ： ");	
		}
	}
	
	

}

//public void 






