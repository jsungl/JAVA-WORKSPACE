package kh.java.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListTest a = new ArrayListTest();
		//a.test0();
		//a.test1();
		//a.test2();
		//a.test3();
		//a.test4();
		a.test5();
		//a.test6();
		//a.test7();
	}
	
	//배열의 문제점
	public void test0() {
		
		Student[] arr = new Student[3];
		arr[0] = new Student(1,"홍길동");
		arr[1] = new Student(2,"신사임당");
		arr[2] = new Student(3,"세종대왕");
		
		//1. 학생 2명 추가
		Student[] arr2 = new Student[10]; //새로 배열선언해야한다 -> 남는공간 발생(메모리공간 낭비 초래)
		System.arraycopy(arr, 0, arr2, 0, arr.length); 
		arr2[3] = new Student(4,"장영실");
		arr2[4] = new Student(5,"이황");
		
		//2. 중간의 학생1명 삭제
		//데이터는 중간의 빈자리없이 관리해야한다
//		arr2[2] = null;
		//빈자리 채우기
		arr2[2] = arr2[3];
		arr2[3] = arr2[4];
		arr2[4] = null;
		
		//3. 중간에 학생1명 추가 : new Student(6,"뺑덕어멈");
		arr2[4] = arr2[3];
		arr2[3] = arr2[2];
		arr2[2] = arr2[1];
		arr2[1] = arr2[0];
		arr2[0] = new Student(6,"뺑덕어멈");
		
		
		System.out.println(Arrays.toString(arr2));
	}
	
	
	/*
	 * java.util.List 인터페이스
	 * java.util.ArrayList 구현클래스
	 */
	public void test1() {
		//3개 다 가능
		ArrayList list1 = new ArrayList();
		//transient Object[] elementData;
		List list2 = new ArrayList();
		Collection list3 = new ArrayList();
		
		//맨 마지막에 요소추가 : add
		list1.add("안녕");
		list1.add(123);
		list1.add(123.456);
		list1.add(true);
		list1.add(new Date());
		list1.add(new Student(1,"주몽"));
		list1.add(123);
		
		System.out.println(list1); //toString() override되어 있음. 저장된 순서유지,중복허용
		
		//저장된 요소의 개수
		System.out.println(list1.size());
		
		//삭제 remove
		list1.remove(3); //해당 인덱스 요소삭제후 뒤에 인덱스 요소들이 앞당겨져옴
		
		//중간에 요소추가
		list1.add(3, false); //해당인덱스 요소 추가후 인덱스 요소들이 뒤로 밀림
		
		//반복문을 통해 요소에 접근가능
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(i + " : " + list1.get(i)); //인덱스를 통해 요소를 가져옴
		}
	}
	
	
	
	/*
	 * Generics 타입제한
	 * 
	 * <E> : generic class ,타입변수
	 * 
	 * 기본형을 사용할수없다
	 * int -> Integer
	 * double -> Double
	 */
	public void test2() {
		List list1 = new ArrayList();
		//List<Object> list1 = new ArrayList<Object>();와 같다
		list1.add("안녕");
		list1.add(123);
		Object e1 = list1.get(0); //자식객체를 담을수있다 , return : Object타입
		System.out.println(((String)e1).length()); //형변환 필수
		
		//다형성 적용
		//Generics 적용
		//<String> 타입변수 지정 : 요소의 타입제한
		List<String> list2 = new ArrayList<String>();
		list2.add("안녕");
//		list2.add(123); //String이 아닌 요소는 추가할수없다 -> compile오류를 낸다
		String s1 = list2.get(0); //return : String타입
		System.out.println(s1.length()); //형변환 필요없음
		
		//Wrapper Class
//		List<int> list3 = new ArrayList<int>(); //사용불가
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(31); //31 -> new Integer(31) : auto-boxing
		int num = list3.get(0); //new Integer(31) -> 31 : auto-unboxing
		
	}
	
	//test0을 ArrayList 사용버전으로 변경하기
	public void test3() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"홍길동"));
		list.add(new Student(2,"신사임당"));
		list.add(new Student(3,"세종대왕"));
		System.out.println(list.toString());
		
		//중간에 추가
		list.add(1, new Student(4,"이황"));
		System.out.println(list.toString());
		
		//삭제
		list.remove(0);
		//객체를 전달해 삭제하려면, 전달한 객체와 저장된 객체의 동등성을 인정받아야한다
		//두 객체의 equals비교결과가 true여야한다
		//true가 나오도록 equals 오버라이딩해야한다
