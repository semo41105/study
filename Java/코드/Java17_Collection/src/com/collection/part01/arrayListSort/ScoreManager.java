package com.collection.part01.arrayListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoreManager {
	public void scoreSort() {
		List list = new ArrayList();
		
		list.add(new Score("������", 99));
		list.add(new Score("������", 75));
		list.add(new Score("������", 88));
		
		list.add(new Score("�輺��", 61));
		list.add(new Score("������", 77));
		list.add(new Score("������", 32));
		
		System.out.println("list: "+list);
		
		//Comparable�� Comparator
		
		//1.Comparable : Score�� ���
		Collections.sort(list);
		System.out.println("list: "+list);
		
		//2.Comparator : Class�� ���� �� Comparator�� ���
		Collections.sort(list,new ScoreScoreAsc());
		System.out.println("list: "+list);
	}
}
