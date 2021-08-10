package com.techment.OOPs_Assignment;
class Address1
{
	private String addressLine;
	private String city;
	
	public Address1(String addressLine, String city) {
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
class Customer1
{
	private String customerName;
	Address residentialAddress;
	Address officialAddress;

	public Customer1() {
	}
	
	
	public Customer1(String customerName, Address residentialAddress, Address officialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}


	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	
	
	public Address getOfficialAddress() {
		return officialAddress;
	}

	void getCustomerDetails()
	{
		System.out.println("Residential Address : "+residentialAddress);
		System.out.println("Official Address : "+officialAddress);

	}		
}

public class TestCustomer1 {

	public static void main(String[] args) {
		
		Address addr= new Address("1st Main HSR layout ,Banglore", "Banglore");
		Address addr1= new Address("1st Main Electronics city ,Banglore", "Banglore");
		Customer1 cust1= new Customer1("John",addr,addr1);

	}
}
