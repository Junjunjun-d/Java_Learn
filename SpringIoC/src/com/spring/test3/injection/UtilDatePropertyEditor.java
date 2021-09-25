package com.spring.test3.injection;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.util.Date Ù–‘±‡º≠∆˜
 * 
 * @author Administrator
 *
 */
public class UtilDatePropertyEditor extends PropertyEditorSupport {
	private String pattern;

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println("------UtilDatePropertyEditor.setAsText()-------" + text);
		try {
			Date date = new SimpleDateFormat(pattern).parse(text);
			this.setValue(date);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new IllegalArgumentException(text);
		}

	}

}
