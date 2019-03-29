package cn.ssm.domain;

public class User {
	
	private int id;
	private int sex;
	private String name;
	private String address;
	private String passWord;
	
	
	
	public User() {
		super();
	}
	public User(int id, int sex, String name, String address, String passWord) {
		super();
		this.id = id;
		this.sex = sex;
		this.name = name;
		this.address = address;
		this.passWord = passWord;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
