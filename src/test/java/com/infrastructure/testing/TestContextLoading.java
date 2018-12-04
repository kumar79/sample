package com.infrastructure.testing;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextLoader;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.apps.classes.Books;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"org.setup.combination"}, loader=ContextLoader.class)
public class TestContextLoading {

	static {
		
		System.out.println("Comes in  this class");
	}
	@Autowired
	Books books;
	
	@Test(groups= {"myTest"})
	void testContexts() {
		System.out.println("Test is successful");
		Assert.assertNotNull(books);
		Assert.assertEquals(65, books.privatization()); 
	}
	
	@Test
	void testValue() {
		Assert.assertEquals(10, 10); 
	}
}
