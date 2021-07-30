package com.collection.part02.set;

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
	 *		 A	   B
	 * 		   	>
	 * 			양수(1)
	 * 			=
	 * 			0은 같을 때
	 * 			<
	 * 			음수(-1)

	 * 
	 */
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
}
