package workshop4;

public class Test02 {

	public static void main(String[] args) {

		int[] arr3 = new int[5];
		int sum = 0;
		
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = (int)(Math.random()*10) + 1;
		}
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
			sum += arr3[i];
		}
		System.out.println();
		System.out.println(sum);
		System.out.println((double)sum / arr3.length);
	}

}
