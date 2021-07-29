package com.io.part03_addStream.ch01_byteTochar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class TestStream {
	public void output() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// system.out�� ǥ���������ġ. �ܼ�â
		// ���ڸ� outputstreamwriter�� ����Ʈ�� ��ȯ�߱� ������ ����� �� �ȴ�.
		try {
			bw.write("java oracle JDBC");
//			bw.flush();
			// ������ data�� �о�� ���� ���.
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				// �� �ݾ��شٸ� flush�� ������� �ʰ� ���� �� �Ѿ�´�. close�� �߿伺�� �� �� ����.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("���ڿ� �Է�: ");
			String val = br.readLine();
			System.out.println("val: " + val);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
