package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import com.CalculateService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestAdd {
	
	@Test
	public void testAdd() {
		CalculateService cs = new CalculateService();
		int result = cs.sum();
		Assertions.assertEquals(50, result);
	}
}
