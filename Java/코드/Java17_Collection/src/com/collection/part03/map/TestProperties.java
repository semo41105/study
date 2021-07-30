package com.collection.part03.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	public void test() {
		Properties prop = new Properties();

		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		// ������ String���� �����ؾ� ��.
		prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
		prop.setProperty("user", "KH");
		prop.setProperty("password", "KH");

		System.out.println(prop);

		try {
			prop.store(new FileOutputStream("driver.properties"), "jdbc driver");
			prop.store(new FileWriter("driver.txt"), "jdbc driver");
			prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void test2() {
		// ���Ϸκ��� �о�ͼ� Properties�� ���
		Properties prop = new Properties();

		try {
//			prop.load(new FileInputStream("driver.properties"));
			prop.loadFromXML(new FileInputStream("driver.xml"));

			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("password"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
