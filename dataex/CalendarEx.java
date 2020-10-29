package dataex;

import java.util.Calendar;

public class CalendarEx {

	// 2020-04-24 18:22:11:05 타입으로 출력하기
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR); // 2020
		int month = cal.get(Calendar.MONTH) + 1; // 04
		String mon = (month < 10) ? "0" + month : "" + month; // 삼항 연산자
//		String mon;
//		if(month < 10) {
//			mon = "0" + month;
//		} else {
//			mon = "" + month;
//		}
		int date = cal.get(Calendar.DATE);
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(year + "-" + mon + "-" + date + "  " + hour + ":" + minute + ":" + second);
	}

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // 싱글톤
		printCalendar("현재", now);
	}

}
