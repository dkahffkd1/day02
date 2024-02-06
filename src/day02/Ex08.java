package day02; //연산

public class Ex08 {
	public static void main(String[] args) {
		int n1 = 9, n2= 2;
		System.out.println(n1/n2);
		System.out.println(n1/(double)n2);
		// 나눈 값이 소수점일 경우 (double) 변수를 사용)
		System.out.println(n1 % n2);
		// % = n1 / n2 나눈 나머지 값
		// ex) 9 / 2 = 4.5 인데 정수로 표현할 시 4로 나오고 나머지 값은 1이 나오는 결과
		
		System.out.println("=====복합대입 연산자=====");
		n1 = n2= 5;
		n1 += 1; // n1 = n1 + 1 ( 5 + 1 = 6)
		System.out.println(n1); 
		n1 -=1; // n1 = n1 - 1  ( 6 - 1 = 5)
		System.out.println(n1);
		n1 *=n2; // n1 = n1(5) * n2(5) =25
		System.out.println(n1);
		n1 /= n2; // n1 = n1 / n2  (25 / 5 = 5)
		System.out.println(n1);
		n1 %= n2; // n1 = n1 % n2  (5/5 = 0(나머지 값))
		System.out.println(n1);
		
		System.out.println("======관계 연산자======");
		n1 = 5;
		n2 = 2;
		System.out.println(n1>n2);
		System.out.println(n1<=n2);
		System.out.println(n1 ==n2);
		System.out.println(n1 !=n2);
		
		boolean bool ;
		bool = n1 > n2;
		System.out.println(bool);
		bool = n1 < n2;
		System.out.println(bool);
		
		System.out.println("=======논리 연산자=======");
		int n3 = 10;
		n1 = 5; n2= 7;
		System.out.println(n1>n2 &&n1 > n3);
		System.out.println(n2>n1 &&n2 > n3);
		System.out.println(n3>n2 && n3 > n1);
		
		
		System.out.println("-----or-------");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("-----and------");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("----not-------");
		System.out.println(!false);
		System.out.println(!true);
		System.out.println(!(10>5));
		System.out.println("-----예제-----");
		n1 = 10 ; n2 = 5;
		bool = n1> n2 && n1 %2==0;
		System.out.println(bool);

		System.out.println("===== 증감 연산자 ======");
		// ++a = 값을 1만큼 증가 후 연산 = a+1
		// --a = 값을 1만큼 감소한 후 연산 = a-1
		n1 = 5;
		++n1;
		System.out.println(n1);
		
		n2 = 5;
		n2++;
		System.out.println(n2);
		
		// 부호가 앞쪽과 뒤쪽에 있을때 방식이 조금 달라짐
		
		System.out.println("-------");
		n1 = 10;
		n2 = ++n1;// ++n1(어떠한 연산보다 자기 자신을 먼저 증가 시켜라)
		System.out.println("n1 :  " + n1);
		System.out.println("n2 :  " + n2);
		System.out.println("-------");
		n1 = 10;
		n2 = n1++;// n1 ++ (계산 후 증가)
		System.out.println("n1 :  " + n1);
		System.out.println("n2 :  " + n2);
		
		int a =5, b=6, c=10, d;
		d = ++a * b--; 
		System.out.println(a+","+b+","+d);
		// ++a = 6 , b-- = (모든 연산이 끝난 후 -1) 6 * 6 = 36 D(36) = a(6) * b(5)<- 계산이 끝난 후 1감소 
		d= a++ + ++c - b--; 
		// 6 + 11 - 5 = D(12) , D(12)= a(7) + c(12) - b(4) 
		System.out.println(a+","+b+","+c+","+d); 
		
		
		System.out.println("=====삼항 연산자(조건연산자) ======");// 앞 쪽에 있는 식이 참인지 거짓인지 확인 하는 방법
		n1 = 20;
		n2 = 10;
		String result;
		result = (n1>n2)?"참인경우":"거짓인경우";// result = (n1>n2)?"참인경우":"거짓인경우"; = " n1>n2보다 크다":" n2>n1보다 크다";
		System.out.println(result);
		
				
	}
}
