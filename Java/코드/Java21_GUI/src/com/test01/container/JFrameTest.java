package com.test01.container;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest extends JFrame{
	//프레임을 생성하는 방법1
	//javax.swing.JFreame 클래스 상속 후 생성자에 프레임 관련 설정
	//상속 후에 객체 생성
	
	public JFrameTest() {
		//프레임 크기 설정
//		this.setLocation(300,200);
//		this.setSize(800,500);
	
		//위치와 크기를 한번에 지정
		this.setBounds(300,200,800,500);
		
		//프레임이 보여지도록 해당 메소드 실행
		this.setVisible(true);
		
		//닫기 버튼 눌렀을 때 프로세스 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임 상단에 이름 설정하기
		this.setTitle("MyFrame");
		
		//프레임 상단에 이미지 설정하기
		try {
			this.setIconImage(ImageIO.read(new File("images/hobbangman.jpeg")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//프레임 사이즈 변경 비활성화
		this.setResizable(false);

	}
}
