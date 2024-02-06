package day02;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c,d;
		double e;
		String n;
		System.out.println("학생 이름 :");
		n = input.next();
		System.out.println();
		

		System.out.println("국어 점수 : ");
		a = input.nextInt();
		System.out.println();
		System.out.println("영어 점수 : ");
		b = input.nextInt();
		System.out.println();
		System.out.println("수학 점수 : ");
		c = input.nextInt();
		
		System.out.println("========학생 정보========");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("-----------------------");
		d = a+b+c;
		e = (double)d/3;
		System.out.println(n+"\t"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+e);
		
	}

}
