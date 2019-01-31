package com.sameer.demo.hibenatebasicdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Address {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    private String street;

	    private String zipCode;

	    @OneToOne(mappedBy = "address")
	    private Library library;

	    public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getZipCode() {
			return zipCode;
		}

		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}

		public Library getLibrary() {
			return library;
		}

		public void setLibrary(Library library) {
			this.library = library;
		}

		public Address(String street, String zipCode) {
	        this.street = street;
	        this.zipCode = zipCode;
	    }

}
