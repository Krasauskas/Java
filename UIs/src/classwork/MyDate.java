package classwork;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**Created by V Krasauskas
/**
/**Created on Mar 5, 2018**/

public class MyDate {

	int year, month, day;
	
	public MyDate() {
		DateFormat y = new SimpleDateFormat("yyyy");
		DateFormat m = new SimpleDateFormat("MM");
		DateFormat d = new SimpleDateFormat("dd");
		Date date = new Date(System.currentTimeMillis());
		year = Integer.parseInt(y.format(date));
		month = Integer.parseInt(m.format(date));
		day = Integer.parseInt(d.format(date));
	}
	
	public MyDate(long elapsedTime) {
		DateFormat y = new SimpleDateFormat("yyyy");
		DateFormat m = new SimpleDateFormat("MM");
		DateFormat d = new SimpleDateFormat("dd");
		Date date = new Date(elapsedTime);
		year = Integer.parseInt(y.format(date));
		month = Integer.parseInt(m.format(date));
		day = Integer.parseInt(d.format(date));
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month - 1;
	}
	
	public int getDay() {
		return day;
	}
	
	public static void main(String[] args) {
		
		MyDate test = new MyDate(561555550000L);
		System.out.println(test.getYear());
		System.out.println(test.getMonth());
		System.out.println(test.getDay());
	}

}
