package com.hibernate.Demohibernate;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hibernate.Demohibernate.AlienName;
import com.hibernate.stud.Laptop;

@Entity
@Table(name="alien_table")
public class Alien 
{
	@Id
	private int aid;
	
	//@Transient
	private AlienName aname;
	
	//@Column(name="alien_color")
	private String color;
	
	@OneToMany(mappedBy="alien", fetch=FetchType.EAGER)
	private Collection<Laptop> laps = new ArrayList<Laptop>();
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
