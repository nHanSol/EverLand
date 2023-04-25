package EverLandGo;

public class ConstValueClass {
	// 이용금액
	
    public static final int[] PRICE = {0, 62000, 52000, 46000, 68000, 52000, 42000, 36000, 58000};
    
    //public static final int[] LANGUGAGE= {0,1,2,3,4,5}; // 0 : kor, 1: eng, 2:
    public static final String[] NAME = {"영유아", "학생&어른_A", "학생&어른_B", "학생&어른_C", "학생&어른_D", "어린이&고령자_A", "어린이&고령자_B", "어린이&고령자_C", "어린이&고령자_D"};

    public static final String[] NAME_KR = {"영유아", "학생&어른_A", "학생&어른_B", "학생&어른_C", "학생&어른_D", "어린이&고령자_A", "어린이&고령자_B", "어린이&고령자_C", "어린이&고령자_D"};
    public static final String[] NAME_US = {"BABY", "ADULT&TEEN_A", "ADULT&TEEN_B", "ADULT&TEEN_C", "ADULT&TEEN_D", "CHILD&OLD_A", "CHILD&OLD_B", "CHILD&OLD_C", "CHILD&OLD_D"};
    public static final String[] NAME_JP = {"乳幼児", "学生＆大人_A", "学生＆大人_B", "学生＆大人_C", "学生＆大人_D", "子供＆高齢者_A", "子供＆高齢者_B", "子供＆高齢者_C", "子供＆高齢者_D"};
    

    static final String[] DISCOUNT_KR = {"X","*해당없음","*장애인 우대 적용","*국가유공자 우대 적용",
			"*다자녀 우대 적용","*임산부 우대 적용"	};	
    
    static final String[] DISCOUNT_US = {"","*None","*Disabled benefits applied","*National merit benefits applied",
			"*Multi-child benefits applied","*Pregnancy benefits applied"	};	
    
    static final String[] DISCOUNT_JP = {"","*該当なし","*障がい者優待適用","*国家功労者優待適用",
			"*多子優待適用","*妊婦優待適用"	};	
    
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