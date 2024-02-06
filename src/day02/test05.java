package day02;

import java.util.Scanner;

public class test05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double weight1,weight2,result,all;
	
	System.out.println("첫 번째 물건의 무게를 입력 하시오");
	weight1 = input.nextDouble();
	System.out.println("두 번째 물건의 무게를 입력 하시오");
	weight2 = input.nextDouble();
	all = 600;
	result = all-weight1-weight2;
	System.out.println("현재 엘리베이터에 허용 무게는"+ result +"kg 입니다");
	
}
}
