DROP SEQUENCE MDBOARDSEQ;
DROP TABLE MDBOARD;

CREATE SEQUENCE MDBOARDSEQ NOCACHE;

CREATE TABLE MDBOARD(
	SEQ NUMBER PRIMARY KEY,
	WRITER VARCHAR2(500) NOT NULL,
	TITLE VARCHAR2(1000) NOT NULL,
	CONTENT VARCHAR2(2000) NOT NULL,
	REGDATE DATE NOT NULL
);

INSERT INTO MDBOARD
VALUES(MDBOARDSEQ.NEXTVAL, '관리자','테스트 중','TEST1234ABCD',SYSDATE);

SELECT * FROM MDBOARD;

COMMIT;