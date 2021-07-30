package com.collection.part01.arrayListSort;

public class Score implements Comparable{
	private String name;
	private int score;
	public Score() {
		super();
	}
	public Score(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Object o) {
		//name���� �⺻ ����
		
		String otherName = ((Score)o).getName();
		
		return name.compareTo(otherName);
//		System.out.println(i.compareTo(i2)); // (������ i2�� ū ��, ����� i�� ū ��, 0�� ���� ��)
	
	
	/*
	 * 
	 *		 A	   B
	 * 		   	>
	 * 			���(1)
	 * 			=
	 * 			0�� ���� ��
	 * 			<
	 * 			����(-1)
	 */
	}
}
