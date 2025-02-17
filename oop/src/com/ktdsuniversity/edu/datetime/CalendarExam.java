package com.ktdsuniversity.edu.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar nowCal = Calendar.getInstance();
		String line = "=";
		String repeat = line.repeat(100);

		System.out.println(nowCal.get(Calendar.YEAR));
		System.out.println(nowCal.get(Calendar.MONTH) + 1);
		System.out.println(nowCal.get(Calendar.DAY_OF_MONTH));
		System.out.println(nowCal.get(Calendar.HOUR));
		System.out.println(nowCal.get(Calendar.MINUTE));
		System.out.println(nowCal.get(Calendar.SECOND));
		System.out.println(nowCal.get(Calendar.DAY_OF_WEEK));
		System.out.println(repeat);

		Date now = Calendar.getInstance().getTime();
		System.out.println(now);
		System.out.println(repeat);

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDate = format.format(now);
		System.out.println(formatDate);
		System.out.println(repeat);

		nowCal = Calendar.getInstance();
		nowCal.set(2022, 01, 01);
		nowCal.add(Calendar.DAY_OF_MONTH, 10);
		nowCal.add(Calendar.DAY_OF_MONTH, -20);
	}
}
