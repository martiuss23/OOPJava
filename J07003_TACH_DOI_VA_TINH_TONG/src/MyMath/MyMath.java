package MyMath;

import java.math.BigInteger;

public class MyMath {
	public static void divideAndAdd(String num) {
		BigInteger[] nums = new BigInteger[11];
		for(int i = 0; i <= 10; i++) {
			nums[i] = new BigInteger("" + i);
		}
		while(num.length() > 1) {
			BigInteger pre = new BigInteger("0");
			BigInteger suff = new BigInteger("0");
			for(int i = 0; i < num.length()/2; i++) {
				pre = pre.multiply(nums[10]).add(nums[num.charAt(i) - '0']);
			}
			for(int i = num.length()/2; i < num.length(); i++) {
				suff = suff.multiply(nums[10]).add(nums[num.charAt(i) - '0']);
			}
			num = pre.add(suff).toString();
			System.out.println(num);
		}
	}
	
	
}
