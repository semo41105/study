package com.collection.part01.arrayListSort;

import java.util.Comparator;

public class ScoreScoreAsc implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//������ �⺻ ����(��������)
		int other1 = ((Score)o1).getScore();
		int other2 = ((Score)o2).getScore();
		
		
		System.out.println();
		
		Integer ot = other1;
		Integer ot2 = other2;
		
		ot.compareTo(ot2);
		
		if(other1>other2) {
			return 1;
			//1 -> �ٲ۴�.
			//return -1; -> �״�� �д�.(������ ũ��)
			
		}else if (other1<other2) {
			return -1;
		}else {
			return 0;
		}
	}
}
