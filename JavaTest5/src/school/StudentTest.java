package school;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentArray[] = new Student[3];
		studentArray[0] = new Student("홍길동",15,171,81);
		studentArray[1] = new Student("한사람",13,183,72);
		studentArray[2] = new Student("임걱정",16,175,65);
		
		
		double ageAvg = 0;
		double heightAvg = 0;
		double weightAvg = 0;
		
		System.out.println("이름\t나이\t신장\t몸무게");
		for(int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i].getName() + "\t" + studentArray[i].getAge() + "\t" + studentArray[i].getHeight()
									+ "\t" + studentArray[i].getWeight());
			ageAvg += studentArray[i].getAge();
			heightAvg += studentArray[i].getHeight();
			weightAvg += studentArray[i].getWeight();
		}
		
		System.out.println("나이의 평균 : " + Math.round((ageAvg / studentArray.length) * 100) / 100.0);
		System.out.println("신장의 평균 : " + Math.round((heightAvg / studentArray.length) * 100) / 100.0);
		System.out.println("몸무게의 평균 : " + Math.round((weightAvg / studentArray.length) * 100) / 100.0);
	}

}
