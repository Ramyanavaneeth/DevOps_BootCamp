package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import com.CalculateService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestConcatenate {
	
	@Test
	public void testconcatenate() {
		CalculateService cs = new CalculateService();
		String result = cs.concatenate("one", "two");
		Assertions.assertEquals("onetwo", result);
	}
}
