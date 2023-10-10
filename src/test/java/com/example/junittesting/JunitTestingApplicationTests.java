package com.example.junittesting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitTestingApplicationTests {

	private Calculator c=new Calculator();
	


	@Test
	@Disabled
	void testSum()
	{
		//expectedResult
		int expectedResult=17;
		
		//actualResult
		int actualResult=c.doSum(12, 3, 2);
		
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	void testProduct()
	{
		//expectedResult
		int expectedResult=6;
		
		//actualResult
		int actualResult=c.doProduct(3, 2);
		
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	@Test
	void TestCompareNums()
	{
		
		
		//actualResult
		Boolean actualResult=c.compareTwoNums(5,5);
		
		
		assertThat(actualResult).isTrue();
	}

}

