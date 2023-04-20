package EverLandGo;

public class ConstValueClass {
	// 이용금액
//	public static final int BABY_PRICE = 0; // 36개월 미만
//    public static final int ADULT_TEEN_A_PRICE = 62000;
//    public static final int ADULT_TEEN_B_PRICE = 52000;
//    public static final int ADULT_TEEN_C_PRICE = 46000;
//    public static final int ADULT_TEEN_D_PRICE = 68000;
//    public static final int CHILD_OLD_A_PRICE = 52000;
//    public static final int CHILD_OLD_B_PRICE = 42000;
//    public static final int CHILD_OLD_C_PRICE = 36000;
//    public static final int CHILD_OLD_D_PRICE = 58000;
    public static final int[] PRICE = {0, 62000, 52000, 46000, 68000, 52000, 42000, 36000, 58000};
    
    public static final String[] NAME = {"BABY", "ADULT&TEEN_A", "ADULT&TEEN_B", "ADULT&TEEN_C", "ADULT&TEEN_D", "CHILD&OLD_A", "CHILD&OLD_B", "CHILD&OLD_C", "CHILD&OLD_C"};

    static final String[] DISCOUNT = {"*None","*Disabled benefits applied","*National merit benefits applied",
			"*Multi-child benefits applied","* benefits applied"	};	
    
    // 나이에 따른 범위    
    public static final int MIN_BABY = 1;
    public static final int MIN_CHILD = 3;
    public static final int MIN_TEEN = 13;
    public static final int MIN_ADULT = 19;
    public static final int MAX_CHILD = 12;
    public static final int MAX_TEEN = 18;
    public static final int MAX_ADULT = 64;

    // 할인율
    public static final float DISABLE_DISCOUNT_RATE = 0.6f;
    public static final float MERIT_DISCOUNT_RATE = 0.5f;
    public static final float MULTICHILD_DISCOUNT_RATE = 0.8f;
    public static final float PREGNANT_DISCOUNT_RATE = 0.85f;

    // 최대 주문량
    public static final int MAX_COUNT = 10;
    public static final int MIN_COUNT = 1;
}