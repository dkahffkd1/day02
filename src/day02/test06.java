package day02;

import java.util.Scanner;

public class test06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double wei, hei, fat, pig;
		
		System.out.println("키를 입력하세요");
		hei = input.nextDouble();
		wei = (hei-100)*0.9;
		System.out.println("표준 체중은"+wei+"입니다");
		
		System.out.println("키를 입력하세요");
		hei	= input.nextDouble();
		System.out.println("현재 체중을 입력하세요");
		fat = input.nextDouble();
		pig = (fat/wei)*100;
		System.out.println("표준 체중은"+ wei +"이고 비만도는"+ pig+"입니다");
		
	}
}
