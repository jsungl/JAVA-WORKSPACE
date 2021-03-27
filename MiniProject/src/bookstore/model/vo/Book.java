package bookstore.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Book implements Serializable {

	private String title;	// 책 이름
	private String author;	// 책 저자
	private int point;		// 책 가격
	private String state; 	// 책 상태
	private int count;		// 책 개수
	
	public Book() {
	}
	
	public Book(String title, String author, int point, String state, int count) {
		this.title = title;
		this.author = author;
		this.point = point;
		this.state = state;
		this.count = count;
	}
	
	public final String getTitle() {
		return title;
	}


	public final void setTitle(String title) {
		this.title = title;
	}


	public final String getAuthor() {
		return author;
	}


	public final void setAuthor(String author) {
		this.author = author;
	}


	public final int getPoint() {
		return point;
	}


	public final void setPoint(int point) {
		this.point = point;
	}


	public final String getState() {
		return state;
	}


	public final void setState(String state) {
		this.state = state;
	}


	public final int getCount() {
		return count;
	}


	public final void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return title + " (" + author + ") " + point + "P " + state + " "
				+ count + "개";
	}
	
	// 고정부분 : title, author, point, state
	// 변동부분 : count
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + point;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (point != other.point)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}
