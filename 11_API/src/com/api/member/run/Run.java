package com.api.member.run;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import com.api.member.model.vo.member.Member;

public class Run {

	public static void main(String[] args) {

		Member[] m = new Member[3];		
		String data = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
		int idx2 = 0;
		String[] s = new String[15];
		StringTokenizer tokenizer = new StringTokenizer(data,"|");
		while(tokenizer.hasMoreTokens()) { 
			String str = tokenizer.nextToken();
			StringTokenizer tokenizer2 = new StringTokenizer(str,",");
			int idx1 = 0;
			while(tokenizer2.hasMoreTokens()) {
				s[idx1++] = tokenizer2.nextToken();
			}
			
			int memberNo = Integer.parseInt(s[0]);
			String memberName = s[1];
			int height = Integer.parseInt(s[2]);
			int weight = Integer.parseInt(s[3]);
			Calendar birth = Calendar.getInstance();
			int n1 = Integer.parseInt(s[4].substring(0, 4));
			int n2 = Integer.parseInt(s[4].substring(4, 6));
			int n3 = Integer.parseInt(s[4].substring(6));
			birth.set(n1, n2, n3);
			
			Member member = new Member(memberNo,memberName,height,weight,birth);
			m[idx2++] = member;
			
		}	
		
		
		for(int i = 0; i < idx2; i++) {
			System.out.println(m[i].information());
		}
		
	/*
	 * 강사님코드
		//1. | 기준으로 분리
		StringTokenizer token = new StringTokenizer(str,"|");
		//3. Member배열 선언
		Member[] memberArr = new Member[token.countTokens()];
		int i = 0;	//index변수
		while(token.hasMoreTokens()){
			//2. , 기준으로 분리
			String memberStr =  token.nextToken();
			String[] mStr = memberStr.split(",");
			//2.1 분리한데이터를 Member에 담기
			Member m = new Member();
			//2.1.1 String타입은 그냥 대입
			//2.1.2 int타입은 Integer.parseInt로 형변환
			//2.1.3 Calendar타입은 19900905를 parsing해서 년월일 정보 얻은후 Calendar에 대입
			m.setMemberNo(Integer.parseInt(mStr[0]));
			m.setMemberName(mStr[1]);
			m.setHeight(Integer.parseInt(mStr[2]));
			m.setWeight(Integer.parseInt(mStr[3]));
			int yyyy = Integer.parseInt(mStr[4].substring(0,4));
			int mm = Integer.parseInt(mStr[4].substring(4,6));
			int dd = Integer.parseInt(mStr[4].substring(6));
			m.setBirth(new GregorianCalendar(yyyy,mm-1,dd));
			//3.1 Member배열에 추가
			memberArr[i++] = m;
		}	
		//3.2 Member정보 열람
		for(Member m : memberArr) {
			System.out.println(m.infromation());
		}
	*/
	}
}