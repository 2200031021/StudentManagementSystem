package com.bank;

import java.util.Scanner;
import com.bank.AddCustomer.AddCustomer;
import com.bank.DeleteCustomer.DeleteCustomer;
import com.bank.ListCustomers.ListCustomers;
import com.bank.UpdateCustomer.UpdateCustomer;
import com.bank.ViewCustomer.ViewCustomer;
import com.bank.Deposit.Deposit;
import com.bank.Withdraw.Withdraw;

public class Main {
public static void welcomeMsg() {
System.err.println("****--Welcome to Bank Management System--****");
System.out.println();
}

public static void selectOptions() {
System.out.println("Select any option to perform : \n");
System.out.println("1. List of customers :");
System.out.println("2. Add customer :");
System.out.println("3. Update customer :");
System.out.println("4. Delete customer :");
System.out.println("5. View customer :");
System.out.println("6. Deposit money :");
System.out.println("7. Withdraw money :");
System.out.println("8. Exit :\n");
}

public static void selectedOption(Scanner sc) {
ListCustomers lc=new ListCustomers();
System.out.println("Enter the option:");
boolean isexit=true;
while(isexit) {
int option=sc.nextInt();
switch(option) {
case 1->{
ListCustomers.listCustomers();
}
case 2->{
System.out.println("add");
AddCustomer.addcustomer();
}
case 3->{
System.out.println("update");
UpdateCustomer.updateCustomer();
}
case 4->{
System.out.println("delete");
DeleteCustomer.deleteCustomer();
}
case 5->{
System.out.println("view");
ViewCustomer.viewCustomer();
}
case 6->{
System.out.println("deposit");
Deposit.depositMoney();
}
case 7->{
System.out.println("withdraw");
Withdraw.withdrawMoney();
}
case 8->{
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
