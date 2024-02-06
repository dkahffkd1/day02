package day02;

import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n1,n2;
	
	String result1, result2, result3;
	
		System.out.print("수 입력" );
		n1 = input.nextInt();
		result1 = (n1%2==0)? "짝수":"홀수";
		System.out.println(n1 + " = " + result1);
		result2 = (n1%3==3)? "3의 배수":"3의 배수가 아니다";
		System.out.println(n1 + " = " + result2);
	
		System.out.print("두 수 입력");
		n1 = input.nextInt();
		n2 = input.nextInt();
		System.out.println("num1" +" : " + n1 + "," + "num2" + " : " + n2);	
		result3 = (n1>n2)? "n1가n2보다 크다":"n2가 n1보다 크다";
		System.out.println(result3);
		
		
		
	
}
}
