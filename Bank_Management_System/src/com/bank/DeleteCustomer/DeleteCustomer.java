package com.bank.DeleteCustomer;

import java.util.Scanner;
import com.bank.Service;

public class DeleteCustomer {
static Scanner sc=new Scanner(System.in);

public static void deleteCustomer() {
System.out.println("Enter the Id to Delete Customer : ");
int id=sc.nextInt();
int index=-1;

for(int i=0;i<Service.count;i++) {
if(id==Service.customers[i].getCustomerId()) {
index=i;
break;
}
}

if(index==-1) {
System.out.println("No record Found..");
return;
}

for(int i=index;i<Service.count-1;i++) {
Service.customers[i]=Service.customers[i+1];
}
Service.customers[Service.count-1]=null;
Service.count--;
System.out.println("Deleted Successfully...");
}
}
