package com.course;

import java.util.Scanner;
import com.course.AddCourse.AddCourse;
import com.course.DeleteCourse.DeleteCourse;
import com.course.ListCourses.ListCourses;
import com.course.UpdateCourse.UpdateCourse;
import com.course.ViewCourse.ViewCourse;
import com.course.SearchCourse.SearchCourse;

public class Main {
public static void welcomeMsg() {
System.err.println("****--Welcome to Course Management System--****");
System.out.println();
}

public static void selectOptions() {
System.out.println("Select any option to perform : \n");
System.out.println("1. List of courses :");
System.out.println("2. Add course :");
System.out.println("3. Update course :");
System.out.println("4. Delete course :");
System.out.println("5. View course :");
System.out.println("6. Search course :");
System.out.println("7. Exit :\n");
}

public static void selectedOption(Scanner sc) {
System.out.println("Enter the option:");
boolean isexit=true;
while(isexit) {
int option=sc.nextInt();
switch(option) {
case 1->{
ListCourses.listCourses();
}
case 2->{
System.out.println("add");
AddCourse.addcourse();
}
case 3->{
System.out.println("update");
UpdateCourse.updateCourse();
}
case 4->{
System.out.println("delete");
DeleteCourse.deleteCourse();
}
case 5->{
System.out.println("view");
ViewCourse.viewCourse();
}
case 6->{
System.out.println("search");
SearchCourse.searchCourse();
}
case 7->{
System.out.println("Exited.....");
isexit=false;
}
default->{
System.out.println("Invalid option");
}
}
if(isexit) {
System.out.println();
selectOptions();
}
}
}

public static void main(String[] args) {
welcomeMsg();
selectOptions();
Scanner sc=new Scanner(System.in);
selectedOption(sc);
}
}
