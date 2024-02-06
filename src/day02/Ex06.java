package day02; //Scanner

import java.util.Scanner;
//import = 특정 기능을 현재로 가져올 때 사용
public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Scanner(자료형) input(변수형)
		//new = 객체를 만들 때 사용
		int num;
		String name;
		System.out.println("이름 입력 : ");
		name = input.next();
		System.out.print("수 입력 : ");
		num = input.nextInt();
		// nextInt -> 정수 입력
	
		System.out.println("이름 : "+name);
		System.out.println("입력 수 : "+num);
	
		double dou;
		System.out.println("실수 입력");
		dou = input. nextDouble();
		System.out.println("실수 :" + dou);
}
}
