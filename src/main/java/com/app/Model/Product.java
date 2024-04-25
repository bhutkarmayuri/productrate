package com.app.Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/*
@Document(collation = "products")
public class Product {
	
	@Id
	private Integer id;
    private String name;
    private String description;
    private double price;
    private String[] categories;
    private Attribute[] attributes;
    private Avaibility availability;
    private Rating[] ratings;
    
    private List<Rating> rating = new ArrayList<>();
    
	public Product(Integer id, String name, String description, double price, String[] categories,
			Attribute[] attributes, Avaibility availability, Rating[] ratings) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.categories = categories;
		this.attributes = attributes;
		this.availability = availability;
		this.ratings = ratings;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String[] getCategories() {
		return categories;
	}



	public void setCategories(String[] categories) {
		this.categories = categories;
	}



	public Attribute[] getAttributes() {
		return attributes;
	}



	public void setAttributes(Attribute[] attributes) {
		this.attributes = attributes;
	}



	public Avaibility getAvailability() {
		return availability;
	}



	public void setAvailability(Avaibility availability) {
		this.availability = availability;
	}



	public Rating[] getRatings() {
		return ratings;
	}



	public void setRatings(Rating[] ratings) {
		this.ratings = ratings;
	}



	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void addRating(Rating rating2) {
		// TODO Auto-generated method stub
		
	}


*/
@Document(collection = "products")
public class Product {
	
	@Id
	private Integer id;
    private String name;
    private String description;
    private double price;
    private String[] categories;
    private Attribute[] attributes;
    private Avaibility availability;
    private List<Rating> ratings = new ArrayList<>();
    
    public Product(Integer id, String name, String description, double price, String[] categories,
			Attribute[] attributes, Avaibility availability) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.categories = categories;
		this.attributes = attributes;
		this.availability = availability;
	}

	// Getters and setters
    
    
  

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String[] getCategories() {
		return categories;
	}

	public void setCategories(String[] categories) {
		this.categories = categories;
	}

	public Attribute[] getAttributes() {
		return attributes;
	}

	public void setAttributes(Attribute[] attributes) {
		this.attributes = attributes;
	}

	public Avaibility getAvailability() {
		return availability;
	}

	public void setAvailability(Avaibility availability) {
		this.availability = availability;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addRating(Rating rating) {
		this.ratings.add(rating);
		
	}
	

}







    
	
	
    


