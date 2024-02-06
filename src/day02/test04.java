package day02;

import java.util.Scanner;

public class test04 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int year,age,born;

	System.out.print("올해의 년도를 4자리로 입력하세요 ");
	year = input.nextInt();
	System.out.print("당신이 태어난 년도를 4자리로 입력하세요 ");
	
	born = input.nextInt();
	age =  year-born+1;
	System.out.println("당신의 나이는" +age + "입니다");
	
}
}
