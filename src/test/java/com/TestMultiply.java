package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import com.CalculateService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMultiply {

	@Test
	public void testMultiply() {
		CalculateService cs = new CalculateService();
		int result = cs.multiply();
		Assertions.assertEquals(100, result);
	}
}
