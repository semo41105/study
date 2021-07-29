package com.io.part03_addStream.ch01_byteTochar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class TestStream {
	public void output() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// system.out은 표준입출력장치. 콘솔창
		// 문자를 outputstreamwriter가 바이트로 변환했기 때문에 출력이 잘 된다.
		try {
			bw.write("java oracle JDBC");
//			bw.flush();
			// 버퍼의 data를 밀어내기 위해 사용.
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				// 잘 닫아준다면 flush를 사용하지 않고도 값이 잘 넘어온다. close의 중요성을 알 수 있음.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("문자열 입력: ");
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
