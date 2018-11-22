/**  
 * @Title: DateConverter.java
 * @Package edu.zju.cst.converter
 * @author Zhao Qian
 */
package edu.zju.cst.converter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

/**
 * 日期转换
 * @author Zhao Qian
 * @date 2018年11月23日
 * @version 1.0
 */
public class DateConverter implements Converter<String, Date> {
	private static final List<String> formarts = new ArrayList<>(4);

	static {
		formarts.add("yyyy-MM");
		formarts.add("yyyy-MM-dd");
		formarts.add("yyyy-MM-dd hh:mm");
		formarts.add("yyyy-MM-dd hh:mm:ss");
	}

	@Override
	public Date convert(String s) {
		if (StringUtils.isEmpty(s)) {
			return null;
		}
		try {
			String formatter = "";
			if (s.matches("^\\d{4}-\\d{1,2}$")) {
				formatter = formarts.get(0);
			} else if (s.matches("^\\d{4}-\\d{1,2}-\\d{1,2}$")) {
				formatter = formarts.get(1);
			} else if (s.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}$")) {
				formatter = formarts.get(2);
			} else if (s.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}:\\d{1,2}$")) {
				formatter = formarts.get(3);
			} else {
				throw new IllegalArgumentException("Invalid boolean value '" + s + "'");
			}
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatter);
			return simpleDateFormat.parse(s);
		} catch (Exception e) {
			return null;
		}
	}

}
