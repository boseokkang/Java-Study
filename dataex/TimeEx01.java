package dataex;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

// ������ �ڹ� 1.7 ���� ��Ű�� 
// java.sql.Date  
// java.sql.Time (X)
// java.sql.Timestamp
// java.util.Calendar (X)
// java.util.Date

// �Ź��� �ڹ� 1.8 �̻�
// java.time.LocalDate
// java.time.LocalDateTime
// java.time.LocalTime

public class TimeEx01 {

	public static void main(String[] args) {
		// 1. ���� �� ���� Calendar
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // MM �� mm �� ����
		String today = formater.format(cal.getTime());
		System.out.println("cal.getTime() : " + cal.getTime());
		System.out.println("today : " + today);

		// 2. ���� �� ���� java.util.Date
		// 1970.01.01 �������� �ؼ� ����� �и��ʸ� ���
		Date time2 = new Date();
		System.out.println("time2 : " + time2);
		System.out.println("time2.getTime() : " + time2.getTime());
//		System.out.println("time2.getDay() : " + time2.getDay()); �� ��!
		String today2 = formater.format(time2);
		System.out.println("today2 : " + today2);

		// 3. ���� �� ���� java.sql.Date
		java.sql.Date time3 = new java.sql.Date(24 * 3600 * 1000);
		System.out.println("time3 : " + time3);

		// 4. java.sql.TimeStamp
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // MM �� mm �� ����
		Date d = new Date();
		String timestamp = sf.format(d.getTime());
		Timestamp ts = Timestamp.valueOf(timestamp);
		System.out.println("ts : " + ts);

		// 5. LocalDateTime (LocalDateTime to Timestamp)
		Timestamp nowDate = Timestamp.valueOf(LocalDateTime.now());
		System.out.println("nowDate : " + nowDate);
		
		// 6. LocalDateTime (Timestamp to LocalDateTime)
		LocalDateTime ldt = nowDate.toLocalDateTime();
		System.out.println("ldt : " + ldt);

		System.out.println("LocalDateTime : " + LocalDateTime.now()); // ��¥ �ð� �� ����
		System.out.println("LocalDate : " + LocalDate.now()); // ��¥��
		System.out.println("LocalTime : " + LocalTime.now()); // �ð���

	}

}
