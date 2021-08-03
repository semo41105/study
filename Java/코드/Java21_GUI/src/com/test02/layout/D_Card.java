package com.test02.layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_Card extends JFrame{
	public D_Card() {
		super("CardLayout");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,200,800,500);
		
		//CardLayout
		CardLayout card = new CardLayout();
		this.setLayout(card);
		
		//Panel
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		//panel 배경색 지정
		card1.setBackground(Color.DARK_GRAY);
		card2.setBackground(Color.MAGENTA);
		card3.setBackground(new Color(50,100,50));
		
		//라벨 추가
		card1.add(new JLabel("Card1"));
		card2.add(new JLabel("Card2"));
		card3.add(new JLabel("Card3"));
		
		//메인프레임에 패널 추가
		this.add(card1);
		this.add(card2);
		this.add(card3);
		
		//패널에 이벤트 추가
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
				if(e.getButton() == 1) {
					card.next(card1.getParent());
					//card2로 넘어간다.
					
				}
				
			}
		});
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
				if(e.getButton() == 1) {
					card.next(card2.getParent());
					//card3로 넘어간다.
					
				}	
			}

		});
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
				if(e.getButton() == 1) {
					card.next(card3.getParent());
					//넘어간다.
					
				}		
			}
		});
	}
}
