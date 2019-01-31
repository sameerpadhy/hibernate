package com.sameer.demo.hibenatecompositepkdemo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(Book.IdClass.class)
public class Book {
	
	@Id
    private String name;

    @Id
    private Date publishedDate;

    private Date updatedDate = new Date();
    
    public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", publishedDate=" + publishedDate + ", updatedDate=" + updatedDate + "]";
	}

	public Book(String name, Date publishedDate) {
        this.name = name;
        this.publishedDate = publishedDate;
    }

    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getPublishedDate() {
		return publishedDate;
	}


	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}


	public Date getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

    
    static class IdClass implements Serializable {
        private String name;
        private Date publishedDate;
    }

}
