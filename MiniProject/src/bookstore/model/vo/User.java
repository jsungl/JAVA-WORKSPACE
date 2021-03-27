package bookstore.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable{

	private String name;
	private String id;
	private String pwd;
	private List<Book> user_bList = new ArrayList<>(); // 유저 북리스트
	private int point; // 유저 포인트

	public User() {
	}

	// 유저 생성시 리스트는 아무것도 가지고 있지 않은 상태
	public User(String name, String id, String pwd, int point) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.point = point;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getPwd() {
		return pwd;
	}

	public final void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public final List<Book> getUser_bList() {
		return user_bList;
	}

	public final void setUser_bList(List<Book> user_bList) {
		this.user_bList = user_bList;
	}

	public final int getPoint() {
		return point;
	}

	public final void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return " [" + name + "] [" + id + "] [" + pwd + "] [" + user_bList + "] ["
				+ point + "]";
	}

	// 고정부분 : id, pwd, name
	// 변동부분 : point, user_bList
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
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
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		return true;
	}
	
	
}
