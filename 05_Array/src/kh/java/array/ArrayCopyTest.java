package kh.java.array;

/**
 * 배열복사
 * 
 * 1. 얉은 복사 shallow copy
 *  - 배열변수(주소값)의 복사
 *  - call stack에서 복사 , 같은 heap공간 공유
 * 2. 깊은 복사 deep copy
 *  - 배열객체의 값복사
 *  - heap공간에서 복사, 값은 똑같고 새로운 배열 주소값을 만든다  
 *  - 두개의 배열은 각각의 주소값을 가리킨다
 */



public class ArrayCopyTest {

	public static void main(String[] args) {

		ArrayCopyTest act = new ArrayCopyTest();
		//act.test1();
		//act.test2();
		//act.test3();
		act.test4();
		
	}
	
	
	
	
	
	/*
	 * 얉은 복사 : 주소값만 복사, 같은 배열을 공유
	 */
	public void test1() {
		int[] arr1 = {1,2,3};
		int[] arr2 = arr1; //arr1을 대입
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%d --- %d%n",arr1[i],arr2[i]);
		}
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode()); //같은 hashcode값을 가지므로 같은 객체값을 가진다
		
		System.out.println(arr1 == arr2);//배열 주소값 비교
		
		//얉은 복사의 활용
		printArr(arr1); //printArr메소드에 주소값이 전달된다
		
	}
	
	public void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	
	/*
	 * 깊은 복사 : 반복문을 통해 직접 값 복사하기
	 */
	public void test2() {
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%d----%d%n",arr1[i],arr2[i]);
		}
		// 가리키는 배열이 서로 다르다
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		//배열 주소값도 서로 다르다
		System.out.println(arr1);
		System.out.println(arr2);
	}
	
	/*
	 * 깊은 복사2 : 
	 * System.arraycopy(원본배열,시작인덱스,도착지배열,시작인덱스,복사할 길이)
	 */
	public void test3() {
		char[] arr1 = {'a','b','c','d','e'};
		char[] arr2 = new char[arr1.length];
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.arraycopy(arr1, 0, arr2, 3, 2);
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%c --- %c%n",arr1[i],arr2[i]);
		}
	}
	
	
	/*
	 * 깊은 복사3
	 * clone()
	 */
	public void test4() {
		double[] arr1 = new double[] {0.123,0.741,0.324};
		double[] arr2 = arr1.clone();
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%f --- %.3f%n",arr1[i],arr2[i]);
		}
	}

}
