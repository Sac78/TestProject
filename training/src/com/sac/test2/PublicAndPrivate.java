package com.sac.test2;

public class PublicAndPrivate {
	
	private int id;
	private String name;
	public int id1;
	public String name1;
	
	

	@Override
	public String toString() {
		return "PublicAndPrivate [id=" + id + ", name=" + name + ", id1=" + id1 + ", name1=" + name1 + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId1() {
		return id1;
	}



	public void setId1(int id1) {
		this.id1 = id1;
	}



	public String getName1() {
		return name1;
	}



	public void setName1(String name1) {
		this.name1 = name1;
	}



	public PublicAndPrivate(int id, String name, int id1, String name1) {
		super();
		this.id = id;
		this.name = name;
		this.id1 = id1;
		this.name1 = name1;
	}



	public PublicAndPrivate() {
		super();
		// TODO Auto-generated constructor stub
	}



	

}
