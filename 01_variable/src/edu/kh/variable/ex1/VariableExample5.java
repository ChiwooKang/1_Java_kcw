package edu.kh.variable.ex1;

public class VariableExample5 {

	public static void main(String[] args) {
		
		 // ctrl +alt + 방향키 위 or 아래
		
		
		
		
		
		/* 출력 메서드
		 * 
		 * System.out.print("내용")
		 * -> () 안의 내용 출력 (줄바꿈 X)
		 * 
		 * System.out.println("내용")
		 * -> () 안의 내용 출력 (줄바꿈 O)
		 * System.out.printf("내용 + 패턴", 패턴에 들어갈 값)
		 * 
		 */ 
	
		
	    System.out.print("aaaaa");
	    System.out.print("bbbbb");
	    System.out.println("ccccc");
	    System.out.println("ddddd");
	    
	    
	    String name = "강치우";
	    int age = 32;
	    char gender = '남';
	    double height = 185.3;
	    boolean tf = true;
	    
	    // 강치우님은 32세 남성, 키는 185.5cm입니다 (true)
	    System.out.println( name + "님은 " + age + "세 " + gender + "성, 키는"
	    		            + height + "cm 입니다 (" + tf + ")");
	    
	    System.out.printf( "%s님은 %d세 %c성, 키는 %.1fcm 입니다 (%b)\n" , name , age, gender , height , tf);
	    // \n : 줄바꿈(개행)을 나타내는 탈출(escape) 문자
	    
	    
	    System.out.println("내가 추가한 내용");
	    // 주석 새로운 코드
	    int aaa = 10;
	
	}
	
	
}
