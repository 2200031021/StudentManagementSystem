package com.bank;

public class Customer {
int customerId;
String customerName;
int customerAge;
String accountNumber;
double balance;

public Customer(int customerId,String customerName,int customerAge,String accountNumber,double balance){
this.customerId=customerId;
this.customerName=customerName;
this.customerAge=customerAge;
this.accountNumber=accountNumber;
this.balance=balance;
}

public int getCustomerId() {
return this.customerId;
}

public String getCustomerName() {
return this.customerName;
}

public int getCustomerAge() {
return this.customerAge;
}

public String getAccountNumber() {
return this.accountNumber;
}

public double getBalance() {
return this.balance;
}

public void setCustomerId(int customerId) {
this.customerId=customerId;
}

public void setCustomerName(String customerName) {
this.customerName=customerName;
}

public void setCustomerAge(int customerAge) {
this.customerAge=customerAge;
}

public void setAccountNumber(String accountNumber) {
this.accountNumber=accountNumber;
}

public void setBalance(double balance) {
this.balance=balance;
}

public void displayCustomerDetails() {
System.out.println("***----Customer Details----***");
System.out.println("Customer Id : "+this.customerId);
System.out.println("Customer Name : "+this.customerName);
System.out.println("Customer Age : "+this.customerAge);
System.out.println("Account Number : "+this.accountNumber);
System.out.println("Balance : "+this.balance);
System.out.println("-----------------------");
}
}
