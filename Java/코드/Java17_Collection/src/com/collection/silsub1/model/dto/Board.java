package com.collection.silsub1.model.dto;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable{

	private static final long serialVersionUID = -4650640732228173465L;
	
	private int boardNo;
	private String boardTitle;
	private String boardWriter;
	private Date boardDate;
	private String boardContent;
	private int readCount;
	public Board() {}
	public Board(int boardNo, String boardTitle, String boardWriter, Date boardDate, String boardContent) {
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
		this.boardContent = boardContent;
		//readCount는 필요가 없음.
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	@Override
	public String toString() {
		return "boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardWriter=" + boardWriter
				+ ", boardDate=" + boardDate + ", boardContent=" + boardContent + ", readCount=" + readCount;
	}
}
