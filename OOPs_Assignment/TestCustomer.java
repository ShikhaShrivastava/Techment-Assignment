package com.techment.OOPs_Assignment;

class Address
{
	private String addressLine;
	private String city;
	
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}	
	String getAddressDetails()
	{
		return addressLine+" "+city;
	}
	
}
class Customer
{
	private String customerName;
	Address residentialAddress;
	
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	public Customer() {
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	void getCustomerDetails()
	{
		System.out.println("Customer : "+customerName);
		System.out.println("Residential Address : "+residentialAddress.getAddressDetails());

	}		
}
public class TestCustomer {

	public static void main(String[] args) 
	{
		Address addr= new Address("1st Main HSR layout", "Banglore");
		Customer customer= new Customer();
		customer.setCustomerName("John");
		customer.setResidentialAddress(addr);
		customer.getCustomerDetails();
	}

}
