/**
 *@author Danyang 
 */

package org.tbi.server.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {
	@Id
	private String id;
	
	private String name;
	
	private String status;
	
	private String passWord;
	
	private String role;
	
	public User(){
		
	}

	public User(final String id){
		this.id=id;		
	}
	
	public User(final String name, final String passWord, final String role){
		this.name=name;
		this.passWord=passWord;
		this.role=role;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

}
