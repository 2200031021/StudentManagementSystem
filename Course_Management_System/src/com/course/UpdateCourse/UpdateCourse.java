package com.course.UpdateCourse;

import java.util.Scanner;
import com.course.Service;

public class UpdateCourse {
public static void updateCourse() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Id to Update Course : ");
int id=sc.nextInt();
for(int i=0;i<Service.count;i++) {
if(id==Service.courses[i].getCourseId()) {
System.out.println("Enter the new name:");
Service.courses[i].setCourseName(sc.next());
System.out.println("Enter the new duration:");
Service.courses[i].setCourseDuration(sc.next());
System.out.println("Enter the new trainer:");
Service.courses[i].setCourseTrainer(sc.next());
System.out.println("Enter the new fee:");
double fee=sc.nextDouble();
if(fee<0) {
System.out.println("Fee cannot be negative");
return;
}
Service.courses[i].setCourseFee(fee);
System.out.println("Course updated successfully...");
return;
}
}
System.out.println("No record Found..");
}
}
