package com.rsw.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.rsw.qa.base.BaseClass;
import com.rsw.qa.listners.TestListners;

@Listeners(TestListners.class)
public class QA extends BaseClass{
	
	public QA() {
		super();
	}
	
	@Test
	public void failedTest() {
		Assert.assertEquals("QA", "QA");
	}

}
