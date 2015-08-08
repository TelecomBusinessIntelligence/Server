package org.tbi.server.entity;

public class UserInfor extends Infor{
	private String id;
	
	private String name;
	
	private String status;
	
	private String passWord;
	
	private String role;
	
	public UserInfor(){
		
	}

	public UserInfor(final String id){
		this.id=id;		
	}
	
	public UserInfor(final String name, final String passWord, final String role){
		this.name=name;
		this.passWord=passWord;
		this.role=role;
	}
	
	public UserInfor(final User userDomain) {
        id = userDomain.getId();
        name = userDomain.getName();
        passWord = userDomain.getPassWord();
        role = userDomain.getRole();
        status = userDomain.getStatus();
    }

    public UserInfor(final String errorInfo, final Integer statusCode) {
        super(errorInfo, statusCode);
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
