package com.collection.map.student;

public class Student {
	
	private int sno;
	private String sname;
	private int kor,eng,math,sum;
	private double avg;
	
	public Student() {
		
	}
	public Student(int sno, String sname, int kor, int eng, int math) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", sum=" + sum + ", avg=" + avg + "]";
	}
	
	
}
