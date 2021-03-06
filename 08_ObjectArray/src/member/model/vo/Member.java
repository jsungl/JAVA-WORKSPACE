package member.model.vo;

public class Member {

	/*
	 * protected로 지정하면 자식 클래스에서 직접 접근가능하다
	 * private - default - protected - public
	 * 
	 * Member의 자식클래스 silver,gold,vip,vvip에서 직접접근가능하다
	 * 
	 * 커스텀클래스를 상속하는 경우(Member - silver,gold..)에는 protected 지정가능하지만, 
	 * jdk가 제공하는 어떤 캡슐화된 클래스를 상속한다면 protected로 변경할 수 없다
	 * -> super생성자를 통해 값세팅 & getter,setter 이용
	 * 
	 */
	
	
//	private String name;
//	private String grade;
//	private int point;
	protected String name;
	protected String grade;
	protected int point;
	
	public Member() {
		
	}
	
	public Member(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	public double getEjaPoint() {
		return point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
}
