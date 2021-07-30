package com.collection.part01.arrayListSort;

import java.util.Comparator;

public class ScoreScoreDesc implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			//점수로 기본 정렬(내림차순)
			int other1 = ((Score)o1).getScore();
			int other2 = ((Score)o2).getScore();

			if(other1>other2) {
				return 1;
				//1 -> 바꾼다.
				//return -1; -> 그대로 둔다.(왼쪽이 크면)	
			}else if (other1<other2) {
				return -1;
			}else {
				return 0;
			}
	}
}
