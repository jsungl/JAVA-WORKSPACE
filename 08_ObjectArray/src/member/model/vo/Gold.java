package member.model.vo;

//entity 클래스

public class Gold extends Member{
	
	public Gold() {
		
	}
	
	public Gold(String name, String grade, int point) {
		//super(name,grade,point);
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	

	@Override
	public double getEjaPoint() {
		return super.getEjaPoint() * 0.05;
	}

}
