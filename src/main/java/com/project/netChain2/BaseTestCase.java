package com.project.netChain2;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.testng.Assert;




public class BaseTestCase {
	public static void assertTrue(boolean expression, String messageOnFailure){

		if(!expression){
			String callerClass = Thread.currentThread().getStackTrace()[2].getClassName();
			callerClass = callerClass.substring(callerClass.lastIndexOf(".")+1);
			String callerMethod = Thread.currentThread().getStackTrace()[2].getMethodName();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss");
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());			
			String timeStamp = sdf.format(timestamp);
			Common.captureScreenshot(callerClass + "_" + callerMethod + "_" + timeStamp);
		}
		
	Assert.assertTrue(expression, messageOnFailure);
		

	}

}
