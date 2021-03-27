package ncs.test1;

public class ArrayTest {

	public static void main(String[] args) {

		int[][] array = {{12, 41, 36, 56, 21}, {82, 10, 12, 61, 45}, {14, 16, 18, 78, 65}, {45, 26, 72, 23,34}};
		int sum = 0;
		double avg = 0;
		int size = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
			size = array.length * array[i].length;
		}
		System.out.printf("%.2f%n",sum * 1.0);
		avg = (sum * 1.0) / size;
		System.out.println(avg);
	}

}
