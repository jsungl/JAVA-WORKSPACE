package kh.java.format;

public class PrintfTest {

	public static void main(String[] args) {
		
		PrintfTest p = new PrintfTest();
		p.test1();
	}
	
	public void test1() {
		
		boolean bool = true;
		char ch = '헐';
		String s = "안녕하세요";
		int i = 100;
		double dnum = 0.12345678;
		
		System.out.printf("%b, %b%n",bool,!bool);
		System.out.printf("%c, %s%n",ch,s);
		System.out.printf("%d, %f%n",i,dnum);
		System.out.printf("%.2f%n",dnum); //소수점이하 2째자리까지 반올림
		System.out.printf("%s, %s, %s, %s, %s%n",bool,ch,s,i,dnum); //%s는 모든 타입에 사용가능(소수점자리수가 다 안나올수있음)
		
		
		//%10s : 10개의 공간(byte)을 확보하고 우측정렬 
		//-%10s : 좌측정렬
		System.out.printf("[%10s][%-10s]%n","abc","abc");
	}
}
