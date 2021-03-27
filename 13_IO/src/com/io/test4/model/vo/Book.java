package com.io.test4.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable{
	
	private String title;
	private String author;
	private int price;
	private Calendar dates;
	private double discontRate;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int price, Calendar dates, double discontRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discontRate = discontRate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDates() {
		return dates;
	}

	public void setDates(Calendar dates) {
		this.dates = dates;
	}

	public double getDiscontRate() {
		return discontRate;
	}

	public void setDiscontRate(double discontRate) {
		this.discontRate = discontRate;
	}

	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy'년' MM'월' dd'일 출간'");
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", dates=" + sdf.format(dates.getTime())
				+ ", discontRate=" + discontRate + "]";
	}
	
	
	

}
