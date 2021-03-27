package test.controller;

public class Test3 {

	public static void main(String[] args) {

		double sum = 0;
		double avg = 0;
		int i = 1;
		while(i <= 100) {
			sum += i;
			i++;
		}
		avg = sum / 100;
		System.out.println(sum);
		System.out.println(avg);
	}

}
