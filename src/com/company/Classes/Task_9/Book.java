package com.company.Classes.Task_9;

public class Book {
    public int iD;
    public static int firstID = 1;
    public String title;
    public String author;
    public String publishingHouse;
    public int dateOfPublishing;
    public int pageNumber;
    public float price;
    public String bindingType;

    public Book(String title, String author, String publishingHouse, int dateOfPublishing, int pageNumber, float price, String bindingType) {
        this.iD = firstID++;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.dateOfPublishing = dateOfPublishing;
        this.pageNumber = pageNumber;
        this.price = price;
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "iD=" + iD +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", dateOfPublishing=" + dateOfPublishing +
                ", pageNumber=" + pageNumber +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getDateOfPublishing() {
        return dateOfPublishing;
    }

    public void setDateOfPublishing(int dateOfPublishing) {
        this.dateOfPublishing = dateOfPublishing;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

}
