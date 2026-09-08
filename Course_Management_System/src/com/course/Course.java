package com.course;

public class Course {
int courseId;
String courseName;
String courseDuration;
String courseTrainer;
double courseFee;

public Course(int courseId,String courseName,String courseDuration,String courseTrainer,double courseFee){
this.courseId=courseId;
this.courseName=courseName;
this.courseDuration=courseDuration;
this.courseTrainer=courseTrainer;
this.courseFee=courseFee;
}

public int getCourseId() { return this.courseId; }
public String getCourseName() { return this.courseName; }
public String getCourseDuration() { return this.courseDuration; }
public String getCourseTrainer() { return this.courseTrainer; }
public double getCourseFee() { return this.courseFee; }

public void setCourseId(int courseId) { this.courseId=courseId; }
public void setCourseName(String courseName) { this.courseName=courseName; }
public void setCourseDuration(String courseDuration) { this.courseDuration=courseDuration; }
public void setCourseTrainer(String courseTrainer) { this.courseTrainer=courseTrainer; }
public void setCourseFee(double courseFee) { this.courseFee=courseFee; }

public void displayCourseDetails() {
System.out.println("***----Course Details----***");
System.out.println("Course Id : "+this.courseId);
System.out.println("Course Name : "+this.courseName);
System.out.println("Course Duration : "+this.courseDuration);
System.out.println("Course Trainer : "+this.courseTrainer);
System.out.println("Course Fee : "+this.courseFee);
System.out.println("-----------------------");
}
}
