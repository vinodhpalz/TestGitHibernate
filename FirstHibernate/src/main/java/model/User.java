package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="UserDetails")
public class User {
	@Column(name="EmailId")
	private String exampleEmail;
	@Column(name="Password")
	private String examplePass;
	public User() {
		
	}
	public User(String exampleEmail, String examplePass) {
		this.exampleEmail = exampleEmail;
		this.examplePass = examplePass;
	}
	public String getExampleEmail() {
		return exampleEmail;
	}
	public void setExampleEmail(String exampleEmail) {
		this.exampleEmail = exampleEmail;
	}
	public String getExamplePass() {
		return examplePass;
	}
	public void setExamplePass(String examplePass) {
		this.examplePass = examplePass;
	}
	
}
