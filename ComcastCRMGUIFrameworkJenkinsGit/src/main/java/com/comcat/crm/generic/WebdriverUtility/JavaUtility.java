package com.comcat.crm.generic.WebdriverUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class JavaUtility 
{
	 
public int getRandomNumber()
{
	Random r= new Random();
	int randomNumber = r.nextInt();
	return randomNumber;
}

public String getSystemCurrentDateddMMyyyy()
{
	Date d= new Date();//will fetch the system current date and time
	SimpleDateFormat s= new SimpleDateFormat("yyyy-MM-dd");
	String date = s.format(d);// format and fetch required data in req format
	return date;
}


public String getRequiredDateddMMyyyy(int days_After)
{
	Date d= new Date();
	
	SimpleDateFormat s= new SimpleDateFormat("yyyy-MM-dd");
	s.format(d);
	Calendar cal= s.getCalendar();//
	cal.add(Calendar.DAY_OF_MONTH, days_After);
	String reqdate = s.format(cal.getTime());
	
	return reqdate;
}
}
