package member.model.vo;

//entity 클래스

public class VVip extends Member{
	
	public VVip() {
		
	}
	
	public VVip(String name, String grade, int point) {
		//super(name,grade,point);
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	@Override
	public double getEjaPoint() {
		return super.getEjaPoint() * 0.15;
	}
}
