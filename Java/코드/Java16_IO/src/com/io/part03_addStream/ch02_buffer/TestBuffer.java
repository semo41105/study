package com.io.part03_addStream.ch02_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuffer {
	public void input() {
		BufferedReader br = null;	
		
		try {
			//fr = new FileReader("sample2.txt");
			//br = new BufferedReader(fr);
			
			br = new BufferedReader(new FileReader("sample2.txt"));
			// new ������Ʈ��(new ��Ʈ��[����, ��� �ƹ��ų� �� �� ����. �ٸ� ������������ ��� �� ��ȣ new �ʿ�](�ܺ��ڿ�));
			// ������Ʈ�� ��ȣ �ȿ��� �ٸ� ��Ʈ���� ����. ��ݽ�Ʈ�� ��ȣ �ȿ��� �ܺ��ڿ��� ����.
			
			String tmp;
			while((tmp=br.readLine()) != null) {
				//�� �̻� �о�� ���� ���� ���� null�� ��.
				//read�� ����Ʈ�� ���� ������ �ϳ��ϳ� �о�Դٴ� �Ϳ� ���̰� ����.
				//�� ������.
				System.out.println(tmp);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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

	public void output() {
		//bufferedWriter�� �̿��Ͽ� ��Ʈ���� ������ ��
		//"�ȳ��ϼ���"
		//"�ݰ����ϴ�"
		//��� sample2.txt�� ����غ���.
	/*	BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("sample2.txt"));
			String tmp;
			String tmp1 = "�ȳ��ϼ���";
			String tmp2 = "�ݰ����ϴ�";
			bw.write(tmp1);
			bw.write("\n"+tmp2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	*/	
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("sample2.txt"));) {
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
