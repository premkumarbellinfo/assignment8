package assignment8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;


class Student{
	private long id;
	private String name;
	private int marks;
	private double fee;
	
	
public Student(long id, String name, int marks, double fee) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
	this.fee = fee;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(fee);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + marks;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (Double.doubleToLongBits(fee) != Double.doubleToLongBits(other.fee))
		return false;
	if (id != other.id)
		return false;
	if (marks != other.marks)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks
			+ ", fee=" + fee + "]";
}

}
public class Que6and7 {

	public static void main(String[] args) {
		
		Student s1 = new Student(456,"prem",98,400.00);
		Student s2 = new Student(435,"rajeev",99,450.00);
		Student s3 = new Student(426,"Sai",49,550.00);
		
		Student s4 = new Student(426,"Sai",49,550.00);
		HashMap<Integer,Student> hm1 = new HashMap<>(); 
		TreeMap<Integer,Student> tm1 = new TreeMap<>();
		hm1.put(s1.getMarks(),s1);
		hm1.put(s2.getMarks(),s2);
		hm1.put(s3.getMarks(),s3);
		
		tm1.put(s1.getMarks(),s1);
		tm1.put(s2.getMarks(),s2);
		tm1.put(s3.getMarks(),s3);
		
		Set keys = hm1.keySet();
		Set treekeys = tm1.keySet();
		if(keys.contains(98)){
			System.out.println(hm1.get(98));	
		}
		else{
			System.out.println("no key available");
		}
		
		if(hm1.containsValue(s4)){
			System.out.println("yes the value is available");
		}
		else{
			System.out.println("the value is not avialble");
		}
		
		System.out.println("Minimum key in the treeMap is: "+Collections.min(treekeys));
		System.out.println("Maximum key in the treeMap is: "+Collections.max(treekeys));
	}

}
