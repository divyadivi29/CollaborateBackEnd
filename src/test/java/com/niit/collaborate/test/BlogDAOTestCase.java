package com.niit.collaborate.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BlogDAOTestCase {
	@BeforeClass
	public static void initialize()
	{
		 AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		 annotationConfigAppContext.scan("com.niit.collaberate");
		 annotationConfigAppContext.refresh();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
