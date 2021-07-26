package com.poly.test05;

public class Samsung_Tv implements Tv{
	private int vol;
	public Samsung_Tv() {
		System.out.println("삼성티비가 켜집니다.");
	}
	
	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	@Override
	public int volUp() {
		System.out.println("볼륨을 높입니다.");
		setVol(getVol()+3);
		return getVol();
	}

	@Override
	public int volDown() {
		System.out.println("볼륨을 낮춥니다.");
		setVol(getVol()-3);
		return getVol();
	}
	
	public void tvClosed() {
		System.out.println("삼성티비가 꺼졌습니다.");
	}
}
