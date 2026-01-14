package chapter14.ArrayList;

public class UserInfo {
	private String id;
	private int pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		String str = id + "\n" + pw;
		return str;
	}
}
