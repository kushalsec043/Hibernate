package com.hibernate.stud;



public class App 
{
	// Hibernate GET and Load
	
	//Doesn't hit database everytime PROXY OBJECT Exception thrown
	//Laptop lap = session.load(Laptop.class, 6);
	//print(lap);
	
	//Everytime you query it hits database ACTUAL OBJECT NULL thrown
	//Laptop lap = session.get(Laptop.class, 6);
	//print(lap);

	
	//---------------------------------------------------------
	//Laptop l = new Laptop();
	// l.set, set, set....
	
	// State of object will be affected as state is saved
	// session.save(l);
	//l.setprice(600);
	
	//Will not affect state of object in memory
	//session.detach();
	//l.setprice(900);
	
	//session.remove(l);
	
	//session.getTransaction().commit();
	
	// Create laptop object
	
	// Create student object
	
	//s.setLaptop(laptop);
	
	//s.getLaptop().add(laptop);
	
	// laptop.getstudent().add(s);
	
	// Configuration
	
	// Registry
	
	// Session Factory
	
	// Session save
	
	// Transaction
	
	//for(int i=1; i<=50; i++)
	//{
	// To insert and object... using HQL Lang
	// session.save(s);
	//}
	
	//Query q = session.createQuery("from Student where marks > 50");
	//Student student = (Student) q.uniqueResult();
	
	// print(student)...
	
	//Query q = session.createQuery("select roolno,name,marks from Student where marks > 50");
	//Object[] student = (Object[]) q.uniqueResult();
	
	// for(Student s : student print(s)...
	
	//Query q = session.createQuery("select roolno,name,marks from Student s where s.marks > 50");
	//List<Object[]> student = (List<Object[]>) q.uniqueResult();
		
	// for(Object[] student : Student print(s)...
	
	//session.createQuery("select sum(marks) from Student s where s.marks > :b");
	
	
	// SQL in hibernate...........
	
	// SQLQuery query = session.createSQLQuery("select rollno,marks from student where marks > 60");
	//query.addEntity(Student.class);
	
	// List<Student> students = query.list();
	
	// for(Student o: students)..print(o)..
	
	
	//Alien a1 = session.get(Alien.class, 1);
	//System.out.print(a1.getName());
	
	//Collection<Laptop> laps = a1.getLaps();
	// Run for looopp
	
	//Else you can use Fetch.EAGER
	
	//session.getTransaction().commit(0);
}
