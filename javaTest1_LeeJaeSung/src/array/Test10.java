package array;

//2차원 배열에 들어있는 데이터들 중 3의 배수만 골라내서 새로운 1차원배열에 기록하고 출력한다. 단 중복 값은 하나만 기록되게 한다.
public class Test10 {

	public static void main(String[] args) {

		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int[] copyAr = new int[array.length * array[0].length];
		int num = 0; //1차배열의 초기 인덱스는 0이다
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				outer:
				if(array[i][j] % 3 == 0) { //3의 배수이면
					
					for(int k = 0; k < copyAr.length; k++) { 
						
						if(copyAr[k] == array[i][j]) { //중복된 값이 1차 배열에 존재하면
							num--; //값대입할 1차배열의 인덱스를 감소시킨다 ---> 해당인덱스에 값대입을 하지않고 다음값을 기다린다
							break outer; //if문을 빠져나온다 ---> num++로 이동,1차배열의 값대입이 일어나지않는다
						}
						
					}
					copyAr[num] = array[i][j]; //중복된값이 없다면 1차배열에 값을 대입한다
				}
				num++; //다음 값대입할 1차 배열의 인덱스를 증가시킨다
				
			}
			
		}
		
		for(int i = 0; i < copyAr.length; i++) {
			if(copyAr[i] != 0)
				System.out.print(copyAr[i] + " ");
		}
		
	}

}
