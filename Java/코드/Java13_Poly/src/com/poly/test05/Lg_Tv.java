package com.poly.test05;

public class Lg_Tv implements Tv {
	private int vol;
	
	public Lg_Tv() {
		System.out.println("����Ƽ�� �����ϴ�.");
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
		setVol(getVol()+1);
		return getVol();
	}
	@Override
	public int volDown() {
		System.out.println("������ ����ϴ�.");
		setVol(getVol()-1);
		return getVol();
	}
	
	public void tvClosed() {
		System.out.println("����Ƽ�� �������ϴ�.");
	}
}
