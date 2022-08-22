package edu.kh.oop.field.model.vo;

public class Trainee { // 훈련생

	public String name; //이름
	public String phone; //전화번호
	public String email = "없음";  //이메일
	public int salary = 116000; // 급여(훈련수당)
	public static char classRoom = 'A'; // 강의장
	
	
	//필드 선언 시 바로 값 초기화 : 필드 선언 시 바로 값 초기화
	// ex) public String email = "없음"
	
	// 초기화 블록 : 객체(instance)  객체의 필드를 초기화 하는 블럭
	// - instance block : static 이 없는 필드 값 초기화(생성 시 마다)
	// - static block : static이 있는 필드 값 초기화(프로그램 실행 시 1회)

	
	
	{//instance block
		email = "없음";
		salary = 116000;
		
	}


	static { // static block
		classRoom = 'A';
		
		
	}






}
