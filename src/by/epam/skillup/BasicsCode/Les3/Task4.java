package by.epam.skillup.BasicsCode.Les3;

import java.math.BigInteger;

public class Task4 {

	public BigInteger compPow(int value) {

		BigInteger result = BigInteger.valueOf(1);

		for (int i = 1; i <= 200; i++) {
			result = result.multiply(BigInteger.valueOf((long) i * i));
		}
		
		return result;
	}
}
