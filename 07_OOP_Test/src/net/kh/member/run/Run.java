package net.kh.member.run;

import net.kh.member.model.Member;

public class Run {
	
	/*
	 * 의존관계
	 * Run --------> Member
	 * 사용클래스 -------> 피사용클래스
	 * 
	 */

	public static void main(String[] args) {

		Member m = new Member();
		m.setMemberId("ssss");
		m.setMemberPwd("1234");
		m.setMemberName("홍길동");
		m.setAge(20);
		m.setGender('남');
		m.setEmail("ssss@naver.com");
		m.setPhone("01045671234");
		m.setMarried(false);
		
		System.out.println("memberId : " + m.getMemberId());
		System.out.println("memberPwd : " + m.getMemberPwd());
		System.out.println("memberName : " + m.getMemberName());
		System.out.println("age : " + m.getAge());
		System.out.println("gender : " + m.getGender());
		System.out.println("email : " + m.getEmail());
		System.out.println("phone : " + m.getPhone());
		System.out.println("married : " + m.isMarried());

/*
		String memberInfo = "아이디 : " + m.getMemberId() + "\n"
						  + "이름 : " + m.getMemberName() + "\n"
						  + "비밀번호 : " + m.getMemberPwd() + "\n"
						  + "나이 : " + m.getAge() + "\n"
						  + "성별 : " + m.getGender() + "\n"
						  + "이메일 : " + m.getEmail() + "\n"
						  + "전화번호 : " + m.getPhone() + "\n"
						  + "결혼여부 : " + m.isMarried() + "\n";
				
		System.out.println(memberInfo);
*/
	}

}
