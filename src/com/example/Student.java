package com.example;

public class Student {
	
	private int id;
	private String name;
	private String lastname;
	private int age;
	private String gender;
	private String branch;
	private int passoutYear;
	private String address;
	private int rank;
	
	public Student(int id, String name, String lastname, int age, String gender, String branch, int passoutYear,
			String address, int rank) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.branch = branch;
		this.passoutYear = passoutYear;
		this.address = address;
		this.rank = rank;
	

}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getPassoutYear() {
		return passoutYear;
	}
	public void setPassoutYear(int passoutYear) {
		this.passoutYear = passoutYear;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", lastname=" + lastname + ", age=" + age + ", gender=" + gender
				+ ", branch=" + branch + ", passoutYear=" + passoutYear + ", address=" + address + ", rank=" + rank
				+ "]";
	}
	
}
