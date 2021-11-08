package mx.springboot.demo.model;

import java.io.Serializable;

public class User implements Serializable  {
	
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String userName;

	public User(String name, String userName) {
		super();
		this.name = name;
		this.userName = userName;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
