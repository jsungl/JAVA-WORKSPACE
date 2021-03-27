package kh.java.collection.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * Collection - Set - HashSet(기본)
 * 중복을 허용하지않는다 
 * 저장된 순서를 보장하지않는다(HashSet)
 * 저장된 순서유지(LinkedHashSet)
 * 오름차순 정렬 지원(TreeSet)
 *
 */

public class HashSetTest {

	public static void main(String[] args) {

		HashSetTest h = new HashSetTest();
		//h.test1();
		//h.test2();
		h.test3();
		//h.test4();
		//h.test5();
	}
	
	public void test1() {
		//다형성적용
		HashSet<Integer> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		Collection<Double> set3 = new HashSet<>();
		
		set2.add("안녕");
//		set2.add(123); //generic 덕분에 다른 타입의 요소는 추가가 불가능하다
		set2.add("hello world");
		set2.add("ㅋㅋㅋ");
		set2.add("ㅋㅋㅋ");

		System.out.println(set2); //순서가 다르게나온다,중복허용x
		
		
		//저장된 요소 개수 확인
		System.out.println(set2.size());
		
		//인덱스 통한 요소가져오기는 지원하지않는다 ->반복문을 통한 전체열람만 가능(일반for문사용불가)
		//1.forEach문
		for(String s : set2) {
			System.out.println(s);
		}
		//2.iterator객체
		Iterator<String> iter = set2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//삭제 : 동등한 객체를 찾아 삭제(equals & hashCode 오버라이딩 필수)
		set2.remove("ㅋㅋㅋ"); 
		System.out.println(set2);
		
		//전제삭제
		set2.clear();
	
		//요소가 비어있는지 검사 : 하나라도 존재하면 false
		System.out.println(set2.isEmpty());
		
	}
	
	
	/*
	 * List -> Set : 중복제거
	 * 
	 * Set -> List : 순서필요(정렬)
	 */
	public void test2() {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(2);
		System.out.println(list);
		
		//set변환
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set); //중복제거
		
		//list변환 
		List<Integer> list2 = new ArrayList<>(set);
		System.out.println(list2); //기본오름차순
		Collections.sort(list2, Collections.reverseOrder()); //내림차순 정렬
		System.out.println(list2);
		
		
	}
	
	/*
	 * 커스텀 클래스 중복처리
	 */
	public void test3() {
		
		Set<Person> set = new HashSet<>();
		set.add(new Person("홍길동"));
		set.add(new Person("신사임당"));
		
		set.add(new Person("홍길동"));
		System.out.println(set); //중복제거를 위해 Person클래스에서 equals & hashCode 오버라이딩 필수
	}
	
	
	
	/*
	 * Linked Hashset : 저장된 순서유지
	 * TreeSet : 오름차순 정렬 지원
	 */
	public void test4() {
		
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(34);
		set1.add(100);
		set1.add(1);
		set1.add(25);
		System.out.println(set1); //저장된 순서유지. 단 인덱스로 접근x
		
		Set<Integer> set2 = new TreeSet<>(set1);
		System.out.println(set2); //오름차순 정렬 지원
	}
	
	/*
	 * 로또 숫자 출력하기
	 * 1~45 사이의 중복없는 난수 6개를 오름차순 정렬해서 출력
	 */
	
	public void test5() {
		
		Set<Integer> set = new HashSet<>();
		set.add(new Random().nextInt(45) + 1);
		set.add(new Random().nextInt(45) + 1);
		set.add(new Random().nextInt(45) + 1);
		set.add(new Random().nextInt(45) + 1);
		set.add(new Random().nextInt(45) + 1);
		set.add(new Random().nextInt(45) + 1);
		
		Set<Integer> set2 = new TreeSet<>(set);
		System.out.println(set2);
	}

}
