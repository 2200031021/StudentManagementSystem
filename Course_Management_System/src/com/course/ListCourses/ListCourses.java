package com.course.ListCourses;

import com.course.Service;

public class ListCourses {
public static void listCourses() {
if(Service.count==0) {
System.out.println("No courses found..");
return;
}
System.out.println("****--List of Courses--****");
for(int i=0;i<Service.count;i++) {
Service.courses[i].displayCourseDetails();
}
}
}
