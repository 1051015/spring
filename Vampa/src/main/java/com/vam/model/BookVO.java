package com.vam.model;

import java.util.Date;

public class BookVO {
	/* 상품 id, 작가 id, 상품 가격, 상품 재고 */
	private int bookId, authorId, bookPrice, bookStock;
	/* 상품 이름, 작가 이름, 출판일, 출판사, 카테고리 코드, 카테고리 이름, 상품 소개, 상품 목차 */
	private String bookName, authorName, publeYear, publisher, cateCode, cateName, bookIntro, bookContents;
	private double bookDiscount;
	private Date regDate, updateDate;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getBookStock() {
		return bookStock;
	}
	public void setBookStock(int bookStock) {
		this.bookStock = bookStock;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPubleYear() {
		return publeYear;
	}
	public void setPubleYear(String publeYear) {
		this.publeYear = publeYear;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCateCode() {
		return cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public String getBookIntro() {
		return bookIntro;
	}
	public void setBookIntro(String bookIntro) {
		this.bookIntro = bookIntro;
	}
	public String getBookContents() {
		return bookContents;
	}
	public void setBookContents(String bookContents) {
		this.bookContents = bookContents;
	}
	public double getBookDiscount() {
		return bookDiscount;
	}
	public void setBookDiscount(double bookDiscount) {
		this.bookDiscount = bookDiscount;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "BookVO [bookId=" + bookId + ", authorId=" + authorId + ", bookPrice=" + bookPrice + ", bookStock="
				+ bookStock + ", bookName=" + bookName + ", authorName=" + authorName + ", publeYear=" + publeYear
				+ ", publisher=" + publisher + ", cateCode=" + cateCode + ", cateName=" + cateName + ", bookIntro="
				+ bookIntro + ", bookContents=" + bookContents + ", bookDiscount=" + bookDiscount + ", regDate="
				+ regDate + ", updateDate=" + updateDate + "]";
	}
	
	
}