//		list.remove(new Student(1,"홍길동")); //삭제하려고 전달한 객체와 저장된 객체는 다르다
		System.out.println(new Student(1,"홍길동").equals(new Student(1,"홍길동")));
		System.out.println(new Student(1,"홍길동").hashCode());
		System.out.println(new Student(1,"홍길동").hashCode());
		System.out.println(list.toString());
	}
	
	
	
	public void test4() {
		List<Integer> list = new ArrayList<Integer>();
		//객체 할당부의 제네링 타입은 생략이 가능(Jdk 1.7이상만 가능)
//		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1, 100); //1번지에 100 요소추가
		
		System.out.println(list);
		
		//삭제메소드
		//1. index로 삭제
//		list.remove(3); //index=3의 요소를 지운다
//		System.out.println(list);
		
		//2.동등객체로 삭제 : 객체가 가진 값이 동일한 객체 (equals가 동일한 객체)
		list.remove(new Integer(3)); //숫자 3을 찾아서 지운다 ,중복값이 존재시 맨처음만난값을 지운다
		System.out.println(list);
		
		//수정 : 해당인덱스의 객체를 제공된 매개인자로 대체
		list.set(1, 888);
		System.out.println(list);
		
		//다른 Collection객체 추가
		List<Integer> another = new ArrayList<>();
		another.add(7);
		another.add(8);
		another.add(9);
		list.addAll(another);
		
		System.out.println(list);
		
		//매개인자 요소를 포함하고있는가(동등객체) : boolean 리턴
		System.out.println(list.contains(9)); //Integer 9
		
		//매개인자 요소가 몇번지에 있는가 : int 리턴(해당하는 요소가 없으면 -1리턴)
		System.out.println(list.indexOf(9));
		
		//열람 : 기존for문, forEach문, iterator방식
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			Integer i = iter.next();
			System.out.println(i);
		}

		//모든요소 삭제
//		list.clear();
//		System.out.println(list);
		
		//리스트가 비어있는가? : 모두비어있다면 true 아니면 false리턴
		System.out.println(list.isEmpty());

	}
	
	
	
	/* 정렬
	 * 1. Comparable 인터페이스 : 기본정렬(한가지) 클래스에서 구현. 
	 * 						  CompareTo메소드 오버라이딩 해야한다
	 * 2. Comparator 인터페이스 : 기본정렬 외에 추가적으로 정렬기준을 제시해야 할때
	 * 						     별도의 Comparator 구현클래스를 작성(개수 제한없음)
	 * 						  compare메소드 오버라이딩 해야한다
	 * 
	 */
	public void test5() {
		
		List<String> list = new ArrayList<>();
		list.add("나나나");
		list.add("허허허");
		list.add("다다다");
		list.add("가가가");
		
		Collections.sort(list); //기본정렬기준(사전등재순:가나다순)에 따라 정렬
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list); //사전등재역순
		
		//사전등재역순
		//별도의 정렬기준객체를 만들어야한다
		Comparator<String> comp = Collections.reverseOrder();
		Collections.sort(list, comp);
		//System.out.println(list);
 	}
	
	
	
	
	/*
	 * 커스텀 클래스 정렬하기
	 * 
	 */
	public void test6() {
		List<Student> list = new ArrayList<>();
		list.add(new Student(4,"이황"));
		list.add(new Student(1,"홍길동"));
		list.add(new Student(5,"장영실"));
		list.add(new Student(2,"신사임당"));
		list.add(new Student(3,"세종대왕"));
		
		//기본정렬 : 학번 오름차순
//		Collections.sort(list); //Student클래스가 Comparable 인터페이스를 구현 및 compareTo메소드 오버라이딩 하지 않으면 오류난다
//		list.sort(null); //위와 같은 코드(기본정렬인경우 null을 전달)
		
		//학번 내림차순
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		//추가적인 정렬기준 생성
		//1.이름(오름차순)
		Comparator<Student> comp = new StudentNameAscending(); //새로운 StudentNameAscending클래스 생성
		Collections.sort(list, comp);

		//2.이름(내림차순)
//		Comparator<Student> comp = new StudentNameAscending().reversed(); //new StudentNameAscending()의 결과를 뒤집는다 
//		Collections.sort(list, comp);
		
		
		
		System.out.println(list);
		
	}
	
	/*
	 * ConcurrentModificationException
	 */
	public void test7() {
		List<Student> list = new ArrayList<>();
		list.add(new Student(4,"이황"));
		list.add(new Student(1,"홍길동"));
		list.add(new Student(5,"장영실"));
		list.add(new Student(2,"신사임당"));
		list.add(new Student(3,"세종대왕"));
		
//		for(Student s : list) {
//			if(s.getNo() == 5)
//				list.remove(s); //반복문안에서 리스트크기가 갑자기 변경된경우 ConcurrentModificationException발생
//			//반복문이후에 작성
//		}
		
		//5번 학생 제거
		
		//1.if문
//		int idx = -1;
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getNo() == 5)
//				idx = i;	
//		}
//		System.out.println(idx); //해당 idx를 알아낸후 삭제
//		if(idx != -1)
//			list.remove(idx);
	
		//2.iterator
		Iterator<Student> iter = list.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			if(s.getNo() == 5) //삭제할 요소가 여러개(5가 여러개)일경우 이 방법이 더 좋다
				iter.remove(); //현재가리키고 있는 collection요소를 제거
		}
		
		
		
		
		
	
	
	}
	
}
