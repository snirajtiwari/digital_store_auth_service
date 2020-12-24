package org.digitalstore.oauth.server.dto;

import org.digitalstore.oauth.server.ERole;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "users")
public class UserDTO
{

	private String	employeeId;
	private String	userName;
	private String	firstName;
	private String	lastName;
	private String	password;
	private String	roleId		= ERole.User.name();
	private String	roleName	= ERole.User.name();
	private long	userId;
	private Integer	invalidLoginCount;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Integer getInvalidLoginCount() {
		return invalidLoginCount;
	}

	public void setInvalidLoginCount(Integer invalidLoginCount) {
		this.invalidLoginCount = invalidLoginCount;
	}
	
	

}
