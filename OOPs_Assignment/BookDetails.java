package com.techment.OOPs_Assignment;

class Book
{
	private int bookNo;
	private String title;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

class EngineeringBook extends Book
{
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

public class BookDetails {

	public static void main(String[] args) {
		
		Book book=new Book();
		book.setBookNo(1);
		book.setTitle("Brave New World");
		book.setPrice(350);
		EngineeringBook engbook= new EngineeringBook();
		engbook.setCategory("English");
		System.out.println(book.getBookNo());
		System.out.println(book.getTitle());
		System.out.println(book.getPrice()+"/-");
		System.out.println(engbook.getCategory());

	}

}
