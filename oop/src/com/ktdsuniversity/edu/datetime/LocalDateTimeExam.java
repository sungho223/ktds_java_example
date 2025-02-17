package com.ktdsuniversity.edu.datetime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExam {
	public static void main(String[] args) {
		String line = "=";
		String repeat = line.repeat(100);
		
		
		LocalDate nowDate = LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM년 dd일");
		String strNowDate = dateFormatter.format(nowDate);
		System.out.println(nowDate);
		System.out.println(strNowDate);
		System.out.println(repeat);
		
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String strNowTime = timeFormatter.format(nowTime);
		System.out.println(nowTime);
		System.out.println(strNowTime);
		System.out.println(repeat);
		
		LocalDateTime nowDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String strNowDateTime = nowDateTime.format(dateTimeFormatter);
		System.out.println(nowDateTime);
		System.out.println(strNowDateTime);
		System.out.println(repeat);
		
		nowDate = LocalDate.of(2022, 1, 1);
		nowDate = nowDate.plusDays(10);
		nowDate = nowDate.plusMonths(2);
		nowDate = nowDate.plusYears(3);
		dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM읠 dd일");
		strNowDate = dateFormatter.format(nowDate);
		System.out.println(nowDate);
		System.out.println(strNowDate);
		System.out.println(repeat);
		
		nowTime = LocalTime.of(00, 00, 01);
		nowTime = nowTime.plusHours(10);
		nowTime = nowTime.plusMinutes(5);
		nowTime = nowTime.plusSeconds(55);
		timeFormatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		strNowTime = timeFormatter.format(nowDateTime);
		System.out.println(nowTime);
		System.out.println(strNowTime);
		System.out.println(repeat);
		
		nowDateTime = LocalDateTime.of(2022, 2, 1, 11, 39, 11);
		nowDateTime = nowDateTime.plusDays(10);
		nowDateTime = nowDateTime.plusMonths(2);
		nowDateTime = nowDateTime.plusYears(3);
		nowDateTime = nowDateTime.plusHours(10);
		nowDateTime = nowDateTime.plusMinutes(5);
		nowDateTime = nowDateTime.plusSeconds(55);
		dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		strNowDateTime = dateTimeFormatter.format(nowDateTime);
		System.out.println(nowDateTime);
		System.out.println(strNowDateTime);

	}

}
