package com.ch05_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Run {

	public static void main(String[] args) {
		//Date(java.util), Calendar(java.util), GregorianCalendar(java.util)
		
		Date originTime = new Date(0);
		originTime = new Date(0L);
		String oriTime =originTime.toGMTString();
		
		System.out.println(originTime);
		
		Date today = new Date();
		System.out.println(today);
		
		//���ϴ� �������� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(today));
		
		System.out.println("----------Ķ����-----------");
		Calendar calendar = Calendar.getInstance(); //���� �ð�
		System.out.println(calendar);//month�� 0���� �����̶� 1�� ������� ��.
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);

		
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		
		System.out.println(year + "�� "+ month + "�� " + date + "�� ");
		System.out.println(hour + "�� "+ min + "�� "+ sec + "��");
		System.out.println(calendar.getTime());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf1.format(calendar.getTime()));
		
		//add
		Calendar cal = (Calendar)calendar.clone();
		cal.add(Calendar.YEAR, -9);
		cal.add(Calendar.MONTH, -3);
		System.out.println(cal.getTime());
		
		//set
		cal.set(2019, 10,9);
		System.out.println(cal.getTime());
		
		//�׷�����
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
	}
}
