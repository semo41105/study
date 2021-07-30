package com.collection.silsub1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.collection.silsub1.model.comparator.AscBoardDate;
import com.collection.silsub1.model.comparator.AscBoardNo;
import com.collection.silsub1.model.comparator.AscBoardTitle;
import com.collection.silsub1.model.comparator.DescBoardDate;
import com.collection.silsub1.model.comparator.DescBoardNo;
import com.collection.silsub1.model.comparator.DescBoardTitle;
import com.collection.silsub1.model.dao.BoardDao;
import com.collection.silsub1.model.dto.Board;

public class BoardManager {

	private BoardDao bd = new BoardDao();
	private Scanner sc = new Scanner(System.in);

	public BoardManager() {
	}

	public void writeBoard() {
		System.out.println("새 게시글 쓰기 입니다.");

		System.out.print("글 제목: ");
		String title = sc.nextLine();
		System.out.println("작성자: ");
		String ss = sc.nextLine();

		// 이름 공백 제거
		String writer = "";
		for (int i = 0; i < ss.length(); i++) {
			if (ss.charAt(i) != ' ') {
				writer += ss.charAt(i);
			}
		}

		Date date = new Date();

		String content = "";
		String str = "";
		System.out.print("글 내용(exit 입력시 종료): ");
		while (true) {
			str = sc.nextLine();

			if (str.contentEquals("exit")) {
				break;
			}
			content += str;
		}

		try {
			bd.writeBoard(new Board(bd.getLastBoardNo() + 1, title, writer, date, content));
		} catch (IndexOutOfBoundsException e) {
			bd.writeBoard(new Board(1, title, writer, date, content));
		}
	}

	public void displayAllLlist() {
		ArrayList<Board> list = bd.displayAllList();

		Iterator<Board> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public void displayBoard() {
		System.out.print("조회할 글 번호: ");
		int no = sc.nextInt();

		Board board = bd.displayBoard(no);

		if (board == null) {
			System.out.println("조회된 글이 없습니다.");
		} else {
			System.out.println(board);

			// 조회수 올리기
			bd.upReadCount(no);
		}
	}

	public void modifyTitle() {
		// 1. 어떤 게시글을 수정할지(boardno)
		// 2. 수정할 제목

		System.out.print("수정할 글 번호: ");
		int no = sc.nextInt();
		sc.hasNextLine();

		Board board = bd.displayBoard(no);
		if (board == null) {
			System.out.println("조회된 글이 없습니다.");
		} else {
			System.out.println(board);

			System.out.print("변경할 제목: ");
			String title = sc.nextLine();
			bd.modifyTitle(no, title);
		}
	}

	public void modifyContent() {
		System.out.println("수정할 글 번호: ");
		int no = sc.nextInt();
		sc.nextLine();

		Board board = bd.displayBoard(no);
		if (board == null) {
			System.out.println("조회된 글이 없습니다.");
		} else {
			System.out.println(board);

			System.out.print("변경할 내용: ");
			String content = sc.nextLine();
			bd.modifyContent(no, content);
		}
	}

	public void deleteBoard() {
		System.out.print("삭제할 글 번호: ");
		int no = sc.nextInt();
		sc.nextLine();

		Board board = bd.displayBoard(no);
		if (board == null) {
			System.out.println("조회된 글이 없습니다.");
		} else {
			System.out.println(board);

			System.out.println("정말로 삭제하시겠습니까?(y/n): ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			if (ch == 'Y') {
				bd.deleteBoard(no);
				System.out.println(no + "번 글이 삭제되었습니다.");
			}
		}
	}

	public void searchBoard() {
		System.out.println("검색할 제목: ");
		String title = sc.nextLine();

		// 검색 결과가 여러개일 수도 있으니 ArrayList로 받기
		ArrayList<Board> searchList = bd.searchBoard(title);

		if (searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
	}

	public void saveListFile() {
		bd.saveListFile();
	}

	public void sortList(int item, Boolean isDesc) {
		// 내림차순이냐? 에 대한 불리언 값임.
		ArrayList<Board> list = bd.displayAllList();

		switch (item) {
		case 1:
			if (isDesc) {
				list.sort(new DescBoardNo());
			} else {
				list.sort(new AscBoardNo());
			}
			break;
		case 2:
			if (isDesc) {
				list.sort(new DescBoardDate());
			}else {
				list.sort(new AscBoardDate());
			}
			break;
		case 3:
			if(isDesc) {
				list.sort(new DescBoardTitle());
			}else {
				list.sort(new AscBoardTitle());
			}
			break;
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
