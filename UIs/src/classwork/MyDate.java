package classwork;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**Created by V Krasauskas
/**
/**Created on Mar 5, 2018**/

public class MyDate {

	int year, month, day;
	DateFormat y = new SimpleDateFormat("yyyy");
	DateFormat m = new SimpleDateFormat("MM");
	DateFormat d = new SimpleDateFormat("dd");
	
	public MyDate() {
		
		Date date = new Date(System.currentTimeMillis());
		year = Integer.parseInt(y.format(date));
		month = Integer.parseInt(m.format(date));
		day = Integer.parseInt(d.format(date));
	}
	
	public MyDate(long time) {
		Date date = new Date(time);
		year = Integer.parseInt(y.format(date));
		month = Integer.parseInt(m.format(date));
		day = Integer.parseInt(d.format(date));
	}
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setDate(long elapsedTime) {
		Date date = new Date(elapsedTime);
		this.year = year + Integer.parseInt(y.format(date));
		this.month = month + Integer.parseInt(m.format(date));
		this.day = day + Integer.parseInt(d.format(date));
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
		
		MyDate test = new MyDate();
		System.out.print(test.getYear() + " ");
		System.out.print(test.getMonth() + " ");
		System.out.println(test.getDay());
		
		MyDate test2 = new MyDate(34355555133101L);
		System.out.print(test2.getYear() + " ");
		System.out.print(test2.getMonth() + " ");
		System.out.println(test.getDay());
	}

}
