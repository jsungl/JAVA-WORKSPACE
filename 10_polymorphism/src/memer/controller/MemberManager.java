package memer.controller;

import member.model.vo.Member;
import member.model.vo.Silver;
import member.model.vo.Gold;
import member.model.vo.Vip;
import member.model.vo.VVip;

public class MemberManager {

	public static final int MAX = 40;
	private Member[] member = new Member[MAX];
	private int idx = 0;
	
	public void insertMember(Member m) {
		member[idx++] = m;
	}
	
	public void printData() {
		String menu = "---------------------------<<회원정보>>---------------------------\n"
				 + "이름              등급              포인트             이자포인트\n"
				 + "-----------------------------------------------------------------\n";
		System.out.println(menu);
		
		for(int i = 0; i < idx; i++) {
			System.out.printf("%s       %s     %d     %.2f%n",member[i].getName(),
					member[i].getGrade(), member[i].getPoint(),member[i].getEjaPoint());
		}
	}
}
