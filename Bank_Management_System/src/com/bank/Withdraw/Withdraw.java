package com.bank.Withdraw;

import java.util.Scanner;
import com.bank.Service;

public class Withdraw {
public static void withdrawMoney() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Customer Id : ");
int id=sc.nextInt();

for(int i=0;i<Service.count;i++) {
if(id==Service.customers[i].getCustomerId()) {
System.out.println("Enter the amount to withdraw:");
double amount=sc.nextDouble();
if(amount<=0) {
System.out.println("Withdrawal amount must be greater than zero");
return;
}
if(amount>Service.customers[i].getBalance()) {
System.out.println("Insufficient balance..");
return;
}
Service.customers[i].setBalance(Service.customers[i].getBalance()-amount);
System.out.println("Amount withdrawn successfully...");
System.out.println("Updated Balance : "+Service.customers[i].getBalance());
return;
}
}
System.out.println("No record Found..");
}
}
