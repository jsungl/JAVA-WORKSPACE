package member.model.vo;

//entity 클래스

public class Silver extends Member{
	
	public Silver() {
		
	}
	
	public Silver(String name, String grade, int point) {
		//super(name,grade,point);
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	@Override
	public double getEjaPoint() {
		return super.getEjaPoint() * 0.02;
	}
}
