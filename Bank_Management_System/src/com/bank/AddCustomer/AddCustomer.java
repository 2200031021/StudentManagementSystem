package com.bank.AddCustomer;

import java.util.Scanner;
import com.bank.Service;
import com.bank.Customer;

public class AddCustomer {
public static void addcustomer() {
if(Service.count == Service.customers.length) {
System.out.println("Can't add Customers..limit reached");
return;
}

System.out.println("Enter the customer details:");
Scanner sc=new Scanner(System.in);

System.out.println("Enter the id:");
int id=sc.nextInt();

for(int i=0;i<Service.count;i++) {
if(Service.customers[i].getCustomerId()==id) {
System.out.println("Customer Id already Exist...Try to again");
return;
}
}

System.out.println("Enter the name:");
String name=sc.next();
System.out.println("Enter the age:");
int age=sc.nextInt();
System.out.println("Enter the account number:");
String accountNumber=sc.next();

for(int i=0;i<Service.count;i++) {
if(Service.customers[i].getAccountNumber().equals(accountNumber)) {
System.out.println("Account Number already Exist...Try to again");
return;
}
}

System.out.println("Enter the opening balance:");
double balance=sc.nextDouble();
if(balance<0) {
System.out.println("Balance cannot be negative");
return;
}

Customer c1=new Customer(id,name,age,accountNumber,balance);
Service.customers[Service.count]=c1;
Service.count++;
System.out.println("Customer added successfully...");
}
}
