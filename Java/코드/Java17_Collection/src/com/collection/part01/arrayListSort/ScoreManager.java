package com.collection.part01.arrayListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoreManager {
	public void scoreSort() {
		List list = new ArrayList();
		
		list.add(new Score("이유나", 99));
		list.add(new Score("이유진", 75));
		list.add(new Score("이유찬", 88));
		
		list.add(new Score("김성민", 61));
		list.add(new Score("조현진", 77));
		list.add(new Score("제예솔", 32));
		
		System.out.println("list: "+list);
		
		//Comparable과 Comparator
		
		//1.Comparable : Score에 상속
		Collections.sort(list);
		System.out.println("list: "+list);
		
		//2.Comparator : Class를 생성 후 Comparator를 상속
		Collections.sort(list,new ScoreScoreAsc());
		System.out.println("list: "+list);
	}
}
