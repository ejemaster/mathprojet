package org.i9Bach.mathUtils;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

public class Test2 {
	
	
   @Test
	
	void test2()
	{
	MathFunktion test2 = new MathFunktion();
		int output = test2.Mul(2, 10);
		assertNotEquals(15, output);
		for(output=1; output <= test2.Mul(8,10);output++)
		{
			System.out.println(output);

			if (output==test2.Mul(8,10))
			{
				System.out.println("Test Passsed: Ewartet Zahl  " + output+ " Ergebnis " + test2.Mul(8,10));

			}
		}
	try {
		TimeUnit.SECONDS.sleep(5);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 	
	}

}
