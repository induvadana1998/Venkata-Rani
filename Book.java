package com.spring.myexam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book 
{
	@Id
	int bid;
	String btitle;
	double price;
	String author;
	public Book() {}
	public Book(int bid, String btitle, double price, String author) 
	{
	
		this.bid = bid;
		this.btitle = btitle;
		this.price = price;
		this.author = author;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
		
	
	

}
