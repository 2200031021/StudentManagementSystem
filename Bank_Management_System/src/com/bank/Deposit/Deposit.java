package com.bank.Deposit;

import java.util.Scanner;
import com.bank.Service;

public class Deposit {
public static void depositMoney() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Customer Id : ");
int id=sc.nextInt();

for(int i=0;i<Service.count;i++) {
if(id==Service.customers[i].getCustomerId()) {
System.out.println("Enter the amount to deposit:");
double amount=sc.nextDouble();
if(amount<=0) {
System.out.println("Deposit amount must be greater than zero");
return;
}
Service.customers[i].setBalance(Service.customers[i].getBalance()+amount);
System.out.println("Amount deposited successfully...");
System.out.println("Updated Balance : "+Service.customers[i].getBalance());
return;
}
}
System.out.println("No record Found..");
}
}
