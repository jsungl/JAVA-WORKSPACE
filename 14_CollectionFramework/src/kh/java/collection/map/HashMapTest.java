package kh.java.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import kh.java.collection.set.Person;

/**
 * key,value 한쌍으로 요소를 구성한다
 * key를 통해서 value를 접근해 사용
 * key는 중복을 허용하지 않는다.(set) value는 중복되어도 상관없다(list)
 *
 * 동일한 key로 추가 저장하면 나중 value로 치환된다
 * 
 */
public class HashMapTest {

	public static void main(String[] args) {

		HashMapTest h = new HashMapTest();
		h.test1();
		//h.test2();
	}
	
	
	public void test1() {
		//<key,value> 두개의 generic 사용
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		//key로 Integer만 허용
		//value로 String만 허용
		
		Map<Character,Person> map2 = new HashMap<>(); 
//		Collection<Integer, Character> map3 = new HashMap<>(); //Collection타입으로 제어 불가
		
		map1.put(1, "홍길동");
		map1.put(2, "신사임당");
		map1.put(3, "세종");
		
		String s1 = map1.get(1); //요소가져오기(값 가져오기)
		System.out.println(s1);
		
		//동일한 키값으로 요소추가
		map1.put(2, "장영실"); //나중 value로 치환
		
		System.out.println(map1);
	
		//map2에 요소추가
		map2.put('a', new Person("aida"));
		map2.put('b', new Person("bob"));
		map2.put('c', new Person("celai"));
		map2.put('d', new Person("doid"));
		System.out.println(map2);
		
		//Person클래스에 equals & hashCode 오버라이딩을 전제
		//특정키가 존재하는가?
		System.out.println(map2.containsKey('b')); //char -> new Character('b')
		//특정 value가 존재하는가?
		System.out.println(map2.containsValue(new Person("doid")));
		
		Person p1 = map2.get('b');
		System.out.println(p1 + ", " + p1.hashCode());
		map2.put('b', new Person("bill"));
		Person p2 = map2.get('b');
		System.out.println(p2 + ", " + p2.hashCode());

	}

	
	
	/*
	 * 전체요소 열람하기
	 * 1.key값을 set에 담기
	 * 2.key,value 한쌍을 set에 담기
	 */
	public void test2() {
		
		Map<String,Person> map = new HashMap<>();
		map.put("hoggd", new Person("홍길동"));
		map.put("sinsa", new Person("신사"));
		map.put("sejong", new Person("세종"));
		map.put("youngsil", new Person("장영실"));
		
		//1. keySet : key집합
		Set<String> keySet = map.keySet();
		//keySet + iterator
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Person value = map.get(key);
			System.out.printf("key = %s, value = %s%n",key,value);
		}
		//keySet + forEach
		for(String key : keySet) {
			Person value = map.get(key);
			System.out.printf("key = %s, value = %s%n",key,value);
		}
		
		System.out.println("----------------------------------------");
		
		//2. EntrySet : key,value 한쌍
		Set<Entry<String,Person>> entrySet = map.entrySet();
		//entrySet + forEach
		for(Entry<String,Person> entry : entrySet) {
			String key = entry.getKey();
			Person value = entry.getValue();
			System.out.printf("key = %s, value = %s%n",key,value);
		}
		
		//entrySet + iterator
		Iterator<Entry<String,Person>> iter2 = entrySet.iterator();
		while(iter2.hasNext()) {
			Entry<String,Person> entry = iter2.next();
			String key = entry.getKey();
			Person value = entry.getValue();
			System.out.printf("key = %s, value = %s%n",key,value);
		}
		
	}
}
