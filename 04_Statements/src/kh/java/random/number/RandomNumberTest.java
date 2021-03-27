package kh.java.random.number;


import java.util.Random;
import java.util.Scanner;


public class RandomNumberTest {

	public static void main(String[] args) {

		RandomNumberTest r = new RandomNumberTest();
		//r.test1();
		//r.test2();
		//r.test3();
		r.test4();
		
	}
	
	/*
	 * java.util.Random
	 */
	public void test1() {
		Random rnd = new Random();
		int num = rnd.nextInt(); //������ �����ϳ��� ���(int ����)
		
		//����� ��,���۰�(�ּҰ�)
		int num2 = rnd.nextInt(10); //0~9���� ������ ����
		//int num2 = rnd.nextInt(10) + 1; //1~10���� ������ ������ �������� +1�� �Ѵ�

		//101 ~ 200�� ����
		int num3 = rnd.nextInt(100) + 101;
		//0.0(����) ~ 1.0(������)�� ����
		double dnum = rnd.nextDouble();
		//true �Ǵ� false �� �������� ���
		boolean bool = rnd.nextBoolean();
		
		
		System.out.println(num2);
		
		
	}
	
	
	/*
	 * Math.random()
	 * 
	 * 0.0(����) ~ 1.0(������) �Ǽ��� ����
	 * 
	 */
	public void test2() {
		double num = Math.random();
		System.out.println(num);
		
		//������ ����
		//Math.random() * ����� �� + �ּڰ�
		int i = (int)(num * 10) + 1; //1~10������ ������ ����
		System.out.println(i);
		
	}
	
	/*
	 * ��������
	 */
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��/�ڸ� �Է�(1.�� 2.��) > ");
		int user = sc.nextInt();
		
		int coin = (int)(Math.random() * 2) + 1;
//		Random rnd2 = new Random();
//		int coin = rnd2.nextInt(2) + 1;
//		int coin = rnd2.nextBoolean() ? 1 : 2;
		
		String result = user == coin ? "����" : "����";
		System.out.println(result);
		System.out.println("user = " + user + " , coin = " + coin);
	}
	
	
	/*
	 * �ø� ceiling : double
	 * ���� floor : double
	 * �ݿø� round : long
	 */
	public void test4() {
		//1.�ø�, �Ҽ��� ù°�ڸ����� �ø�
		double num = 1.3;
		double result = Math.ceil(num);
		System.out.println("result = " + result);
		
		//2.����, �Ҽ��� ù°�ڸ����� ����
		result = Math.floor(num);
		System.out.println("result = " + result);
		
		//�ε��Ҽ��� ���
		//�ø��ؼ� �Ҽ��� ù��° �ڸ����� ǥ�� : 1.3
		//1.23 * 10 => 12.3���� �ø� => 13.0 => 13.0/10 => 1.3
		num = 1.23;
		result = Math.ceil(num * 10) / 10;
		System.out.println(result);
		
		//3.�ݿø�, �Ҽ��� ù°�ڸ����� �ݿø�
		double n = 3.75;
		long res = Math.round(n);
		System.out.println(res);
		
		//�ݿø� ��� 3.8, �Ҽ����� �̵����Ѽ� �ݿø��� �ٽ� �Ҽ��� �̵�
		long res2 = Math.round(n * 10); 
		System.out.println((double)res2 / 10);
		
	}

}
