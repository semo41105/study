package com.poly.test05;

public class Samsung_Tv implements Tv{
	private int vol;
	public Samsung_Tv() {
		System.out.println("�ＺƼ�� �����ϴ�.");
	}
	
	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	@Override
	public int volUp() {
		System.out.println("������ ���Դϴ�.");
		setVol(getVol()+3);
		return getVol();
	}

	@Override
	public int volDown() {
		System.out.println("������ ����ϴ�.");
		setVol(getVol()-3);
		return getVol();
	}
	
	public void tvClosed() {
		System.out.println("�ＺƼ�� �������ϴ�.");
	}
}
