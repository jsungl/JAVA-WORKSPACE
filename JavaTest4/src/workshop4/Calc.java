package workshop4;

public class Calc {

	public int caculate(int data) {
		int sum = 0;
		System.out.print("짝수 : ");
		for(int i = 1; i < data; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		return sum;
	}
}
