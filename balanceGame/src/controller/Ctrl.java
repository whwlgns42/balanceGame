package controller;

import model.UserComment.UserCommentDAO;
import model.content.ContentAnswerDAO;
import model.question.QuestionDAO;
import model.user.UserDAO;
import model.user.UserDTO;

public class Ctrl {
//시작
	private ContentAnswerDAO answerDAO;
	private QuestionDAO questionDAO;
	private UserCommentDAO commentDAO;
	private UserDAO userDAO;
	private UserDTO loginINFO;
	
	public Ctrl(){
		answerDAO=new ContentAnswerDAO();
		questionDAO=new QuestionDAO();
		commentDAO=new UserCommentDAO();
		userDAO=new UserDAO();
		loginINFO=null;
	}
	public void start() {
		while(true) {
			
//			프로그램 실행
//			-회원가입
//			-로그인
//			   -내가 풀었던 결과 출력
//			   -문제만들기
//			   -회원탈퇴
//
//			-문제풀기
//			   -문제 다 풀고 내가푼 문제들에 대한 결과보기[로그인] 
//			-지문 출력
//			     -모든 지문 출력
//			     -내가 풀었던 지문 출력 [로그인]
//
//			   -관리자
//			      -유저관리
//			         -회원조회
//			         -회원 강퇴
//			      -지문관리
//			         -조회
//			         -수정
//			         -삭제
//			         -생성
//			      -문제승인
			
			
			
			
			
		}
	}
	
}
