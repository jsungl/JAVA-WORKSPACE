package kh.java.array.sort;


/**
 *
 * 배열정렬
 * [3,4,1,2,5] -> [1,2,3,4,5] 오름차순 / [5,4,3,2,1] 내림차순
 * 
 * -순차정렬
 * -선택정렬
 * -버블정렬
 * -삽입정렬
 * -퀵정렬
 * -합병정렬
 * -팀정렬
 *
 */
public class SortingTest {

	public static void main(String[] args) {
		SortingTest s = new SortingTest();
		//s.test1();
		//s.test2();
		//s.test3();
		s.test4();
	}

	/*
	 * 자리바꿈
	 */
	public void test1() {
		int a = 10;
		int b = 4;
		
		int c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	/*
	 * 배열에서 값교환
	 */
	public void test2() {
		int[] arr = {2,1,3};
		swap(arr,0,1);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]); //123
		}
	}
	
	/*
	 * 순차정렬
	 * 회차(바깥반복문의 한턴)에 해당하는 인덱스에 알맞은 수를 찾는 방법
	 * 한 회차가 끝나면 해당인덱스는 정렬 완료
	 */
	public void test3() {
		int[] arr = {4,3,0,2,1};
		
		//i : 0 1 2 3
		for(int i = 0; i < arr.length - 1;i++) {
			
			//j : 0-1234 1-234 2-34 3-4
			for(int j = i + 1; j < arr.length; j++) {
				//큰수가 좌측에 위치한 경우
				if(arr[i] > arr[j])
					swap(arr,i,j);
				print(arr,i);
			}
		}
	}
	
	
	/*
	 * 선택정렬
	 * 회차마다 최소값을 찾아서 마지막에 한번만 swap한다
	 * 
	 */
	public void test4() {
		int[] arr = {4,3,0,2,1};
		
		for(int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min] > arr[j])
					min = j; //해당 인덱스의 번호를 min에 저장
				
			}
			swap(arr,min,i);
		}
		print(arr,5);
		
		
	}
	
	
	
	public void swap(int[] arr, int i, int j) {
		int tmp;
		tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	public void print(int[] arr,int nth) {
		System.out.printf("%d : %d %d %d %d %d%n",nth,arr[0],arr[1],arr[2],arr[3],arr[4]);
	}
}
