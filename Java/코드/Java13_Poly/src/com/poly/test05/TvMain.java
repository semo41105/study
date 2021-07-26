package com.poly.test05;

public class TvMain {
	
	public static void main(String[] args) {
	
		Samsung_Tv st = new Samsung_Tv();
		Lg_Tv lt = new Lg_Tv();
		
		st.volUp();
		lt.volUp();
		System.out.println(lt.volUp());
	}
}
