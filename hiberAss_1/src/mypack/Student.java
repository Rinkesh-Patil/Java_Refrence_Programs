package mypack;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rollno",nullable=false)
 private int rollno;
private int age;
 private String name,address;
 public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
public int getRollno() {
	return rollno;
}
//public void setRollno(int rollno) {
//	this.rollno = rollno;
//}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
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
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", age=" + age + ", name=" + name + ", address=" + address + "]";
}
 
	

}
