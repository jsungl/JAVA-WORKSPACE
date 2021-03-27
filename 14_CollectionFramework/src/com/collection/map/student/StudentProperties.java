package com.collection.map.student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class StudentProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentProperties sp = new StudentProperties();		
		//System.out.println(sp.readFile());
		//sp.printConsole(sp.readFile());
		sp.saveXMLFile(sp.readFile());
	}
	
	public List<Student> readFile(){
		Properties  prop = new Properties();
		try {
			prop.load(new FileReader("score.txt")); //prop에 적재
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Student> list = new ArrayList<>();
		Enumeration<?> en = prop.propertyNames(); //?는 모든타입처리 , name(key)모음
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();
			String value = prop.getProperty(key);
			
			String[] arr = value.split(",");
			list.add(new Student(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),
					Integer.parseInt(arr[3]),Integer.parseInt(arr[4])));
		}
		
		return list;
		
	}
	
	public void printConsole(List<Student> stdtList){
		System.out.println(stdtList);
		Iterator<Student> iter = stdtList.iterator();
		int sum_kor = 0;
		int sum_eng = 0;
		int sum_math = 0;
		double avg_kor = 0;
		double avg_eng = 0;
		double avg_math = 0;
		while(iter.hasNext()) {
			Student s = iter.next();
			sum_kor += s.getKor();
			sum_eng += s.getEng();
			sum_math += s.getMath();
		}
		avg_kor = Math.round((sum_kor / stdtList.size()) * 10) / 10.0;
		avg_eng = Math.round((sum_eng / stdtList.size()) * 10) / 10.0;
		avg_math = Math.round((sum_math / stdtList.size()) * 10) / 10.0;
		System.out.println(avg_kor);
		System.out.println(avg_eng);
		System.out.println(avg_math);
	}

	public void saveXMLFile(List<Student> stdtList){
		Properties  prop = new Properties();
		Iterator<Student> iter = stdtList.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			//System.out.println(s.toString());
			prop.setProperty(Integer.toString(s.getSno()), s.toString());
		}
		
		
		try {
			prop.storeToXML(new FileOutputStream("student.xml"), "student.xml"); //.xml
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
