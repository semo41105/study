package com.test03.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class B_TextFieldTest {
	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		mf.setSize(300,130);
		mf.setTitle("제곱 계산하기");
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//기본적인 세팅들
		
		//패널 생성
		JPanel panel = new JPanel();
		
		//라벨 추가
		panel.add(new JLabel("숫자 입력: "));
		
		//텍스트필드 추가
		JTextField text = new JTextField(15);
		panel.add(text);
		
		//결과 영역(라벨) 추가
		panel.add(new JLabel("제곱한 값: "));
		
		JTextField result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		//버튼 생성
		JButton btn = new JButton("ok");
		
		//이벤트 연결
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭시 텍스트상자의 값을 가져와 계산 후 result에 처리
				try {
					int value = Integer.parseInt(text.getText());
					result.setText(value*value+"");//스트링을 붙여서 결과값 인트를 스트링으로 바꿔준다.
				} catch (NumberFormatException e1) {
					System.out.println("숫자만 입력해주세요~~");
				}
				//text필드로 포커스 가져가기
				text.requestFocus();

			}

		});
		
		//패널에 버튼 부착
		panel.add(btn);
		
		//프레임에 패널 부착
		mf.add(panel);	
	}
}
