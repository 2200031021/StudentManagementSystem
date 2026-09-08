package com.bank.UpdateCustomer;

import java.util.Scanner;
import com.bank.Service;

public class UpdateCustomer {
public static void updateCustomer() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Id to Update Customer : ");
int id=sc.nextInt();

for(int i=0;i<Service.count;i++) {
if(id==Service.customers[i].getCustomerId()) {
System.out.println("Enter the new name:");
Service.customers[i].setCustomerName(sc.next());
System.out.println("Enter the new age:");
Service.customers[i].setCustomerAge(sc.nextInt());
System.out.println("Enter the new account number:");
String accountNumber=sc.next();
for(int j=0;j<Service.count;j++) {
if(j!=i && Service.customers[j].getAccountNumber().equals(accountNumber)) {
System.out.println("Account Number already Exist...Try to again");
return;
}
}
Service.customers[i].setAccountNumber(accountNumber);
System.out.println("Customer updated successfully...");
return;
}
}
System.out.println("No record Found..");
}
}
