package com.lee.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class DateFormatter implements Formatter<Date> {
	
	private static final String datePattern = "yyyy-MM-dd HH:mm:ss";

	//private SimpleDateFormat sdf;
	
	@Override
	public String print(Date date, Locale locale) {
		// TODO Auto-generated method stub
		return new SimpleDateFormat(datePattern).format(date);
	}

	@Override
	public Date parse(String source, Locale locale) throws ParseException {
		return new SimpleDateFormat(datePattern).parse(source);
	}

}
