package com.hibernate.stud;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop
{
	@Id
	private int lid;
	private String lname;
	private int price;
	
	//@ManyToOne
	//public Student student;
	
	@ManyToMany
	private List<Student> student;
	
	public List<Student> getStudent() 
	{
		return student;
	}
	public void setStudent(List<Student> student) 
	{
		this.student = student;
	}
	public int getLid()
	{
		return lid;
	}
	public void setLid(int lid) 
	{
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	
}
