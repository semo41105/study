package com.io.part02_charStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TestCharStream {
	
	public void fileSave() {
//		FileWriter fw = null;
		//Ʈ���̹� �ȿ� ���� ���������� �Ǿ�����Ƿ� �ٱ����� ������ �����ϴ� ����.
		
		try (FileWriter fw = new FileWriter("sample2.txt");){//try with resource: �ڵ����� close������ �ܺο��� ��� �Ұ�
			fw.write("�츮���� ���Ѹ���");
			fw.write('A');
			fw.write('B');
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	*/
}
	
	public void fileOpen() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("sample2.txt");
			//���϶����ʹ� ������ ���������� ������ ã�� ������ ������ ���ܹ߻�. �׷��� Ʈ����ĳġ�� ����ִ� ��.
			int val;
			while( (val=fr.read()) != -1) {
				System.out.println((char)val);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
