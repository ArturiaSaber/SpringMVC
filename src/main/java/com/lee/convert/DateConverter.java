package com.lee.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {
	
	//private static final String datePattern = "yyyy-MM-dd HH:mm:ss";

	
	// 日期转换格式
    private String pattern;
    // 构造函数
    public DateConverter(String pattern) {
        super();
        this.pattern = pattern;
    }
    
	@Override
	public Date convert(String source) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			return sdf.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new IllegalArgumentException("无效的日期格式，请使用：" + pattern);
		}
	}

}
