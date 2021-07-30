package com.collection.silsub1.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.collection.silsub1.model.dto.Board;

public class BoardDao {
	private ArrayList<Board> list = new ArrayList<Board>();
	
	public BoardDao() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("board_list.txt"));
			
			list.addAll((ArrayList<Board>)ois.readObject());
		
		} catch (FileNotFoundException e) {
	System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	public int getLastBoardNo() {
		return list.get(list.size()-1).getBoardNo();
	}
	
	//1. 게시글 쓰기
	public void writeBoard(Board board) {
		list.add(board);
		System.out.println(list);
	}
	//2. 게시글 전체 보기
	public ArrayList<Board> displayAllList(){
		return list;
	}
	//3. 게시글 보기
	public Board displayBoard(int no) {
		Board board = null;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				board = list.get(i);
			}
		}
		return board;
	}
	//3.1 조회수 올리기
	public void upReadCount(int no)
	{
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				list.get(i).setReadCount(list.get(i).getReadCount() +1);
				break;
			}
		}
	}
	//4. 제목 수정
	public void modifyTitle(int no, String title) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				list.get(i).setBoardTitle(title);
				break;
			}
		}
	}
	//5. 내용 수정
	public void modifyContent(int no, String content) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				list.get(i).setBoardContent(content);
				break;
			}
		}
	}
	//6. 게시글 삭제
	public void deleteBoard(int no) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				list.remove(i);
				break;
			}
		}
	}
	//7. 게시글 검색
	public ArrayList<Board> searchBoard(String title){
		ArrayList<Board> searchList = new ArrayList<Board>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getBoardTitle().contains(title)) {
				searchList.add(list.get(i));
				
				list.get(i).setReadCount(list.get(i).getReadCount()+1);
			}
		}
		return searchList;
	}
	//8. 파일에 저장하기
	public void saveListFile() {
			try {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("board_list.txt"));
		
				//리스트로 저장(for문을 이용해 Board객체를 따로 저장 가능)
				oos.writeObject(list);
				System.out.println("board_list.txt에 정상적으로 저장되었습니다.");
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
