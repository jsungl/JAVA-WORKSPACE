package member.controller;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

//control 클래스

public class MemberManager {

	//Silver 등급을 최대 10명, Gold 등급을 최대 10명 관리할수 있는  객체배열 , 인덱스 추가
	private Silver[] s_tmp = new Silver[10];
	private Gold[] g_tmp = new Gold[10];
	private Vip[] v_tmp = new Vip[10];
	private VVip[] vv_tmp = new VVip[10];
	
	private int idx_s = 0;
	private int idx_g = 0;
	private int idx_v = 0;
	private int idx_vv = 0;

	
	
	//silverInsert, goldInsert, printData
	
	public void silverInsert(Silver s) {
		s_tmp[idx_s++] = s;
	}
	
	public void goldInsert(Gold g) {
		g_tmp[idx_g++] = g;
	}
	
	public void vvipInsert(VVip vv) {
		vv_tmp[idx_vv++] = vv;
	}
	
	public void vipInsert(Vip v) {
		v_tmp[idx_v++] = v;
	}
	
	public void printData() {
		
		String m = "---------------------------<<회원정보>>---------------------------\n"
				 + "이름              등급              포인트             이자포인트\n"
				 + "-----------------------------------------------------------------\n";
		System.out.println(m);
		for(int i = 0; i < idx_s; i++) {
			System.out.printf("%s       %s     %d     %.2f%n",s_tmp[i].getName(),
					s_tmp[i].getGrade(), s_tmp[i].getPoint(),s_tmp[i].getEjaPoint());
		}
		for(int i = 0; i < idx_g; i++) {
			System.out.printf("%s       %s       %d     %.2f%n",
					g_tmp[i].getName(),g_tmp[i].getGrade(), g_tmp[i].getPoint(),g_tmp[i].getEjaPoint());
		}
		for(int i = 0; i < idx_v; i++) {
			System.out.printf("%s       %s       %d     %.2f%n",
					v_tmp[i].getName(),v_tmp[i].getGrade(), v_tmp[i].getPoint(),v_tmp[i].getEjaPoint());
		}
		for(int i = 0; i < idx_vv; i++) {
			System.out.printf("%s       %s     %d     %.2f%n",
					vv_tmp[i].getName(),vv_tmp[i].getGrade(),vv_tmp[i].getPoint(),vv_tmp[i].getEjaPoint());
		}
	}
	
	
	
}
