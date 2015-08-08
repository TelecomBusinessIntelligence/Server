/**
 * @author Danyang Li
 */

package org.tbi.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tbi.server.entity.ErrorCode;
import org.tbi.server.entity.User;
import org.tbi.server.entity.UserInfor;
import org.tbi.server.service.UserService;

@RestController
@RequestMapping("/users")
public class DbController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/signin")
	public UserInfor getUser(@RequestParam("name")String name, @RequestParam("passWord")String passWord){
		try{
			final User user = userService.getUser(name.trim());
			final UserInfor result = new UserInfor(user);
			if(result.getPassWord().equals(passWord)){
				return result;
			}
		}catch(Exception e){
			 return new UserInfor("Not found this user, please try again.", ErrorCode.PERSIST_ERROR);
		}
		return null;
	}
	
	
	
	@RequestMapping("/addition")
	public void addUser(){
		User user = new User();
		user.setName("Danyang");
		user.setPassWord("123");
		userService.addUser(user);
	}
	
	@RequestMapping("/deletion")
	public void deletedUser(){
		String name = "Hello World!";
		userService.deleteUser(name);
	}
	
	@RequestMapping("/modification")
	public void modifyUser(){
		User user = new User();
		user.setStatus("Modified");
		userService.modifyUser(user);		
	}
	
	@RequestMapping("/query")
	public List<User> queryUser(){
		String name = "Hello World!";
		return userService.queryUser(name);
	}

}
