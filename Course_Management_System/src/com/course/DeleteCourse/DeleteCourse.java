package com.course.DeleteCourse;

import java.util.Scanner;
import com.course.Service;

public class DeleteCourse {
static Scanner sc=new Scanner(System.in);
public static void deleteCourse() {
System.out.println("Enter the Id to Delete Course : ");
int id=sc.nextInt();
int index=-1;
for(int i=0;i<Service.count;i++) {
if(id==Service.courses[i].getCourseId()) {
index=i;
break;
}
}
if(index==-1) {
System.out.println("No record Found..");
return;
}
for(int i=index;i<Service.count-1;i++) {
Service.courses[i]=Service.courses[i+1];
}
Service.courses[Service.count-1]=null;
Service.count--;
System.out.println("Deleted Successfully...");
}
}
