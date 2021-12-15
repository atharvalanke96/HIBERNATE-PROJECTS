package mappedsuperclass;

import javax.persistence.Entity;

@Entity
public class Contract extends Employee{
	
private float salary;
private String duration;
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
}
