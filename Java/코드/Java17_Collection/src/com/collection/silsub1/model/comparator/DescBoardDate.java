package com.collection.silsub1.model.comparator;

import java.util.Comparator;

import com.collection.silsub1.model.dto.Board;

public class DescBoardDate implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {
		return -o1.getBoardDate().compareTo(o2.getBoardDate());
		//빼주는 걸 o2, o1 반대로 순서를 바꿔도 된다.
	}
}
