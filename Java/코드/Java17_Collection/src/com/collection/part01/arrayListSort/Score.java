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
		//name으로 기본 정렬
		
		String otherName = ((Score)o).getName();
		
		return name.compareTo(otherName);
//		System.out.println(i.compareTo(i2)); // (음수면 i2가 큰 것, 양수면 i가 큰 것, 0은 같을 때)
	
	
	/*
	 * 
	 *		 A	   B
	 * 		   	>
	 * 			양수(1)
	 * 			=
	 * 			0은 같을 때
	 * 			<
	 * 			음수(-1)
	 */
	}
}
