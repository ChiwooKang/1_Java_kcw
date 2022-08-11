package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
     
	public void practice1() {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.print(" 1이상의 숫자를 입력하세요 : ");
    	 int input = sc.nextInt();
    	 
    	 if(input < 1 ) {
      		System.out.print(" 1이상의 숫자를 입력해주세요 ");
      		} else {
      			
    	       for(int i = 1 ; i <= input ; i++) {
    		 System.out.print(i);
    	 		}	
      		}	   		
    }
   			
    		
     public void practice2() {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print(" 1이상의 숫자를 입력하세요 : ");
    	 int input = sc.nextInt();
    	 if(input < 1 ) {
       		System.out.print(" 1이상의 숫자를 입력해주세요 ");
    	 } else {
    		 for(int i = input ; i >= 1 ; i--) {
    			 System.out.print(i);
    		 }
    	 }	 
     }
     
     public void practice3() {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.print(" 정수를 하나 입력하세요 : ");
    	 
    	 int num = sc.nextInt();
    	 
    	 
    	 int sum = 0;
    	 for(int i = 1  ; i <= num ; i++) {
    		 
    		 System.out.print(i);
    		 
    		 if(i < num) {
    			 System.out.print(" + ");
    		 }
    		 
    		 sum += i;
    	 }
    	 
    	 System.out.print(" = "+ sum);
    	 
     }
     public void practice4() {
    	 
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.print(" 첫 번째 숫자 : ");
    	 int num1 = sc.nextInt();
    	 
    	 System.out.print(" 두 번째 숫자 : ");
    	 int num2 = sc.nextInt();
    	 
//    	 if( num1 < 1 || num2 < 1 ) { // num1, num2 중에 1미만이 있는가?
//    	      System.out.println(" 1 이상의 숫자를 입력해주세요. ");
//    	 } else {
//    		 for(int i = num1 ; i<=num2 ; i ++) {
//    			 System.out.print( i + " ");
//    			 
//    		 }
//    	 } else {
//    		 for( int i=num2 ; i<=num1)
//    	 }
//    	 
    	 
    	 
    	 /* Scanner sc = new Scanner(System.in);
    	 
    	 System.out.print(" 첫 번째 숫자 : ");
    	 int num1 = sc.nextInt();
    	 System.out.print(" 두 번째 숫자 : ");
    	 int num2 = sc.nextInt();
    	
    	 if (num1 < 1 || num2 <1) {
 		    System.out.println(" 1 이상의 숫자를 입력해주세요 ");
    	 }
    	 
 		 if(num1 > num2)   {
 			 int tmp;
 			 tmp = num1;
 			 num1 = num2;
 			 num2= tmp;
 		 }
 		    
 		    
    	 for(int i = num1 ; i <= num2 ; i++) 
    		 System.out.print(i + " ");
    		 
    */ }
     
     
    
     
     
     public void practice5() {
     
    	 
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print(" 숫자  : ");
    	 int dan = sc.nextInt();
    	 
    	 System.out.println("============= " +  dan + "단 " + "===============");
    	 
    	 for(int i = 1; i <=9; i++) {
 			System.out.printf("%d X %d = %d \n" , dan, i, dan * i);			
 	         }
     }
    	
     
     
     
     
     
     
     public void practice6() {
    
//    	 Scanner sc = new Scanner(System.in);
//    	
//    	 System.out.print(" 숫자  : ");
//    	 int dan = sc.nextInt();
//    	 
//    	 
//    	 
//    	if(dan < 2 || dan > 9) {
//    		 System.out.println("2~9 사이 숫자만 입력해주세요");  
//    	 } else {
//    		 System.out.println("============= " +  dan + "단 " + "===============");
//    		 for(int i = 1; i <=9; i++) {
//    			 System.out.printf("%d X %d = %d \n" , dan, i, dan * i);
//    		}
//    	 }
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print(" 숫자  : ");
    	 int num = sc.nextInt();
    	 
    	 if (num >=2 && num <=9) {
    	   for(int dan = num; dan <= 9 ; dan++) {
    		  
    		   System.out.println("============= " +  dan + "단 " + "===============");
    		   
    		   for(int i =1 ; i<=9; i++) {
    			   System.out.printf("%d X %d = %2d \n" , dan , i , dan*i);
    		   }
    		    System.out.println(); // 단 사이 줄바꿈
    	   }
    	 }else {
    		 System.out.println("2~9 사이 숫자만 입력해주세요");
    	 }
     
     
     
     
     }
     public void practice7() {}
     public void practice8() {}
     public void practice9() {
    	 
//    	 다음과 같은 실행 예제를 구현하세요.
//    	 ex.
//    	 정수 입력 : 4
//    	     *
//    	    **
//    	   ***
//    	  ****
    	 
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print(" 정수 입력  : ");
    	 int input = sc.nextInt();
    	 
    	 for(int row = 1; row <=input ; row++) {
    		
    		 for(int i = input-1 ; i >= 1; i--) {
    			
    			System.out.print(" ");
    		}
    		 
    		 
    		 for (int col = 1 ; col <= row ; col++) {
    			 System.out.print("*");
    		 }
    		 System.out.println(); // 줄바꿈
    	 }
    	 
    	 
    	 
    	 
     }
     public void practice10() {}
     public void practice11() {}
     public void practice12() {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.print("정수 입력 : ");
    	 int input = sc.nextInt();
    	 
    	 for(int row = 1; row <=input ; row++) {
    		for(int col = 1 ; col <= input; col++) {
    			// 첫 번째 / 마지막 줄, 칸일때만 * 출력
    			if(row ==1 || row == input || col ==1 ||col ==input) {
    				System.out.print("*");
    			}else {
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	 }
    	 

     }
     public void practice13() {
      Scanner sc = new Scanner(System.in);
    	 
    	 System.out.print("자연수를 하나를 입력하세요 : ");
    	 int input = sc.nextInt();
         
    	 int count = 0;
    	 
    	 
    	 for(int i = 1 ; i <= input ; i ++) {
    		 
    		 //2의 배수 또는 3의 배수인 경우 출력
    		 if( i%2 == 0 || i%3 ==0) {
    			 System.out.println(i + " ");
    			 
    			
    	     //2와 3의 공배수 == 2로도 나누어 떨어지고, 3으로 나누어 떨어진다
    			 if( i%2 == 0 || i%3 ==0) {
    				 
    				 // count 증가
    				 count++; //count 증가
    			 }
    		 }
    	 }
    	 System.out.println("\ncount : " + count);
     
     }
     }
     
   
