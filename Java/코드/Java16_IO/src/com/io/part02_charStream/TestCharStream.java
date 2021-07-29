package com.io.part02_charStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TestCharStream {
	
	public void fileSave() {
//		FileWriter fw = null;
		//트라이문 안에 쓰면 지역변수가 되어버리므로 바깥으로 빼내서 선언하는 것임.
		
		try (FileWriter fw = new FileWriter("sample2.txt");){//try with resource: 자동으로 close하지만 외부에선 사용 불가
			fw.write("우리나라 대한만국");
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
			//파일라이터는 없으면 생성하지만 리더는 찾는 파일이 없으면 예외발생. 그래서 트라이캐치로 잡아주는 것.
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
