package model;

public final class ExamineeConstants {
	public static final String FAIL = "TRUOT";
	public static final String PASS = "TRUNG TUYEN";
	public static final String KV1 = "KV1";
	public static final String KV2 = "KV2";
	public static final String KV3 = "KV3";
	public static final double SCORE_KV1 = 0.5f;
	public static final double SCORE_KV2 = 1.0f;
	public static final double SCORE_KV3 = 2.5f;
	public static double SMALESS_SCORE ;
	
	public static void setSmall(double small) {
		SMALESS_SCORE = small;
	}
}

