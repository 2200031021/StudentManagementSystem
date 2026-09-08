package com.bank.ListCustomers;

import com.bank.Service;

public class ListCustomers {
public static void listCustomers() {
if(Service.count==0) {
System.out.println("No customers found..");
return;
}
System.out.println("****--List of Customers--****");
for(int i=0;i<Service.count;i++) {
Service.customers[i].displayCustomerDetails();
}
}
}
