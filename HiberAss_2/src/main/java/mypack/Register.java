package mypack;
import jakarta.persistence.*;

@Entity

public class Register {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id",nullable=false)
  private int id;
  private String name,address,emailId,login,password;
public int getId() {
	return id;
}
//public void setId(int id) {
//	this.id = id;
//}
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
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Register [id=" + id + ", name=" + name + ", address=" + address + ", emailId=" + emailId + ", login="
			+ login + ", password=" + password + "]";
}
  
}
