package com.bank.ViewCustomer;

import java.util.Scanner;
import com.bank.Service;

public class ViewCustomer {
public static void viewCustomer() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Id to View Customer : ");
int id=sc.nextInt();

for(int i=0;i<Service.count;i++) {
if(id==Service.customers[i].getCustomerId()) {
Service.customers[i].displayCustomerDetails();
return;
}
}
System.out.println("No record Found..");
}
}
